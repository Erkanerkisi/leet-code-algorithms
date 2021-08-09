package main

import "fmt"

func main() {
	//strng := []string{"flower", "flow", "flight"}
	//strng2 := []string{"dog","racecar","car"}
	strng3 := []string{"a"}

	//fmt.Printf(longestCommonPrefix(strng))
	//fmt.Printf(longestCommonPrefix(strng2))
	fmt.Printf(longestCommonPrefix(strng3))

}

func longestCommonPrefix(strs []string) string {
	var prefix string
	for i := 0; ; i++ {
		var con string
		for _, v := range strs {
			rune := []rune(v)
			if len(rune) == 0 || len(rune) == i {
				return prefix
			}
			letter := string(rune[i])
			if con != "" {
				if con != letter {
					return prefix
				}
			} else {
				con = letter
			}
		}
		prefix = prefix + con
	}
}
