package main

import "fmt"

func main() {
	nums := []int{-10, -3, 0, 5, 9}
	res := sortedArrayToBST(nums)
	fmt.Println(res)
}

// Definition for a binary tree node.
type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func sortedArrayToBST(nums []int) *TreeNode {
	return rec(nums)
}

func rec(arr []int) *TreeNode {
	if len(arr) == 0 {
		return nil
	}
	middleIndex := len(arr) / 2
	node := &TreeNode{Val: arr[middleIndex]}
	//LeftSide
	node.Left = rec(arr[:middleIndex])
	//rightSide
	node.Right = rec(arr[middleIndex + 1:])
	return node
}
