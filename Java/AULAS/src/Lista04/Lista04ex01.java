package Lista04;

import java.util.Locale;
import java.util.Scanner;

public class Lista04ex01 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de
		 * uma atividade e o escreva em seguida. Encontre após a maior pontuação e a
		 * apresente.
		 */

		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int[] pontos = new int[5];
		int maiorPontuacao = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com a pontuação: ");
			pontos[i] = leia.nextInt();

			if (pontos[i] > maiorPontuacao) {
				maiorPontuacao = pontos[i];
			}
		}
		System.out.println();
		for (int i=0; i<5; i++) {
			System.out.println("Pontuação "+(i+1)+" = "+pontos[i]);
		}

		System.out.println("A maior pontuação é: " + maiorPontuacao);

	}

}
