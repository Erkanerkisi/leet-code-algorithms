package main

import (
	"fmt"
	"strconv"
)

func main() {
	fmt.Println(reverse(1534236469))

}

func reverse(x int) int {
	value := x
	var negative bool
	if value < 0 {
		negative = true
		value = value * -1
	}
	var string_x string = strconv.Itoa(int(value))
	var result string
	for _, val := range string_x {
		result = string(val)+result
	}
	if val, err := strconv.Atoi(result); err == nil {
		convertedVal := int32(val)
		if int(convertedVal) != val {
			return 0
		}
		if negative {
			return val*-1
		}
		return val
	} else {
		return 0
	}
}