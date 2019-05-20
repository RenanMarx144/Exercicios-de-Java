package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exci18 {

	public static void main(String[] args) {
	
		       Scanner sc = new Scanner(System.in);
		        int idade = 0;
		        int n;
		        String[] nome = new String[22];
		        nome[0] = "renan";
		        nome[1] = "ramon";
		        nome[2] = "lucas";
		        nome[3] = "carlos";
		        nome[4] = "rafaela";
		        nome[5] = "paulo";
		        nome[6] = "pamela";
		        nome[7] = "hemyly";
		        nome[8] = "laura";
		        nome[9] = "joao";
		        nome[10] = "ricardo";
		        nome[11] = "evylin";
		        nome[12] = "nicolas";
		        nome[13] = "nicole";
		        nome[14] = "laura";
		        nome[15] = "juca";
		        nome[16] = "pedro";
		        nome[17] = "bruna";
		        nome[18] = "kelly";
		        nome[19] = "laiz";
		        nome[20] = "dora";
		        nome[21] = "carol";
		        Random r = new Random();
		        
		        for (int i = 0; i <= 75; i++) {
		            n = 0 + r.nextInt(21);
		            idade = 1 + r.nextInt(80);
		            if (idade >= 18){
		                System.out.println(i+"# Nome: " +nome[n] + " - idade: " + idade+" anos - maior de idade");
		            }else System.out.println(i+"# Nome: " +nome[n] + " - idade: " + idade+" ano(s) - menor de idade");
		        }
		                       
		        sc.close();
				 

	}

}
