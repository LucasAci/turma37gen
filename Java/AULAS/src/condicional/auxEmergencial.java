package condicional;

import java.util.Scanner;

public class auxEmergencial {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		char pronome;
		char op;
		int qntfilhos;
		final double AUXILIO = 600.00;
		final double VALORFILHO = 50.00;
		int chef;
		double valorTotal = 0;

		System.out.print("Digite o seu nome: ");
		nome = leia.next(); // faz a leitura de uma String

		System.out.print("Difite o pronome de tratamento A/O/E: ");
		pronome = leia.next().toUpperCase().charAt(0); // é preciso do toUpperCase e o CharAT para ler um char
		System.out.print(nome + " Digite o número de filhos: ");
		qntfilhos = leia.nextInt();
		System.out.print(nome + ", digite [1] para chefa de familia ou [2] para chefe de familia: ");
		chef = leia.nextInt();
		System.out.print("você já recebe algum auxílio: [S/N]"); // define se vai receber ou não
		op = leia.next().toUpperCase().charAt(0);

		if (pronome == 'A' || pronome == 'a') {
			System.out.println("Seja bem vinda Sra " + nome);

		} else if (pronome == 'O' || pronome == 'o') {
			System.out.println("Seja bem vindo Sr " + nome);

		} else if (pronome == 'E' || pronome == 'e') {
			System.out.println("Seja bem vimde " + nome);
		}

		if (op == 'N' || op == 'n') {
			if (chef == 1) {
				valorTotal = (AUXILIO * 2) + (VALORFILHO * qntfilhos);
				System.out.println("O valor do seu auxílio é: " + valorTotal);
				
			} else if (chef == 2) {
				valorTotal = AUXILIO + (VALORFILHO * qntfilhos);
				System.out.println("O valor do seu auxílio é: " + valorTotal);
			}
		} else {
			System.out.println("Você já recebe outro auxílio.");
		}

	}

}
