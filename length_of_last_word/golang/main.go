package main

import "fmt"

func main() {
	fmt.Println(lengthOfLastWord("erkan erk"))
	fmt.Println(lengthOfLastWord("Hello World"))
	fmt.Println(lengthOfLastWord(" "))
	fmt.Println(lengthOfLastWord("a "))
}

func lengthOfLastWord(s string) int {
	leng := 0
	for i := len(s) - 1; i >= 0; i-- {
		if leng > 0 && string(s[i]) == " " {
			break
		} else if string(s[i]) != " " {
			leng++
		}
	}
	return leng
}
