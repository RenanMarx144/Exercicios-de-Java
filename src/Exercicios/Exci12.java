package Exercicios;

import java.util.Scanner;

public class Exci12 {
	public static void main(String[] args) {
		/* exercicio 12 O custo ao consumidor de um carro novo � a soma do custo de
		 * f�brica com a percentagem do distribuidor e dos impostos (aplicados, primeiro
		 * os impostos sobre o custo de f�brica, e depois a percentagem do distribuidor
		 * sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e
		 * os impostos 45%. Escrever um algoritmo que leia o custo de f�brica de um
		 * carro e informe o custo ao consumidor do mesmo.
		 */

		double carroNovo, prFabrica, imposto, juros = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o valor do pre�o de fabrica: ");
		prFabrica = sc.nextInt();
		imposto = prFabrica * 0.45;
		juros = (prFabrica + imposto) * 0.28;
		carroNovo = prFabrica + imposto + juros;
		System.out.printf(
				"Valor do carro novo: %.2f - impostos: %.2f - juros da distribuidora sobre o pre�o com os impostos de - %.2f= %.2f",
				carroNovo, imposto, (prFabrica + imposto), juros);
		sc.close();

	}

}
