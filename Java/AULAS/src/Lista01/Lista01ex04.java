package Lista01;

import java.util.Scanner;

public class Lista01ex04 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, r, s;
		
		System.out.printf("Informe o valor de A, B, C: ");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		r = (a + b);
		r = Math.pow(r, 2);
		
		s = (b + c);
		s = Math.pow(s, 2);
		
		d = (r + s ) / 2;

		System.out.printf("O valor de d é: "+d);
	}

}
