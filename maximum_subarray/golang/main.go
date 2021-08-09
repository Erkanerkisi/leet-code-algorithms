package main

import "fmt"

func main() {
	nums7 := []int{-2, 1, -3, 4, -1, 2, 1, -5, 4}
	fmt.Println(maxSubArray(nums7))
	nums1 := []int{1}
	fmt.Println(maxSubArray(nums1))
	nums2 := []int{5,4,-1,7,8}
	fmt.Println(maxSubArray(nums2))
	nums3 := []int{-1}
	fmt.Println(maxSubArray(nums3))
}

func maxSubArray(nums []int) int {
	result := -10000
	for i := 0; i < len(nums); i++ {
		tmp := 0
		for j := i; j < len(nums); j++ {
			tmp = tmp + nums[j]
			if result < tmp {
				result = tmp
			}
		}
	}
	return result
}
