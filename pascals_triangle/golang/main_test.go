package main

import "testing"

func TestGenerate(t *testing.T) {
	expectedResult := [][]int{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}}
	arr := generate(5)
	if arr[0][0] != expectedResult[0][0] ||
		arr[1][1] != expectedResult[1][1] ||
		arr[2][2] != expectedResult[2][2] ||
		arr[3][3] != expectedResult[3][3] ||
		arr[4][4] != expectedResult[4][4] {
		t.Fail()
	}
}
