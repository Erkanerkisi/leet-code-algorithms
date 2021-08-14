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

	a1 := &TreeNode{Val: 2}
	a2 := &TreeNode{Val: 2}
	b1 := &TreeNode{Val: 1,Left: a2, Right: a1}

	fmt.Println(isSymmetric(b1))
}

// Definition for a binary tree node.
type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isSymmetric(root *TreeNode) bool {
	return rec(root.Left, root.Right)
}

func rec(t1 *TreeNode, t2 *TreeNode) bool {
	if t1 == nil && t2 == nil {
		return true
	}
	if (t1 == nil && t2 != nil) ||
		(t1 != nil && t2 == nil) ||
		(t1.Val != t2.Val) {
		return false
	}
	res := rec(t1.Left, t2.Right)
	res1 := rec(t1.Right, t2.Left)
	return res && res1
}
