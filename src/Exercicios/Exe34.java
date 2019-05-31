package Exercicios;

import java.util.Scanner;

public class Exe34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nivel =0;
		String name;
		double valor, aula;
		System.out.print("Nome do Professor: ");
		name = sc.nextLine();
		System.out.print("Quantidade de Aulas: ");
		aula = sc.nextDouble();
		System.out.print("nivel do professor 1,2 ou 3: ");
		nivel = sc.nextInt();
		sc.close();
		if(nivel ==1) {			
			valor = 12 * aula;	
			System.out.println("Professor: "+name+" Nível"+nivel+" R$12,00 por hora/aula valor: " + valor);
		}else if(nivel==2) {
			valor = 17 * aula;
			System.out.println("Professor: "+name+" Nível"+nivel+" R$17,00 por hora/aula valor: " + valor);
		}else {valor = 25 * aula;
		System.out.println("Professor: "+name+" Nível"+nivel+" R$25,00 por hora/aula valor: " + valor);
		}
	}

}
