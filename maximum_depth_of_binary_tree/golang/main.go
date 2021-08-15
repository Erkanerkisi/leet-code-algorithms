package main

import "fmt"

func main() {
	/*	a := &TreeNode{Val: 1}
		b := &TreeNode{Val: 2}
		g := &TreeNode{Val: 5}
		h := &TreeNode{Val: 13}

		c := &TreeNode{Val: 1, Left: a, Right: b}
		f := &TreeNode{Val: 8, Left: g, Right: h}
		d := &TreeNode{Val: 3, Left: c, Right: f}

		a1 := &TreeNode{Val: 1}
		b1 := &TreeNode{Val: 2}
		g1 := &TreeNode{Val: 5}
		h1 := &TreeNode{Val: 13}

		c1 := &TreeNode{Val: 1, Left: a1, Right: b1}
		f1 := &TreeNode{Val: 8, Left: g1, Right: h1}
		d1 := &TreeNode{Val: 3, Left: c1, Right: f1}
		fmt.Println(isSameTree(d, d1))
	*/
	/*
		a := &TreeNode{Val: 1}
		b := &TreeNode{Val: 2, Left: a}

		a1 := &TreeNode{Val: 1}
		b1 := &TreeNode{Val: 2, Right: a1}

		fmt.Println(isSameTree(b, b1))*/


	b1 := &TreeNode{Val: 14}

	fmt.Println(maxDepth(b1))
	//fmt.Println(maxDepth(nil))
}

// Definition for a binary tree node.
type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	return recursion(root, 1)
}

func recursion(node1 *TreeNode, a int) int {
	x,y := a,a
	if node1.Left != nil  {
		x = recursion(node1.Left, a + 1)
	}
	if node1.Right != nil  {
		y = recursion(node1.Right, a + 1)
	}
	if x > y {
		return x
	} else {
		return y
	}
}
