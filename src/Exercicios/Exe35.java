package Exercicios;

import java.util.Scanner;

public class Exe35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new  Scanner(System.in);
		int idade;
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		if(idade >= 5 && idade <=7) {
			System.out.println("Infantil A");
		}else if(idade >= 8 && idade <=10) {
			System.out.println("Infantil B");
		}
		else if(idade >= 11 && idade <=13) {
			System.out.println("juvenil A");
		}
		else if(idade >= 14 && idade <=17) {
			System.out.println("juvenil B");
		}
		else if (idade >= 18 && idade <=25){
			System.out.println("Sênior");
		}else System.out.println("idade impropria");
		sc.close();

	}

}
