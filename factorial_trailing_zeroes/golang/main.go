package main

import "fmt"

func main() {
	fmt.Println(trailingZeroes(30))
}

func trailingZeroes(n int) int {
	result := 0
	for n > 0 {
		result = result + n/5
		n = n / 5
	}
	return result
}
