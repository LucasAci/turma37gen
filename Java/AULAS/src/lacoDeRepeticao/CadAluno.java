package lacoDeRepeticao;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// ENTIDADE ALUNO
		String nome[] = new String[4]; // 0 -3 //criado um vetor vazio, tipo string de 4 posi��es
		int nota[] = { 0, 0, 0, 0 }; // 2 forma, j� atrbuindo o valor (a de cima � um vetor vazio
		char disciplinaNota[] = new char[4];
		String disciplina[] = { "1-MATEM�TICA", "2-PORTUGU�S", "3-CI�NCIAS", "4-ARTES", "5-Gepgrafia", "6-Biologia" };

		for (int x = 0; x < 4; x++) {
			System.out.print("Digite o nome do aluno: ");
			nome[x] = leia.next();

			for (int i = 0; i < disciplina.length; i++) { // ou x<4 "lenght" pegao tamanho do vetor
				System.out.print(disciplina[i] + " ");
			}
			System.out.println();
			System.out.print("Digite o codigo da disciplina: ");
			disciplinaNota[x] = leia.next().charAt(0);
			System.out.print("Digite a nota: ");
			nota[x] = leia.nextInt();
			System.out.println("----------------------------------------------");
		}

		for (int y = 0; y < 4; y++) {
			if (disciplinaNota[y] == '1') {
				System.out.println(nome[y] + " NOTA MATEM�TICA " + nota[y]);
			} else if (disciplinaNota[y] == '2') {
				System.out.println(nome[y] + " NOTA PORTUGU�S " + nota[y]);
			}
		}

	}

}
