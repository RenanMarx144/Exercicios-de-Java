package Exercicios;

import java.util.Scanner;

public class Exe28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int funcionarios;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite numero de funcionarios: ");
		funcionarios = sc.nextInt();
		String[] name = new String[funcionarios];
		double[] salario, salarioM, reajuste;
		salario = new double[funcionarios];
		salarioM = new double[funcionarios];
		reajuste = new double[funcionarios];
		double soma, slM, sl ,a;
		for (int i = 0; i <= funcionarios - 1; i++) {
			sc.nextLine();
			System.out.println("Nome: ");
			name[i] = sc.nextLine();
			System.out.println("Salario: ");
			sl = sc.nextDouble();
			System.out.println("Salario minimo: ");
			slM = sc.nextDouble();
			soma = sl / slM;
			salario[i] = sl;
			salarioM[i] = slM;
			if (soma <= 3) {
				a = sl * 0.50;
				reajuste[i] = a + sl;
			}else if(soma>3 && soma<=10){
				a = sl * 0.20;
				reajuste[i] = a + sl;
			}else if(soma>10 && soma <= 20) {
				a = sl * 0.15;
				reajuste[i] = a + sl;
			}else {
				a = sl * 0.10;
				reajuste[i] = a + sl;
			}
		}
		System.out.println();
		System.out.println("lista de funcionarios e seus pagamentos: ");
		for (int i = 0; i < reajuste.length; i++) {
			double d = reajuste[i];			
			System.out.printf("Nome: %s - Salario: %.2f - reajuste: %.2f \n",name[i] , salario[i] , d);
		}

		sc.close();
	}

}