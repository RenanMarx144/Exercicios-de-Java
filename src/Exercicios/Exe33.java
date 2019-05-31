package Exercicios;

import java.util.Scanner;

public class Exe33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lado1=0, lado2=0, lado3=0;
		System.out.print("Digite o primeiro lado");
		lado1 = sc.nextInt();
		System.out.print("Digite o segundo lado");
		lado2 = sc.nextInt();
		System.out.print("Digite o terceiro lado");
		lado3 = sc.nextInt();
		if(lado1 == lado2) {
			if(lado1 ==lado2 && lado1 == lado3) {
				System.out.println("Triângulo Equilátero");
			}else System.out.println("Triângulo  Isóscele");
		}else System.out.println("Triângulo Escaleno:");
		sc.close();

	}

}
