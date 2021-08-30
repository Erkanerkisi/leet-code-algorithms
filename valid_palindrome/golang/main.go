package main

import (
	"fmt"
	"strings"
	"unicode"
)

func main() {
	fmt.Println(isPalindrome("A man, a plan, a canal: Panama"))
}

func isPalindrome(s string) bool {
	runes := []rune(s)
	left := 0
	right := len(runes) - 1
	var tmpLeft, tmpRight string
	for left < right {
		if tmpLeft == "" && unicode.IsLetter(runes[left]) || unicode.IsNumber(runes[left]) {
			tmpLeft = string(runes[left])
		} else if tmpLeft == "" {
			left++
			continue
		}
		if tmpRight == "" && unicode.IsLetter(runes[right]) || unicode.IsNumber(runes[right]) {
			tmpRight = string(runes[right])
		} else if tmpRight == "" {
			right--
			continue
		}
		if tmpLeft != "" && tmpRight != "" && strings.ToLower(tmpLeft) == strings.ToLower(tmpRight) {
			tmpLeft, tmpRight = "", ""
			left++
			right--
		} else if tmpLeft != "" && tmpRight != "" && strings.ToLower(tmpLeft) != strings.ToLower(tmpRight) {
			return false
		}
	}
	return true
}
