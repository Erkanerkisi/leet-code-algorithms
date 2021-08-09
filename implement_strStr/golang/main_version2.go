package main

import "fmt"

func main() {
	fmt.Println(strStr2("mississippi", "issipi"))
}

func strStr2(haystack string, needle string) int {
	if needle == ""{
		return 0
	}
	for i := 0; i < len(haystack); i++ {
		if len(haystack) - i < len(needle) {
			return -1
		}
		if haystack[i] == needle[0] {
			if haystack[i: i+ len(needle)] == needle {
				return i
			}
		}
	}
	return -1
}
