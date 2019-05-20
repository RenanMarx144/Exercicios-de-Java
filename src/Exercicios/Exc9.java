package Exercicios;

import java.util.Scanner;

public class Exc9 {

	public static void main(String[] args) {
		/* exercicio 9 Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
 Considere fixo o juro da poupança em 0,70% a. m.*/
		
		double deposito,mes = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o valor do deposito: ");
		deposito = sc.nextInt();
		mes = deposito * 0.07;
		deposito += mes;
		System.out.printf("Remedimento em um mês %.2f %n" , deposito);
		sc.close();
	}

}
