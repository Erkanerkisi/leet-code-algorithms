package main

func main() {
	mySqrt(1)
}

func mySqrt(x int) int {
	if x == 0 || x == 1 {
		return x
	}
	low, high := 0, x
	for low < high {
		val := (low + high) / 2
		if val == low {
			return val
		}
		if val*val > x {
			high = val
		} else {
			low = val
		}
	}
	return low
}
