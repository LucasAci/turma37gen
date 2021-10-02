package Lista01;
import java.util.Scanner;

public class Lista01ex05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("Informe as 3 notas do aluno: ");
		nota1 = leia.nextDouble();
		nota2 = leia.nextDouble();
		nota3 = leia.nextDouble();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.println("A média do aluno é: "+media+".");
		
		
		

	}

}
