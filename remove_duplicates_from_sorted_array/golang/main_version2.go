package main

import "fmt"

func main() {
	// ilk versiyondan 8 kat daha hızlı!!

	nums := []int{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
	removeDuplicates2(nums)
}

func removeDuplicates2(nums []int) int {
	if len(nums) == 0 {
		return 0
	}
	j := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] != nums[i-1] {
			nums[j] = nums[i]
			j++
		}
	}
	fmt.Println(nums)
	return j
}
