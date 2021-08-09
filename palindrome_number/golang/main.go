package main

import "fmt"

func main() {
	//TEST
	//fmt.Println(isPalindrome(121))
	//fmt.Println(isPalindrome(12321))
	fmt.Println(isPalindrome(-1))
	//fmt.Println(isPalindrome(123454321))
}

func isPalindrome(x int) bool {
	value := x
	var result int
	for {
		result = result*10 + value%10
		value = value / 10
		if value < 1 {
			break
		}
	}
	if result == x && x > 0 {
		return true
	}
	return false
}
