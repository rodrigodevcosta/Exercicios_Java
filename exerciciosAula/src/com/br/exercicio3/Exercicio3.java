package com.br.exercicio3;

import java.util.Scanner;

public class Exercicio3 {
	Scanner scanner = new Scanner(System.in);

	public void executar() {
		System.out.println("Desenvolver um programa que determine se um estudante foi aprovado em uma disciplina com base nas notas. O aluno é aprovado se a nota for maior ou igual a 60 em ambas as provas.");

		float nota1 = 0;
		float nota2 = 0;

		System.out.println("Entre com a primeira nota");
		nota1 = scanner.nextFloat();
		System.out.println("Entre com a terceira nota");
		nota2 = scanner.nextFloat();

		if (nota1 >= 6 && nota2 >= 6) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
	}

}
