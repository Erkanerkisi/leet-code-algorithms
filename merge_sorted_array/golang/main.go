package main

func main() {
	//TEST
/*
	nums1 := []int{1, 2, 3, 0, 0, 0}
	nums2 := []int{2, 5, 6}
	merge(nums1, 3, nums2, 3)
	fmt.Println(nums1)
*/
/*
		nums1 := []int{1}
		nums2 := []int{}
		merge(nums1, 1, nums2, 0)
		fmt.Println(nums1)
	*/
/*
		nums1 := make([]int,2)
		nums2 := []int{1,2}
		merge(nums1, 0, nums2, 2)
		fmt.Println(nums1)
*/
/*
		nums1 := []int{2,0}
		nums2 := []int{1}
		merge(nums1, 1, nums2, 1)
		fmt.Println(nums1)
	*/
}

func merge(nums1 []int, m int, nums2 []int, n int) {
	i := m - 1
	j := n - 1
	for ; j >= 0; {
		if i >= 0 && nums1[i] >= nums2[j] {
			nums1[i+j+1] = nums1[i]
			i--
		} else {
			nums1[i+j+1] = nums2[j]
			j--
		}
	}
}