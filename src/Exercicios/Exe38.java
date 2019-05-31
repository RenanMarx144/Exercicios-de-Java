package Exercicios;

import java.util.Scanner;

public class Exe38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name;
		String result;

		char opc = 'y';
		int nota1, nota2, nota3, media, nota4, nota5, tipo;
		while (opc != 'n') {
			System.out.print("digite seu nome: ");
			name = sc.nextLine();
			System.out.println("digite o tipao de avaliação: 1(Laboratorio) (Avaliação bimestral) 3 (Exame): ");
			tipo = sc.nextInt();
			switch (tipo) {
			case 1:
				System.out.print("digite a 1 nota: ");
				nota1 = sc.nextInt();
				System.out.print("digite a 2 nota: ");
				nota2 = sc.nextInt();
				media = (nota1 + nota2) / 2;
				if (media >= 7)
					result = "Aprovado";
				else
					result = "reprovado";
				System.out.println();
				System.out.printf("Nome: " + name + " media: " + media + " - " + result);
				System.out.println();
				System.out.print("refazer o teste: (s/n)");
				opc = sc.next().charAt(0);
				break;

			case 2:
				System.out.print("digite a 1 nota: ");
				nota1 = sc.nextInt();
				System.out.print("digite a 2 nota: ");
				nota2 = sc.nextInt();
				System.out.print("digite a 3 nota: ");
				nota3 = sc.nextInt();
				media = (nota1 + nota2 + nota3) / 3;
				if (media >= 7)
					result = "Aprovado";
				else
					result = "reprovado";
				System.out.println();
				System.out.printf("Nome: " + name + " media: " + media + " - " + result);
				System.out.println();
				System.out.print("refazer o teste: (s/n)");
				opc = sc.next().charAt(0);
				break;

			case 3:
				System.out.print("digite a 1 nota: ");
				nota1 = sc.nextInt();
				System.out.print("digite a 2 nota: ");
				nota2 = sc.nextInt();
				System.out.print("digite a 3 nota: ");
				nota3 = sc.nextInt();
				System.out.print("digite a 4 nota: ");
				nota4 = sc.nextInt();
				System.out.print("digite a 5 nota: ");
				nota5 = sc.nextInt();
				media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

				if (media >= 7)
					result = "Aprovado";
				else
					result = "reprovado";
				System.out.println();
				System.out.printf("Nome: " + name + " media: " + media + " - " + result);
				System.out.println();
				System.out.print("refazer o teste: (s/n)");
				opc = sc.next().charAt(0);
				break;

			default:
				break;
			}

		}
		sc.close();

	}

}
