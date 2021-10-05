package Lista02;

import java.util.Scanner;

public class Lista02ex01 {
	
	//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		int maior;
		
		System.out.println("Digite 3 números inteiros: ");
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
		
		System.out.println("O maior número é: "+maior+".");
		
	}

}
