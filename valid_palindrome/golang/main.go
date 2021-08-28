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
	var left,right string
	runes := []rune(s)
	for i := 0; i < len(runes)/2; i++ {
		if (!unicode.IsLetter(runes[i]) && !unicode.IsNumber(runes[i])) &&
			(unicode.IsLetter(runes[len(runes)-i-1]) || unicode.IsNumber(runes[len(runes)-i-1])) {
			return false
		}
		if (unicode.IsLetter(runes[i]) || unicode.IsNumber(runes[i])) &&
			(unicode.IsLetter(runes[len(runes)-i-1]) && unicode.IsNumber(runes[len(runes)-i-1])) {
			return false
		}
		if strings.ToLower(string(runes[i])) != strings.ToLower(string(runes[len(runes)-i-1])) {
			return false
		}
	}
	return true
}
