package com.br.exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	Scanner scanner = new Scanner(System.in);

	public void executar() {
		int entrada;
		System.out.println("Entre com um número");
		entrada = scanner.nextInt();
		if (entrada % 4 == 0 && entrada % 100 != 0) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto!");
		}
	}
}
