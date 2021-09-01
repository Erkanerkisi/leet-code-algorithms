package main

import "fmt"

func main() {
	fmt.Println(isPerfectSquare(16))
}

func isPerfectSquare(num int) bool {
	result := 0
	for i := 1; result <= num; i = i + 2 {
		if result == num {
			return true
		}
		result += i
	}
	return false
}
