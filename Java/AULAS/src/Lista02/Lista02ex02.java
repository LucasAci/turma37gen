package Lista02;

import java.util.Scanner;

public class Lista02ex02 {
	
	// 2- Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite 3 números: ");
		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		n3 = leia.nextDouble();
		
		if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println("Ordem crescente "+n3+"   "+n2+"   "+n1);
		}else if (n1 >= n2 && n1 >= n3 && n3 >= n2 ) {
			System.out.println("Ordem crescente "+n2+"   "+n3+"   "+n1);
		}else if (n2 >= n1 && n2 >= n3 && n1 >= n3 ) {
			System.out.println("Ordem crescente "+n3+"   "+n1+"   "+n2);
		}else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {
			System.out.println("Ordem crescente "+n1+"   "+n3+"   "+n2);
		}else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {
			System.out.println("Ordem crescente "+n2+"   "+n1+"   "+n3);
		}else if (n3 >= n1 && n3 >= n2 && n2 >= n1) {
			System.out.println("Ordem crescente "+n1+"   "+n2+"   "+n3);
		}
		

	}

}
