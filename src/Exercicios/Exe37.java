package Exercicios;

import java.util.Scanner;

public class Exe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double altura, result = 0.0;
		String name;
		char sexo;
		int idade;
		System.out.print("Digite seu nome: ");
		name = sc.nextLine();
		System.out.println("Digite seu sexo m(Masculino) f(feminino): ");
		sexo = sc.next().charAt(0);
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.print("Digite seu altura: ");
		altura = sc.nextDouble();
		if (sexo == 'm') {
			if (altura > 1.70) {
				if (idade <= 20) {
					result = (72.7 * altura) - 58;
					System.out.println(name + ": " + result);
				} else if (idade > 20 && idade < 40) {
					result = (72.7 * altura) - 53;
					System.out.println(name + ": " + result);
				} else {
					result = (72.7 * altura) - 45;
					System.out.println(name + ": " + result);
				}
			} else {
				if (idade <= 40) {
					result = (72.7 * altura) - 50;
					System.out.println(name + ": " + result);
				} else {
					result = (72.7 * altura) - 58;
					System.out.println(name + ": " + result);
				}
			}
		} else {
			if (altura > 1.50) {
				result = (62.1 * altura) - 44.7;
				System.out.println(name + ": " + result);
			} else {
				if (idade >= 35) {
					result = (62.1 * altura) - 45;
					System.out.println(name + ": " + result);
				} else {
					result = (62.1 * altura) - 49;
					System.out.println(name + ": " + result);
				}

			}
		}
		sc.close();

	}

}
