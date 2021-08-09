package main

import (
	"fmt"
	"strconv"
)
func main() {
	fmt.Println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"))
}


func addBinary(a string, b string) string {
	x := int64(convertBinaryToInt(a))
	y := int64(convertBinaryToInt(b))
	return strconv.FormatInt(x + y, 2)
}

func convertBinaryToInt(s string) int64 {
	if i, err := strconv.ParseInt(s, 2, 64); err != nil {
		return 0
	} else {
		return i
	}
}
