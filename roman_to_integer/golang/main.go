package main

import "fmt"

func main() {
	fmt.Printf("47 -> %v\n", romanToInt("XLVII"))
	fmt.Printf("4 -> %v\n", romanToInt("IV"))
	fmt.Printf("5 -> %v\n", romanToInt("V"))
	fmt.Printf("3 %v\n", romanToInt("III"))
	fmt.Printf("9 -> %v\n", romanToInt("IX"))
	fmt.Printf("58 -> %v\n", romanToInt("LVIII"))
}

func romanToInt(s string) int {
	var sum int
	runes := []rune(s)
	for i := 0; i < len(runes) -1; i++ {
		multiplier := 1
		first, _, decision := compareTwoRoman(string(runes[i]), string(runes[i+1]))
		if !decision {
			multiplier = -1
		}
		sum = sum + multiplier*first
	}
	f, _, _ := compareTwoRoman(string(runes[len(runes)-1]), string(len(runes)-1))
	return sum + f
}

func compareTwoRoman(a string, b string) (int, int, bool) {
	first := convertRomanToInt(a)
	second := convertRomanToInt(b)
	return first, second, convertRomanToInt(a) >= convertRomanToInt(b)
}

func convertRomanToInt(s string) int {
	switch s {
	case "I":
		return 1
	case "V":
		return 5
	case "X":
		return 10
	case "L":
		return 50
	case "C":
		return 100
	case "D":
		return 500
	case "M":
		return 1000
	default:
		return 0
	}
}
