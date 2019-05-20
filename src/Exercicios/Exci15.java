package Exercicios;

import java.util.Scanner;

public class Exci15 {

	public static void main(String[] args) {
		// exercicio 15 Faça um algoritmo que receba um número e diga se este número está no
		// intervalo entre 100 e 200.
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o 1 número: ");
		n1 = sc.nextInt();
		
		if (n1>= 100 && n1<=200) {
			System.out.println("Numero "+n1+" está no invervalo entre 100 e 200");
		}
		else System.out.println("Numero "+n1+" Não está no invervalo entre 100 e 200 ");
		
		sc.close();
	}

}
