package com.br.menu;

import com.br.exercicio1.*;
import com.br.exercicio2.*;
import com.br.exercicio3.*;
import com.br.exercicio4.*;
import com.br.exercicio5.*;
import com.br.exercicio6.*;
import com.br.exercicio7.*;
import com.br.exercicio8.*;

import java.util.Scanner;

public class Menu {

	Scanner scanner = new Scanner(System.in);
	Exercicio1 exercicio1 = new Exercicio1();
	Exercicio2 exercicio2 = new Exercicio2();
	Exercicio3 exercicio3 = new Exercicio3();
	Exercicio4 exercicio4 = new Exercicio4();
	Exercicio5 exercicio5 = new Exercicio5();
	Exercicio6 exercicio6 = new Exercicio6();
	Exercicio7 exercicio7 = new Exercicio7();
	Exercicio8 exercicio8 = new Exercicio8();
	

	public void Iniciar() {
		int opc;

		do {
			opc = obterOpc();

			switch (opc) {

			case 1:
				exercicio1.executar();

				break;
			case 2:
				exercicio2.executar();
				break;
			case 3:
				exercicio3.executar();
				break;
			case 4:
				exercicio4.executar();
				break;
			case 5:
				exercicio5.executar();
				break;
			case 6:
				exercicio6.executar();
				break;
			case 7:
				exercicio7.executar();
				break;
			case 8:
				exercicio8.executar();
				break;
			case 0:

				System.out.println("opção SAIR selecionada!");
				break;

			}
		} while (opc != 0);

	}

	public int obterOpc() {

		System.out.println("MENU");
		System.out.println("Exercicio 1");
		System.out.println("Exercicio 2");
		System.out.println("Exercicio 3");
		System.out.println("Exercicio 4");
		System.out.println("Exercicio 5");
		System.out.println("Exercicio 6");
		System.out.println("Exercicio 7");
		System.out.println("Exercicio 8");
		System.out.println("SAIR  0");

		return scanner.nextInt();
	}

}
