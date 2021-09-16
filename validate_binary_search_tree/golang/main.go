package main

import "fmt"

func main() {
	treeNode := TreeNode{}
	fmt.Println(isValidBST(&treeNode))
}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isValidBST(root *TreeNode) bool {
	return rec(root, -1, -1)
}
func rec(x *TreeNode, min int, max int) bool {
	if x == nil {
		return true
	}
	if (x.Left != nil && x.Left.Val >= x.Val) || (x.Right != nil && x.Right.Val <= x.Val) || !betweenValues(min, max, x.Val) {
		return false
	}
	return rec(x.Left, min, x.Val) && rec(x.Right, x.Val, max)
}

func betweenValues(min int, max int, val int) bool {
	if min != -1 && min >= val {
		return false
	}
	if max != -1 && max <= val {
		return false
	}
	return true
}
