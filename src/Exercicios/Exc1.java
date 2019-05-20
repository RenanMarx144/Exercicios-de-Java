package Exercicios;


import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		// exercico 1 soma
		int n1,n2,soma;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o numero: ");
		n1 = sc.nextInt();
		System.out.print("digite o 2 numero: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println(soma);
		sc.close();

	}

}
