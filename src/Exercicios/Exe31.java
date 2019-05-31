package Exercicios;

import java.util.Scanner;

public class Exe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
	
		System.out.print("Digite 1 numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite 2 numero: ");
		n2 = sc.nextInt();
		System.out.print("Digite 3 numero: ");
		n3 = sc.nextInt();
		
		if (n1>n2 && n1>n3 && n2>n3) {
			System.out.print("Sequencia de numero em ordem crescente: "+n3+" "+n2+" "+n1);
		}else if(n2>n1&&n2>n3&&n1>n3) {
			System.out.print("Sequencia de numero em ordem crescente: "+n3+" "+n1+" "+n2);
		}else if(n3>n1&&n3>n2&&n1>n2) {
			System.out.print("Sequencia de numero em ordem crescente: "+n2+" "+n1+" "+n3);
		}else if(n1>n2&&n1>n3&&n3>n2) {
			System.out.print("Sequencia de numero em ordem crescente: "+n2+" "+n3+" "+n1);
		}else if(n2>n1&&n2>n3&&n3>n1) {
			System.out.print("Sequencia de numero em ordem crescente: "+n1+" "+n3+" "+n2);
		}
		else System.out.print("Sequencia de numero em ordem crescente: "+n1+" "+n2+" "+n3);
		sc.close();

	}

}
