package Exercicios;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		// TODO exercicio 2 Faça um algoritmo que receba dois números e ao final mostre
		// a soma, subtração, multiplicação e a divisão
		// dos números lidos
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
		System.out.println("subitração " + soma2);
		System.out.println("divisão " + soma3);
		System.out.println("multiplicação " + soma4);
		sc.close();
	}

}
