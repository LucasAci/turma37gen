package Lista01;
import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		
		System.out.print("Hello, World");
		System.out.println("\nI am Lucas!");
		System.out.println("I am from the Generation Brasil.");
		
		Scanner leia = new Scanner(System.in); // � o leia do java
		String nome;
		int anoNascimento;
		double  salario;
		
		System.out.println("Escreva o nome: ");
		nome = leia.next(); // ler caracter
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt(); // ler n�mero inteiro
		System.out.println("Informe o seu sal�rio: ");
		salario = leia.nextDouble();
		
		
		//nome="Lucas";
		//anoNascimento=1994;
		
		System.out.println(nome+", sua idade � "+(2021-anoNascimento)+" anos e seu sal�rio �: "+salario);
	}

}
;