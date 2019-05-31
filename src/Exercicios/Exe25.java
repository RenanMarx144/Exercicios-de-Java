package Exercicios;

import java.util.Scanner;

public class Exe25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o 1 numero: ");
		n1 = sc.nextInt();
		System.out.print("digite o 2 numero: ");
		n2 = sc.nextInt();
		if(n1!=n2) {
			if(n1>n2)System.out.println("numero numero 1 é diferente do numero 2 e o maior numero é: "+ n1);
			else System.out.println("numero numero 1 é diferente do numero 2 e o maior numero é: "+ n2);
		}else System.out.println("numero numero 1 é igual o numero 2: "+ n1+" = " + n2);
		
		
		
		sc.close();

	}

}
