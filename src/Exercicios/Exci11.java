package Exercicios;

import java.util.Scanner;

public class Exci11 {

	public static void main(String[] args) {
		/* exercicio 11 Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
*/
		
		double prCusto,lucro,prVenda = 0;
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o nome do produto: ");
		nome = sc.nextLine();
		System.out.print("digite o preço de custo: ");
		prCusto = sc.nextInt();
		System.out.print("digite o acréscimo percentual: ");
		lucro = sc.nextInt();
		prVenda = prCusto * lucro/100;
		prVenda += prCusto;
		System.out.println("Nome do produto: "+nome);
		System.out.printf("valor do preço de venda: %.2f" , prVenda);
		sc.close();
	}

}
