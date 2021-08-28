package main

import "fmt"

func main() {
	d := &ListNode{4,nil}
	c := &ListNode{3,d}
	b := &ListNode{2,c}
	a := &ListNode{1 ,b}
	d.Next = a
	fmt.Println(hasCycle(a))

}

type ListNode struct {
	Val  int
	Next *ListNode
}

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func hasCycle(head *ListNode) bool {
	tmp := head
	memorymap := make(map[*ListNode]string)
	for tmp !=nil {
			if _, ok := memorymap[tmp]; ok {
				return true
			} else {
				memorymap[tmp] = "";
			}
			tmp = tmp.Next
	}
	return false
}
