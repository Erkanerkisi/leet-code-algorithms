package main

import "fmt"

func main() {
	arr := []int{2, 7, 11, 15}
	fmt.Println(twoSum(arr, 9))
}

func twoSum(nums []int, target int) []int {
	result := make([]int, 2, 2)

	for i, v := range nums {
		for j, val := range nums[i+1:] {
			if v+val == target {
				result[0], result[1] = i, i+1+j
				return result
			}
		}
	}
	return nil
}
