package Exercicios;

import java.util.Scanner;

public class Exe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double desconto , carro , ano, valor;
		int a=0,b=0;
		char option = 0;
		while (option != 'n') {
			System.out.print("digite o valor do carro: ");
			carro = sc.nextDouble();
			System.out.print("digite o ano do carro: ");
			ano = sc.nextDouble();
			if(ano <= 2000) {
				desconto = carro * 0.12;
				valor = carro - desconto;
				System.out.println("Valor do desconto: "+ desconto);
				System.out.println("valor a pagar pelo cliente: " + valor);
				a++;
			}
			else {
				desconto = carro * 0.07;
				valor = carro - desconto;
				System.out.println("Valor do desconto: "+ desconto);
				System.out.println("valor a pagar pelo cliente: " + valor);
				b++;
			}
			
			System.out.print("Gostaria de recaucular (S/N): ");
			option = sc.next().charAt(0);
			System.out.println(option);
		}
		System.out.println();
		System.out.println("nomeros de carros de ano até 2000: " +a);
		System.out.println("numeros de carros no geral: " + (a+b));
		sc.close();

	}

}
