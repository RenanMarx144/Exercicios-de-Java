package Exercicios;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		// exercicio 4 Escrever um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas
		//por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas
		//efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s.
		Scanner sc = new Scanner(System.in);
		String name;
		int salario, venda, comissao, result;
		System.out.print("digite seu nome: ");
		name = sc.nextLine();
		System.out.print("digite o salario: ");
		salario = sc.nextInt();
		System.out.print("digite as vendas: ");
		venda = sc.nextInt();
		comissao = (int) (venda * 0.15);
		result = comissao + venda;
		System.out.printf("Nome: " +name+ " salario Fixo: "+salario+"\n");
		System.out.printf("vendas: " + venda+ " Salario Final: "+ result);
		sc.close();

	}

}
