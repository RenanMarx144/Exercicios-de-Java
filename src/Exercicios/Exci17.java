package Exercicios;

import java.util.Random;

public class Exci17 {

	public static void main(String[] args) {
		int i = 0;
		Random r = new Random();
		int valor;

		for (int j = 1; j <= 80; j++) {
			valor = 1 + r.nextInt(200);
			System.out.println(j +"� numero: " +valor);
			if (valor >= 10 && valor <= 150)
				i++;
		}
		System.out.println("Dos 80 numeros sortiados os que est�o no intervalo de" + 
		" 10 � 150: " + i);

	}

}
