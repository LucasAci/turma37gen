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
		pronome = leia.next().toUpperCase().charAt(0); // � preciso do toUpperCase e o CharAT para ler um char
		System.out.print(nome + " Digite o n�mero de filhos: ");
		qntfilhos = leia.nextInt();
		System.out.print(nome + ", digite [1] para chefa de familia ou [2] para chefe de familia: ");
		chef = leia.nextInt();
		System.out.print("voc� j� recebe algum aux�lio: [S/N]"); // define se vai receber ou n�o
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
				System.out.println("O valor do seu aux�lio �: " + valorTotal);
				
			} else if (chef == 2) {
				valorTotal = AUXILIO + (VALORFILHO * qntfilhos);
				System.out.println("O valor do seu aux�lio �: " + valorTotal);
			}
		} else {
			System.out.println("Voc� j� recebe outro aux�lio.");
		}

	}

}
