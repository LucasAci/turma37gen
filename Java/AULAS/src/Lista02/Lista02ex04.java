package Lista02;

import java.util.Scanner;

public class Lista02ex04 {
	//4 - Fa�a um programa em que permita a entrada de um n�mero qualquer
	// e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m 
	// a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float num;
		
		System.out.println("Informe um n�mero qualquer: ");
		num = leia.nextFloat();
		
		if (num % 2 == 0) {
			System.out.println(num+" � Par.");
			System.out.println("Sua raiz quadrada �: "+Math.sqrt(num));
			//System.out.printf("%2.f",num);   
		} else {
			System.out.println(num+" � �mpar");
			System.out.println("Sua pot�ncia ao quadrado �: "+Math.pow(num, 2));
			//System.out.printf("%2.f",num);  
		}
		
		
	}

}
