package Exercicios;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		// 6. Ler dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�vel A passe a
		//possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A. Apresentar os valores
		//trocados.
			
		Scanner sc = new Scanner(System.in);
		int a,b,ab,ba;
		System.out.print("digite o valor do A: ");
		a = sc.nextInt();
		System.out.print("digite o valor do B: ");
		b = sc.nextInt();
		System.out.println("Valor do A: "+a+" | valor do B: "+b );
		ab=b;
		ba = a;
		System.out.println("trocando...");
		System.out.println("valor do A: "+ab +" | valor do B: " +ba);
		sc.close();

	}

}
