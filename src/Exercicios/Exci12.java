package Exercicios;

import java.util.Scanner;

public class Exci12 {
	public static void main(String[] args) {
		/* exercicio 12 O custo ao consumidor de um carro novo é a soma do custo de
		 * fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro
		 * os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor
		 * sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e
		 * os impostos 45%. Escrever um algoritmo que leia o custo de fábrica de um
		 * carro e informe o custo ao consumidor do mesmo.
		 */

		double carroNovo, prFabrica, imposto, juros = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o valor do preço de fabrica: ");
		prFabrica = sc.nextInt();
		imposto = prFabrica * 0.45;
		juros = (prFabrica + imposto) * 0.28;
		carroNovo = prFabrica + imposto + juros;
		System.out.printf(
				"Valor do carro novo: %.2f - impostos: %.2f - juros da distribuidora sobre o preço com os impostos de - %.2f= %.2f",
				carroNovo, imposto, (prFabrica + imposto), juros);
		sc.close();

	}

}
