package Exercicios;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		//exercicio 3 Escrever um algoritmo para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia
		//total percorrida pelo autom�vel e o total de combust�vel gasto.
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
