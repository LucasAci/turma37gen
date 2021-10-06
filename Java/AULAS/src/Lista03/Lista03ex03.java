package Lista03;

import java.util.Scanner;

public class Lista03ex03 {
	/*
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
	 * de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 * idade for =-99.
	 */
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade, idadeMais50 = 0, idadeMenos21 = 0;

		System.out.println("Informe a sua idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			System.out.println("Informe a sua idade: ");
			idade = leia.nextInt();

			if (idade < 21) {
				idadeMenos21++;

			} else if (idade > 50) {
				idadeMais50++;
			}
		}

		System.out.printf("Total de pessoas com mais de 50 anos %d: \nTotal de pessoas com menos de 21 anos %d: ",idadeMais50, idadeMenos21);
		// System.out.printf("%d tem menos de 21 anos e %d tem mais de 50 anos.",idadeMenos21 ,idadeMais50);
	}

}
