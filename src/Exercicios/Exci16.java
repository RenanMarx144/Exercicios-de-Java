package Exercicios;

import java.util.Scanner;



public class Exci16 {
	public static void main(String[] args) {
		/*
		 * exercicio 16 Escrever um algoritmo que leia o nome e as três notas obtidas
		 * por um aluno durante o semestre. Calcular a sua média (aritmética), informar
		 * o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
		 * Recuperação (media entre 5.1 a 6.9).
		 */
		Scanner sc = new Scanner(System.in);
		String name;
		double nota1, nota2, nota3;
		double media;
		System.out.print("digite seu nome: ");
		name = sc.nextLine();
		System.out.print("digite a 1 nota: ");
		nota1 = sc.nextDouble();
		System.out.print("digite a 2 nota: ");
		nota2 = sc.nextDouble();
		System.out.print("digite a 3 nota: ");
		nota3 = sc.nextDouble();
		media = (nota1 + nota2 + nota3) /3;
		String result;
		if(media >= 7) {
			result = "Aprovado";
			}
		else if(media <=5) {
			result = "reprovado";
		}
		else result = "Recuperação";
		System.out.println();
		System.out.printf("Nome: %s \nMédia = %.1f - %s",name,media,result);
		sc.close();

	}

}
