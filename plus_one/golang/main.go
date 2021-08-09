package main

import "fmt"

func main() {
	arr := []int{9, 9, 9, 9}
	fmt.Println(plusOne(arr))
	arr2 := []int{0}
	fmt.Println(plusOne(arr2))
	arr3 := []int{1,2}
	fmt.Println(plusOne(arr3))
	arr4 := []int{1, 2 , 9, 9}
	fmt.Println(plusOne(arr4))
}

func plusOne(digits []int) []int {
	lastIndex := len(digits) - 1
	currIndex := lastIndex
	currIndexVal := digits[currIndex]
	for currIndexVal == 9 {
		digits[currIndex] = 0
		if currIndex != 0 {
			currIndex = currIndex - 1
			currIndexVal = digits[currIndex]
		} else {
			digits = append([]int{1}, digits...)
			return digits
		}
	}
	digits[currIndex] = digits[currIndex] + 1
	return digits
}
