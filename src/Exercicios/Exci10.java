package Exercicios;

import java.util.Scanner;

public class Exci10 {

	public static void main(String[] args) {
		/* exercicio 10 . A Loja Mam�o com A��car est� vendendo seus produtos em 5
		 * (cinco) presta��es sem juros. Fa�a um algoritmo que receba um valor de uma
		 * compra e mostre o valor das presta��es.
		 */

		double compra, parcela;
		Scanner sc = new Scanner(System.in);
		System.out.print("digiteo valor da compra: ");
		compra = sc.nextInt();
		parcela = compra / 5;
		System.out.printf("valor das 5 parcelas: %.2f cada parcela", parcela);
		sc.close();

	}

}
