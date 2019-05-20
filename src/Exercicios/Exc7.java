package Exercicios;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		//exercicio 7 Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
		//conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperaturaem Celsius.
		
		int f,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite a temperatura em graus Celsius: ");
		c = sc.nextInt();
		f = (9*c+160) / 5;
		System.out.println("Graus Fahrenheit: " + f);
		sc.close();
	}

}
