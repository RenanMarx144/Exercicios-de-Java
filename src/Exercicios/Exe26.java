package Exercicios;

import java.util.Scanner;

public class Exe26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o numero de 1 à 5: ");
		int n = sc.nextInt();
		if (n >= 1 && n <= 5)
			System.out.println(n);
		else
			System.out.println("Você digitou o numero errado: " + n);
		sc.close();
	}

}
