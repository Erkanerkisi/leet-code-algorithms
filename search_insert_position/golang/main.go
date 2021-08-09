package main

import "fmt"

func main() {
	nums := []int{1, 3, 5, 6}
	fmt.Printf("deger: 1 --> %v\n",searchInsert(nums, 2))
	nums1 := []int{1, 3, 5, 6}
	fmt.Printf("deger: 2 --> %v\n",searchInsert(nums1, 5))
	nums3 := []int{1, 3}
	fmt.Printf("deger: 0 --> %v\n",searchInsert(nums3, 0))
	nums4 := []int{1}
	fmt.Printf("deger: 0 --> %v\n",searchInsert(nums4, 0))
	nums5 := []int{1}
	fmt.Printf("deger: 0 --> %v\n",searchInsert(nums5, 1))
	nums6 := []int{1}
	fmt.Printf("deger: 1 --> %v\n",searchInsert(nums6, 2))
	nums7 := []int{1,3}
	fmt.Printf("deger: 2 --> %v\n",searchInsert(nums7, 100))
}
func searchInsert(nums []int, target int) int {
	left:=0
	right:=len(nums) - 1
	for {
		middle := (left + right + 1) / 2
		if nums[middle] == target {
			return middle
		} else if left != right && nums[middle] < target {
			left = middle + 1
		} else if left != right && nums[middle] > target{
			right = middle - 1
		}
		if left == right {
			if nums[right] == target {
				return right
			} else if nums[right] > target {
				return right
			} else {
				return right + 1
			}
		} else if left > right {
			return left
		}
	}

}