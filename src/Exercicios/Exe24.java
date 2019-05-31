package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exe24 {
	 public static int randomInterval(int s, int i) {
	        Random rd = new Random();
	        return rd.nextInt(s - i + 1) + i;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("digite a quantidade de numeros: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {			
			System.out.println(randomInterval(100,-100));
		}
		sc.close();
	}

}
