package Lista03;

import java.util.Scanner;

public class Lista03ex02 {

//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num, contPar = 0, contImpar = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um número inteiro: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				contPar++;

			} else {
				contImpar++;

			}
		}
		System.out.printf("\nA quantidade de numeros pares é: %d", contPar);
		System.out.printf("\nA quantidade de numeros pares é: %d", contImpar);
	}

}
