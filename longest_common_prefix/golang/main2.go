package main

import "fmt"

func main() {
	strng := []string{"flower", "flow", "flight"}
	strng2 := []string{"dog","racecar","car"}
	strng3 := []string{"a"}
	strng4 := []string{"ab", "a"}

	fmt.Printf(longestCommonPrefixa(strng))
	fmt.Printf(longestCommonPrefixa(strng2))
	fmt.Printf(longestCommonPrefixa(strng3))
	fmt.Println("\n")
	fmt.Printf(longestCommonPrefixa(strng4))

}

func longestCommonPrefixa(strs []string) string {
	if len(strs) == 0 || strs[0] == "" {
		return ""
	}
	first := strs[0]
	for i := 1; i <= len(first); i++{
		for j := 1; j < len(strs); j++ {
			if len(strs[j]) < i || first[:i] != strs[j][:i] {
				return first[:i-1]
			}
		}
	}
	return first
}
