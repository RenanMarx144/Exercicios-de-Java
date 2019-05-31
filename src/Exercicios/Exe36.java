package Exercicios;

import java.util.Scanner;

public class Exe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double hwH, valor, result;
		int opc = 0;
		System.out.print("digite o consumo ");
		valor = sc.nextDouble();
		System.out.print("digite o tipo do local: 1(residencia) 2(comercio) 3(indrustria): ");
		opc = sc.nextInt();
		switch (opc) {
		case 1:
			hwH = valor * 0.06;
			result = valor + hwH;
			System.out.println("conta a pagar é: " + result);
			break;
		case 2:
			hwH = valor * 0.068;
			result = valor + hwH;
			System.out.println("conta a pagar é: " + result);
			break;
		case 3:
			hwH = valor * 0.129;
			result = valor + hwH;
			System.out.println("conta a pagar é: " + result);
			break;

		default:
			break;
		}
		sc.close();

	}

}
