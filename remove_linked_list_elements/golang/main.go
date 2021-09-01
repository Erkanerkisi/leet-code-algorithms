package main

import "fmt"

func main() {
	//TEST
	l1_4 := &ListNode{7, nil}
	l1_3 := &ListNode{7, l1_4}
	l1_2 := &ListNode{7, l1_3}
	l1 := &ListNode{7, l1_2}
	fmt.Println(removeElements(l1, 7))

	/*l1_7 := &ListNode{6, nil}
	l1_6 := &ListNode{5, l1_7}
	l1_5 := &ListNode{4, l1_6}
	l1_4 := &ListNode{3, l1_5}
	l1_3 := &ListNode{6, l1_4}
	l1_2 := &ListNode{2, l1_3}
	l1 := &ListNode{1, l1_2}
*/
	//fmt.Println(removeElements(l1, 6))
}

type ListNode struct {
	Val  int
	Next *ListNode
}

func removeElements(head *ListNode, val int) *ListNode {
	list := head
	var prev *ListNode
	current := list
	for current != nil {
		if prev == nil && current.Val == val {
			current = current.Next
			list = current
		} else if current.Val == val {
			prev.Next = current.Next
			current = current.Next
		} else {
			prev = current
			current = current.Next
		}
	}
	return list
}
