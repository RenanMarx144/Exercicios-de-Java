package Exercicios;

import java.util.Scanner;

public class Exe40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double result = 0.0;
		String name;
		char grupo;
		int idade;
		System.out.print("Digite seu nome: ");
		name = sc.nextLine();
		System.out.println("Digite o grupo de risco B(baixa) M(media) A(Alta): ");
		grupo = sc.next().charAt(0);
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		if (grupo == 'b') {
			if (idade >= 17 && idade <= 20) {
				result = 1;
				System.out.println(name + " - Grupo de risco Baixa: " + result);
			} else if (idade >= 21 && idade >= 24) {
				result = 2;
				System.out.println(name + " - Grupo de risco Baixa: " + result);
			} else if (idade >= 25 && idade >= 34) {
				result = 3;
				System.out.println(name + " - Grupo de risco Baixa: " + result);
			}
			else if (idade >= 35 && idade >= 64) {
				result = 4;
				System.out.println(name + " - Grupo de risco Baixa: " + result);
			} else if (idade >= 65 && idade >= 70) {
				result = 7;
				System.out.println(name + " - Grupo de risco Baixa: " + result);
			}
			

		} else if (grupo == 'm') {
			if (idade >= 17 && idade <= 20) {
				result = 2;
				System.out.println(name + " - Grupo de risco Média: " + result);
			} else if (idade >= 21 && idade >= 24) {
				result = 3;
				System.out.println(name + " - Grupo de risco Média: " + result);
			} else if (idade >= 25 && idade >= 34) {
				result = 4;
				System.out.println(name + " - Grupo de risco Média: " + result);
			}
			else if (idade >= 35 && idade >= 64) {
				result = 5;
				System.out.println(name + " - Grupo de risco Média: " + result);
			} else if (idade >= 65 && idade >= 70) {
				result = 8;
				System.out.println(name + " - Grupo de risco Média: " + result);
			}
		}

		else {
			if (idade >= 17 && idade <= 20) {
				result = 3;
				System.out.println(name + " - Grupo de risco Alta: " + result);
			} else if (idade >= 21 && idade >= 24) {
				result = 4;
				System.out.println(name + " - Grupo de risco Alta: " + result);
			} else if (idade >= 25 && idade >= 34) {
				result = 5;
				System.out.println(name + " - Grupo de risco Alta: " + result);
			}
			else if (idade >= 35 && idade >= 64) {
				result = 6;
				System.out.println(name + " - Grupo de risco Alta: " + result);
			} else if (idade >= 65 && idade >= 70) {
				result = 9;
				System.out.println(name + " - Grupo de risco Alta: " + result);
			}
		}
		sc.close();
	}

}
