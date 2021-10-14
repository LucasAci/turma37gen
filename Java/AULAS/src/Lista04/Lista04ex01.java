package Lista04;

import java.util.Locale;
import java.util.Scanner;

public class Lista04ex01 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de
		 * uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a
		 * apresente.
		 */

		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int[] pontos = new int[5];
		int maiorPontuacao = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com a pontua��o: ");
			pontos[i] = leia.nextInt();

			if (pontos[i] > maiorPontuacao) {
				maiorPontuacao = pontos[i];
			}
		}
		System.out.println();
		for (int i=0; i<5; i++) {
			System.out.println("Pontua��o "+(i+1)+" = "+pontos[i]);
		}

		System.out.println("A maior pontua��o �: " + maiorPontuacao);

	}

}
