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

		a := &TreeNode{Val: 1}

		a1 := &TreeNode{Val: 2}
		b1 := &TreeNode{Val: 1, Right: a1}

		fmt.Println(isSameTree(a, b1))
}

// Definition for a binary tree node.
type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isSameTree(p *TreeNode, q *TreeNode) bool {
	return recursion(p, q)
}

func recursion(node1 *TreeNode, node2 *TreeNode) bool {
	if node1 == node2 {
		return true
	}
	if node1 == nil || node2 == nil {
		return false
	}
	if node1.Val != node2.Val {
		return false
	}
	return recursion(node1.Left, node2.Left) && recursion(node1.Right, node2.Right)
}
