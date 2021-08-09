package main

import "fmt"

func main() {
	fmt.Println(inorderTraversal(nil))
	/*a := &TreeNode{Val: 1}
	b := &TreeNode{Val: 2}
	g := &TreeNode{Val: 5}
	h := &TreeNode{Val: 13}

	c := &TreeNode{Val: 1, Left: a,Right: b}
	f := &TreeNode{Val: 8, Left: g,Right: h}
	d := &TreeNode{Val: 3, Left: c, Right: f}
	fmt.Println(inorderTraversal(d))*/
}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func inorderTraversal(root *TreeNode) []int {
	result := make([]int, 0)
	if root == nil {
		return result
	}
	return recursive(root, &result)
}

func recursive(root *TreeNode, result *[]int) []int {
	if root.Left != nil {
		recursive(root.Left, result)
		*result = append(*result, root.Val)
		if root.Right != nil {
			recursive(root.Right, result)
		}
	} else if root.Right != nil {
		*result = append(*result, root.Val)
		recursive(root.Right, result)
	} else {
		*result = append(*result, root.Val)
	}
	return *result
}
