package Exercicios;

import java.util.Scanner;

public class Exci11 {

	public static void main(String[] args) {
		/* exercicio 11 Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor de venda. Sabe-se que o
pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio.
*/
		
		double prCusto,lucro,prVenda = 0;
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o nome do produto: ");
		nome = sc.nextLine();
		System.out.print("digite o pre�o de custo: ");
		prCusto = sc.nextInt();
		System.out.print("digite o acr�scimo percentual: ");
		lucro = sc.nextInt();
		prVenda = prCusto * lucro/100;
		prVenda += prCusto;
		System.out.println("Nome do produto: "+nome);
		System.out.printf("valor do pre�o de venda: %.2f" , prVenda);
		sc.close();
	}

}
