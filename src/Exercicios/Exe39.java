package Exercicios;

import java.util.Scanner;

public class Exe39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int nota1, nota2, nota3;
		double media = 0;
		System.out.print("digite seu nome: ");
		name = sc.nextLine();
		System.out.print("digite a 1 nota: ");
		nota1 = sc.nextInt();
		System.out.print("digite a 2 nota: ");
		nota2 = sc.nextInt();
		System.out.print("digite a 3 nota: ");
		nota3 = sc.nextInt();
		media = (nota1 + nota2 + nota3) /3;
		String result = null;
		if(media >= 8.10)
			result = "Aprovado - Classifica��o: A";
		else if(media>=7.8 && media < 8.10) {
			result = "Aprovado - Classifica��o: B";	
		}
		else if(media>=6.7 && media < 7.80) {
			result = "Aprovado - Classifica��o: C";
		}
		else if(media>=5.6 && media < 6.7) {
			result = "Exame - Classifica��o: D";
		}
		else {
			result = "Reprovado - Classifica��o: R";
		}
		System.out.println();
		System.out.printf("Nome: " +name+ " media: "+media+" - "+result);
		sc.close();		
	}

}
