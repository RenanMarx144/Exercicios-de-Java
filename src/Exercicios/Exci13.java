package Exercicios;

import java.util.Scanner;

public class Exci13 {

	public static void main(String[] args) {
		// exercicio 13 Fa�a um algoritmo que receba um n�mero e mostre uma mensagem
		// caso este n�mero seja maior que10
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o n�mero: ");
		n = sc.nextInt();
		if (n > 10) {
			System.out.println("Numero maior que 10: " + n);
		}
		System.out.println("Numero menor ou igual 10: " + n);

		sc.close();

	}

}
