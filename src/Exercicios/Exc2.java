package Exercicios;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		// TODO exercicio 2 Fa�a um algoritmo que receba dois n�meros e ao final mostre
		// a soma, subtra��o, multiplica��o e a divis�o
		// dos n�meros lidos
		Scanner sc = new Scanner(System.in);
		double n1, n2, soma, soma2, soma3, soma4;
		System.out.print("digite o numero: ");
		n1 = sc.nextDouble();
		System.out.print("digite o 2 numero: ");
		n2 = sc.nextDouble();
		soma = n1 + n2;
		soma2 = n1 - n2;
		soma3 = n1 / n2;
		soma4 = n1 * n2;
		System.out.println("soma " + soma);
		System.out.println("subitra��o " + soma2);
		System.out.println("divis�o " + soma3);
		System.out.println("multiplica��o " + soma4);
		sc.close();
	}

}
