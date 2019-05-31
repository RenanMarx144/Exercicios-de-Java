package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int pessoas = 0, idade = 0, aprovados = 0;
		List<Object> list = new ArrayList<>();
		String name;
		char sexo, saude;		
		System.out.print("digite o numeros de pessoas: ");
		pessoas = sc.nextInt();
		for (int i = 0; i <= pessoas; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Digite o Sexo M(masculino) F(Feminino): ");
			sexo = sc.next().charAt(0);
			System.out.print("Digite o estado de Saúde B(Boa) M(Média) R(Ruim): ");
			saude = sc.next().charAt(0);
			System.out.println();
			if(idade >= 18 && sexo =='m' && saude != 'r') {
					list.add(name);
					aprovados++;				
			}
		}
		System.out.println("Quantidade de aprovados: " + aprovados);
		System.out.println("Nome:");
		for (Object object : list) {
			System.out.println(object);
		}
		
		
		sc.close();

	}

}
