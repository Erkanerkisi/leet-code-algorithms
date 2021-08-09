package main

import (
	"fmt"
)

func main() {
	//TEST
	l1_7 := &ListNode{9, nil}
	l1_6 := &ListNode{9, l1_7}
	l1_5 := &ListNode{9, l1_6}
	l1_4 := &ListNode{9, l1_5}
	l1_3 := &ListNode{9, l1_4}
	l1_2 := &ListNode{9, l1_3}
	l1 := &ListNode{9, l1_2}


	l2_4 := &ListNode{9, nil}
	l2_3 := &ListNode{9, l2_4}
	l2_2 := &ListNode{9, l2_3}
	l2 := &ListNode{9, l2_2}

	res := addTwoNumbers(l1, l2)
	fmt.Println(res)
}
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	first, second := l1, l2
	kalan := 0
	elde := 0
	var root *ListNode
	var tmp *ListNode

	for first != nil || second != nil {
		var num1 int
		var num2 int
		if first != nil {
			num1 = first.Val
		}
		if second != nil {
			num2 = second.Val
		}
		kalan = (num1 + num2 + elde) % 10
		elde = (num1 + num2 + elde) / 10
		if tmp != nil {
			res := &ListNode{kalan, nil}
			tmp.Next = res
			tmp = res
		} else {
			res := &ListNode{kalan, nil}
			tmp, root = res, res
		}
		if first != nil {
			first = first.Next
		}
		if second != nil {
			second = second.Next
		}
	}
	if(elde > 0) {
		res := &ListNode{elde, nil}
		tmp.Next = res
		tmp = res
	}
	return root
}

type ListNode struct {
	Val  int
	Next *ListNode
}
