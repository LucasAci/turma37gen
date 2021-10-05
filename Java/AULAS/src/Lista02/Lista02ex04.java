package Lista02;

import java.util.Scanner;

public class Lista02ex04 {
	//4 - Faça um programa em que permita a entrada de um número qualquer
	// e exiba se este número é par ou ímpar. Se for par exiba também 
	// a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float num;
		
		System.out.println("Informe um número qualquer: ");
		num = leia.nextFloat();
		
		if (num % 2 == 0) {
			System.out.println(num+" é Par.");
			System.out.println("Sua raiz quadrada é: "+Math.sqrt(num));
			//System.out.printf("%2.f",num);   
		} else {
			System.out.println(num+" é Ímpar");
			System.out.println("Sua potência ao quadrado é: "+Math.pow(num, 2));
			//System.out.printf("%2.f",num);  
		}
		
		
	}

}
