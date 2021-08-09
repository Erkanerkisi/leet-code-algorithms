package main

import "fmt"

func main() {
	nums := []int{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
	removeDuplicates(nums)
	//fmt.Println(nums)
}

func removeDuplicates(nums []int) int {

	for i := 1; i <= len(nums); {
		if i >= len(nums) {
			break
		}
		if nums[i] == nums[i-1] {
			nums = append(nums[:i], nums[i+1:]...)
		} else {
			i++
		}
	}
	fmt.Println(nums)
	return len(nums)
}
