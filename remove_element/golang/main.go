package main

import "fmt"

func main() {
	nums := []int{3, 2, 2, 3}
	removeElement(nums, 3)
}

func removeElement(nums []int, val int) int {
	if len(nums) == 0 {
		return 0
	}
	j := 0
	for i := 0; i < len(nums); i++ {
		// eğer rakam farklı ise j arttır.
		// eğer rakam eşit ise, son element değil ise swap yap, son element ise bişey yapma
		if nums[i] != val {
			j++
		} else {
			if i < len(nums)-1 && nums[i+1] != val {
				nums[j] = nums[i+1]
				nums[i+1] = val
				j++
			}
		}
	}
	fmt.Println(nums)
	fmt.Println(j)
	return j
}
