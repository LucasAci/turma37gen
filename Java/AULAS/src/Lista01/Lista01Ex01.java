package Lista01;
import java.util.Scanner;

public class Lista01Ex01 {
	
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	// meses e dias e mostre-a expressa apenas em dias. 

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int ianos, totalDias, imeses, idias;
		
		System.out.println("Informe a sua idade em anos: ");
		ianos = leia.nextInt();
		System.out.println("Informe a sua idade em meses: ");
		imeses = leia.nextInt();
		System.out.println("Informe a sua idade em dias: ");
		idias = leia.nextInt();
		
		totalDias = (ianos*365) + (imeses*30) + idias;
		
		System.out.println("A sua idade expressa em dias é: "+ totalDias+ " dias.");
		
		

	}

}
