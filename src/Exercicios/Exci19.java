package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exci19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m = 0,f = 0;
		int n = 0;
		String[] nome = new String[22];
		nome[0] = "joao";
		nome[1] = "ramon";
        nome[2] = "lucas";
        nome[3] = "carlos";
        nome[4] = "rafael";
        nome[5] = "paulo";
        nome[6] = "pedro";
        nome[7] = "erike";
        nome[8] = "laura";
        nome[9] = "joao";
        nome[10] = "renata";
        nome[11] = "evylin";
        nome[12] = "rebeca";
        nome[13] = "nicole";
        nome[14] = "laura";
        nome[15] = "julha";
        nome[16] = "paula";
        nome[17] = "bruna";
        nome[18] = "kelly";
        nome[19] = "laiz";
        nome[20] = "dora";
        nome[21] = "carol";
		Random r = new Random();
		for (int i = 0; i <=56 ; i++) {
			n = 0 + r.nextInt(21);
			if(n <=10) {
				System.out.println("Nome: " + nome[n]+" - sexo masculino");
				m++;
			}else {System.out.println("Nome: " + nome[n]+" - sexo feminino"); f++;}
		}
		System.out.println();
		System.out.println("quantidade de Homens: " +m);
		System.out.println("quantidade de Mulheres: " +f);

		sc.close();

	}

}
