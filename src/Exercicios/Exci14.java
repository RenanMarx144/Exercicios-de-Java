package Exercicios;

import java.util.Scanner;

public class Exci14 {

	public static void main(String[] args) {
		// exercicio 14 Escrever um algoritmo que leia dois valores inteiro distintos e informe qual é omaior.
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o 1 número: ");
		n1 = sc.nextInt();
		System.out.print("digite o 2 número: ");
		n2 = sc.nextInt();
		if (n1>n2) {
			System.out.println("Numero "+n1+" é maior que: " + n2);
		}else if (n1<n2) {
			System.out.println("Numero "+n2+" é maior que: " + n1);
		}else System.out.println("Numero "+n1+" é igual a: " + n2);
		
		sc.close();

	}

}
