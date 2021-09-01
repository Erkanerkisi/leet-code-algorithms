package main

import (
	"fmt"
	"strconv"
)

func main() {
	fmt.Println(isHappy(19))
}

func isHappy(n int) bool {
	values := make(map[string]int)
	valueString := strconv.Itoa(n)
	for {
		if _, ok := values[valueString]; ok {
			return false
		}
		result := 0
		for i := 0; i < len(valueString); i++ {
			in, _ := strconv.Atoi(string(valueString[i]))
			result += in * in
		}
		if result == 1 {
			return true
		} else {
			values[valueString] = 1
			valueString = strconv.Itoa(result)
		}
	}
}
