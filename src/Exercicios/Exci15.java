package Exercicios;

import java.util.Scanner;

public class Exci15 {

	public static void main(String[] args) {
		// exercicio 15 Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no
		// intervalo entre 100 e 200.
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o 1 n�mero: ");
		n1 = sc.nextInt();
		
		if (n1>= 100 && n1<=200) {
			System.out.println("Numero "+n1+" est� no invervalo entre 100 e 200");
		}
		else System.out.println("Numero "+n1+" N�o est� no invervalo entre 100 e 200 ");
		
		sc.close();
	}

}
