package Exercicios;

import java.util.Scanner;

public class Exci14 {

	public static void main(String[] args) {
		// exercicio 14 Escrever um algoritmo que leia dois valores inteiro distintos e informe qual � omaior.
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o 1 n�mero: ");
		n1 = sc.nextInt();
		System.out.print("digite o 2 n�mero: ");
		n2 = sc.nextInt();
		if (n1>n2) {
			System.out.println("Numero "+n1+" � maior que: " + n2);
		}else if (n1<n2) {
			System.out.println("Numero "+n2+" � maior que: " + n1);
		}else System.out.println("Numero "+n1+" � igual a: " + n2);
		
		sc.close();

	}

}
