package main

import "fmt"

func main() {
/*	a := &ListNode{Val: 1}
	b := &ListNode{Val: 1}
	g := &ListNode{Val: 2}
	h := &ListNode{Val: 3}
	c := &ListNode{Val: 3}
	a.Next = b
	b.Next = g
	g.Next = h
	h.Next = c
	fmt.Println(deleteDuplicates(a))*/
	a := &ListNode{Val: 1}
	b := &ListNode{Val: 1}
	g := &ListNode{Val: 1}
	a.Next = b
	b.Next = g
	fmt.Println(deleteDuplicates(a))
}

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteDuplicates(head *ListNode) *ListNode {
	currNode := head
	for currNode != nil && currNode.Next != nil {
		if currNode.Val == currNode.Next.Val {
			currNode.Next = currNode.Next.Next
		} else {
			currNode = currNode.Next
		}
	}
	return head
}

type ListNode struct {
	Val  int
	Next *ListNode
}
