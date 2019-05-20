package Exercicios;

import java.util.Scanner;

public class Exc8 {

	public static void main(String[] args) {
		/* exercicio 8 Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
disponíveis com o usuário*/
		double real,dolar;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o valor em reais: ");
		real = sc.nextInt();
		dolar = real /3.95;
		System.out.printf("Valor em dolar: %.2f %n" , dolar);
		sc.close();
		
	}

}
