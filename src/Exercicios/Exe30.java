package Exercicios;

import java.util.Scanner;

public class Exe30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double bruto, liquido, abono;
		String name;
		char sexo;
		int idade;
		System.out.print("Digite seu nome: ");
		name = sc.nextLine();
		System.out.println("Digite seu sexo m(Masculino) f(feminino): ");
		sexo = sc.next().charAt(0);
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.print("Digite seu salario: ");
		bruto = sc.nextDouble();
		if(sexo == 'm') {
			if(idade>=30) {
				abono = 100;
				liquido = bruto - abono;
				System.out.println("Nome: " + name);
				System.out.println("O seu salario líquido: " + liquido);
			}else {
				abono = 50;
				liquido = bruto - abono;
				System.out.println("Nome: " + name);
				System.out.println("O seu salario líquido: " + liquido);
			}
		}else {
			if(idade>=30) {
				abono = 200;
				liquido = bruto - abono;
				System.out.println("Nome: " + name);
				System.out.println("O seu salario líquido: " + liquido);
			}else {
				abono = 80;
				liquido = bruto - abono;
				System.out.println("Nome: " + name);
				System.out.println("O seu salario líquido: " + liquido);
			}
		}
		sc.close();

	}

}
