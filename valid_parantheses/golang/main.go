package main

import "fmt"

func main() {
	fmt.Println(isValid("()"))
	fmt.Println(isValid("()[]{}"))
	fmt.Println(isValid("(]"))
	fmt.Println(isValid("((){[]})"))
}

func isValid(s string) bool {

	var queue Stack
	innermap := make(map[string]string)
	innermap["("] = ")"
	innermap["{"] = "}"
	innermap["["] = "]"

	outermap := make(map[string]string)
	outermap[")"] = "("
	outermap["}"] = "{"
	outermap["]"] = "["

	if len(s)%2 != 0 {
		return false
	}

	for _, val := range s {
		// inner isefor _, val := range string_x {
		if _, ok := innermap[string(val)]; ok {
			queue.push(string(val))
		} else {
			if queue.checkLastElementIsEqual(outermap[string(val)]) {
				queue.pop()
			} else {
				return false
			}
		}
	}
	if queue.isEmpty() {
		return true
	}
	return false
}

type Stack []string

func (s *Stack) push(val string) {
	*s = append(*s, val)
}

func (s *Stack) isEmpty() bool {
	return s == nil || len(*s) == 0
}

func (s *Stack) pop() (string, bool) {
	if s.isEmpty() {
		return "", false
	} else {
		index := len(*s) - 1
		value := (*s)[index]
		*s = (*s)[:index]
		return value, true
	}
}

func (s *Stack) checkLastElementIsEqual(str string) bool {
	if s.isEmpty() {
		return false
	} else {
		index := len(*s) - 1
		value := (*s)[index]
		if value == str {
			return true
		}
		return false
	}
}
