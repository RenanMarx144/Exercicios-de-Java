package Exercicios;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		//exercicio 3 Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
		//total percorrida pelo automóvel e o total de combustível gasto.
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, result;
		System.out.print("digite o combustivio gasto: ");
		n1 = sc.nextDouble();
		System.out.print("digite a distancia percorrida: ");
		n2 = sc.nextDouble();
		result = n1 / n2;
		System.out.println(result);
		sc.close();

	}

}
