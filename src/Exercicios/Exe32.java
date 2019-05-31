package Exercicios;

import java.util.Scanner;

public class Exe32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b,result=0;
		char c;
		System.out.print("digite o 1 numero: ");
		a = sc.nextInt();
		System.out.print("digite o perador(+ - / *): ");
		c = sc.next().charAt(0);
		System.out.print("digite o 2 numero: ");
		b = sc.nextInt();
		if(c == '+'||c == '-'||c == '/'||c == '*') {
			if(c=='+') {
				result = a + b;
				System.out.println("resultado: " + result);
			}
			else if(c=='-') {
				result = a - b;
				System.out.println("resultado: " + result);
			}
			else if(c=='/') {
				if(b != 0) {
				result = a / b;
				System.out.println("resultado: " + result);
				}else System.out.println("opração não divisivel por \"0\"");
			}
			else {result = a * b;
			System.out.println("resultado: " + result);}
		}else System.out.println("operador não é um dos caracter mencionados como (+ - / *)");
		sc.close();

	}

}
