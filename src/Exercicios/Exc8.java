package Exercicios;

import java.util.Scanner;

public class Exc8 {

	public static void main(String[] args) {
		/* exercicio 8 Elaborar um algoritmo que efetue a apresenta��o do valor da convers�o em real (R$) de um valor lido em
d�lar (US$). O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
dispon�veis com o usu�rio*/
		double real,dolar;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o valor em reais: ");
		real = sc.nextInt();
		dolar = real /3.95;
		System.out.printf("Valor em dolar: %.2f %n" , dolar);
		sc.close();
		
	}

}
