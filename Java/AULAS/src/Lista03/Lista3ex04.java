package Lista03;

import java.util.Scanner;

public class Lista3ex04 {

	public static void main(String[] args) {

		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
		 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: (WHILE)  o número de pessoas calmas;  o
		 * número de mulheres nervosas;  o número de homens agressivos;  o número de
		 * outros calmos;  o número de pessoas nervosas com mais de 40 anos;  o número
		 * de pessoas calmas com menos de 18 anos.
		 */

		// variaves
		Scanner leia = new Scanner(System.in);
		int idade;
		char sexo; // (1-feminino / 2-masculino / 3-Outros)
		char opcao; // (1,pessoa calma; 2, pessoa nervosa 3,pessoa agressiva)
		int pessoasCalmas;
		int mulheresNervorsas;
		int homensAfressivos;
		int outrosCalmos;
		int pessoasNervorsasAcina40Anos; // Por costume entendemos 40 para cima
		int pessoasCalmasMenos18Anos;
		char op = 'S';
		int contadorHabitantes = 1;

		// entradas
		while (op == 'S' && contadorHabitantes < 150) {
			System.out.println("Habitante Número"+contadorHabitantes);
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Escolha:\n1-feminino\n2-masculino\n3-Outros)");
			sexo = leia.next().charAt(0);
			System.out.println("Escolha: \n1-pessoa  calma; \n2-pessoa  nervosa \n3-pessoa agressiva");
			opcao = leia.next().charAt(0);
			//opcao = leia.next().charAt(0);
			System.out.println("Continuar S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			contadorHabitantes++;
		}

	}
}
