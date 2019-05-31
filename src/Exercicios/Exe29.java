package Exercicios;

import java.util.Scanner;

public class Exe29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String[] mes = new String[12];
		int n;
		mes[0] = "Janeiro";
		mes[1] = "fevereiro";
		mes[2] = "março";
		mes[3] = "abril";
		mes[4] = "maio";
		mes[5] = "junho";
		mes[6] = "julho";
		mes[7] = "agosto";
		mes[8] = "setrembro";
		mes[9] = "outubro";
		mes[10] = "novembro";
		mes[11] = "desembro";
		System.out.print("digite o numero do mês: ");
		n = sc.nextInt() - 1;
		if(n>=0 && n <= 11) {
			System.out.println((n + 1)+" Mês:  " + mes[n]);			
		}else System.out.println("Mês Invalido:" + n);
			
		sc.close();

	}

}
