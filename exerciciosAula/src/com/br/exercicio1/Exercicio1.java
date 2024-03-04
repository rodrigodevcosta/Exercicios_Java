package com.br.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	Scanner scanner = new Scanner(System.in);
	float num;

	public void executar() {
		System.out.println("Programa Verifica se o numero é positivo e ímpar ao mesmo tempo");
		System.out.println("Entre com um numero");
		num = scanner.nextFloat();
		if (num >= 0 && num % 2 != 0) {
			System.out.println("O numero é positivo e ímpar! ");
		} else {
			System.out.println("O numero não é positivo ou é par!");
		}

	}
}
