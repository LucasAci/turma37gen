package Lista02;

import java.util.Scanner;

public class Lista02ex01 {
	
	//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		int maior;
		
		System.out.println("Digite 3 n�meros inteiros: ");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		if (a > b && a > c) {
			maior = a;
		} else if (b > a && b > c) {
			maior = b;
		}else {
			maior = c;
		}
		
		System.out.println("O maior n�mero �: "+maior+".");
		
	}

}
