package main

func main() {
	generate(5)
}

func generate(numRows int) [][]int {
	result := make([][]int, numRows)
	for i := 0; i < numRows; i++ {
		arr := make([]int, i+1)
		arr[i] = 1
		arr[0] = 1
		for j := 1; j < i; j++ {
			arr[j] = result[i-1][j-1] + result[i-1][j]
		}
		result[i] = arr
	}
	return result
}
