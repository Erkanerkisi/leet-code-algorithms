package main

import "fmt"

func main() {
	fmt.Println(climbStairs(0))
}

func climbStairs(n int) int {
	first := 0
	second := 1
	if n == 0 {
		return first
	} else if n == 1 {
		return second
	}
	result := 0
	for i := 1; i <= n; i++ {
		result = first + second
		first = second
		second = result
	}
	return result
}
