package main

import "fmt"

func main() {
	fmt.Println(strStr("a", "a"))
}

func strStr(haystack string, needle string) int {
	if needle == ""{
		return 0
	}
	M := len(needle)
	for i := 0; i <= len(haystack) - M; i++ {
			if haystack[i: i + M] == needle {
				return i
			}
	}
	return -1
}
