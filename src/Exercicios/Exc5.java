package Exercicios;

import java.util.Scanner;

public class Exc5 {
	
	
	public static void main(String[] args) {
		//5. Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
		//No final informar o nome do aluno e a sua média (aritmética).
		
		Scanner sc = new Scanner(System.in);
		String name;
		int nota1, nota2, nota3, media;
		System.out.print("digite seu nome: ");
		name = sc.nextLine();
		System.out.print("digite a 1 nota: ");
		nota1 = sc.nextInt();
		System.out.print("digite a 2 nota: ");
		nota2 = sc.nextInt();
		System.out.print("digite a 3 nota: ");
		nota3 = sc.nextInt();
		media = (nota1 + nota2 + nota3) /3;
		String result;
		if(media >= 7)
			result = "Aprovado";
		else result = "reprovado";
		System.out.println();
		System.out.printf("Nome: " +name+ " media: "+media+" - "+result);
		sc.close();
	}


}
