package Exercicios;

import java.util.Random;

public class Exe23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] prCusto, prVenda;
		prCusto = new int[40];
		prVenda = new int[40];
		for (int i = 0; i <=39; i++) {
			int n = 100 + r.nextInt(1500);
			int m = 200 + r.nextInt(2000);
			prCusto[i] = n;
			prVenda[i]= m;
		}
		for (int i = 0; i <= 39; i++) {
			if(prCusto[i] < prVenda[i] ) {
				System.out.println("Produto lucrado");
			}else if(prCusto[i] > prVenda[i]) {
				System.out.println("Produto no prejuiso");
			}
			else System.out.println("Produto no empate");
		}
		

	}

}
