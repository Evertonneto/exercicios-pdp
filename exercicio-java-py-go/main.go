package main

import (
	"fmt"
)

func main() {
	codigoProd := 9
	quantidade := 5
	var preco float32 = 0

	i := 0
	for i != 1 {
		if codigoProd == 1 {
			preco = 0.5
		} else if codigoProd == 2 {
			preco = 1.0
		} else if codigoProd == 3 {
			preco = 4.0
		} else if codigoProd == 5 {
			preco = 7.0
		} else if codigoProd == 9 {
			preco = 8.0
		}
		total := preco * float32(quantidade)
		fmt.Println(total)
		i = 1
	}

}
