package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Lista01ex06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de x1: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de x1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de x1: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y1-y2),2));
		
		System.out.printf("%.2f O valor de d é: ",d);
	}

}
