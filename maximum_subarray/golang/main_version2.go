package main

import (
	"fmt"
)

func main() {
	nums7 := []int{-2, 1, -3, 4, -1, 2, 1, -5, 4}
	fmt.Println(maxSubArray2(nums7))
	nums1 := []int{1}
	fmt.Println(maxSubArray2(nums1))
	nums2 := []int{5,4,-1,7,8}
	fmt.Println(maxSubArray2(nums2))
	nums3 := []int{-1}
	fmt.Println(maxSubArray2(nums3))
}

func maxSubArray2(nums []int) int {
	sum := nums[0]
	maximum := nums [0]

	for _, val := range nums[1:] {
		if sum < 0 {
			sum = val
		} else {
			sum = sum + val
		}
		if maximum < sum {
			maximum = sum
		}
	}
	return maximum
}
