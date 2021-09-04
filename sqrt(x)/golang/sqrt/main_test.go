package main

import (
	"testing"
)

func TestMySqrt(t *testing.T) {
	result := mySqrt(8)
	if result != 2 {
		t.Fail()
	}
}


func TestMySqrt2(t *testing.T) {
	result := mySqrt(4)
	if result != 2 {
		t.Fail()
	}
}

func TestMySqrt3(t *testing.T) {
	result := mySqrt(16)
	if result != 4 {
		t.Fail()
	}
}

func TestMySqrt4(t *testing.T) {
	result := mySqrt(20)
	if result != 4 {
		t.Fail()
	}
}


func TestMySqrt5(t *testing.T) {
	result := mySqrt(110)
	if result != 10 {
		t.Fail()
	}
}

func TestMySqrt6(t *testing.T) {
	result := mySqrt(1)
	if result != 1 {
		t.Fail()
	}
}