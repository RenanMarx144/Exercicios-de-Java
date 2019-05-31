package Exercicios;

import java.util.Scanner;

public class Exe27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double desconto, carro, valor;
		char option = 0;
		while (option != 'n') {
			System.out.print("digite o valor do carro: ");
			carro = sc.nextDouble();
			System.out.print("digite o tipo  de combustivel 1(gasolina) 2(alcool) 3(disel): ");
			int combustivel = sc.nextInt();
			switch (combustivel) {
			case 1:
				desconto = carro * 0.21;
				valor = carro - desconto;
				System.out.println("preço do carro: " + carro + " - valor do Desconto: " + desconto);
				System.out.println("Preço a pagar pelo cliente: " + valor);
				break;
			case 2:
				desconto = carro * 0.21;
				valor = carro - desconto;
				System.out.println("preço do carro" + carro + " - valor do Desconto: " + desconto);
				System.out.println("Preço a pagar pelo cliente: " + valor);
				break;
			case 3:
				desconto = carro * 0.21;
				valor = carro - desconto;
				System.out.println("preço do carro: " + carro + " - valor do Desconto: " + desconto);
				System.out.println("Preço a pagar pelo cliente: " + valor);
				break;
			default:
				break;
			}
			System.out.print("Gostaria de recaucular (S/N): ");
			option = sc.next().charAt(0);
			
		}
		System.out.println("Termino do programa");
		sc.close();
	}
}
