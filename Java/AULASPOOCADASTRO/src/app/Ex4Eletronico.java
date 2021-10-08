package app;

import java.util.Scanner;

import entities.Eletronico;

public class Ex4Eletronico {

	public static void main(String[] args) {
		
		//OBIJETO
		Scanner leia = new Scanner(System.in);
		Eletronico ex4 = new Eletronico();
		
		//ENTRADAS
		ex4.nome = "NoteBook";
		ex4.modelo = "Lenovo";
		ex4.unidade = 1;
		ex4.preco = 5500;
		
		
		//SAÍDAS
		ex4.exibirNome();
		ex4.exibirModelo();
		ex4.exibirUnidade();
		ex4.exibirPreco();
		
		
		System.out.println("Escolha a forma de pagamento, D-débito, C-crédito, E-espécie: ");
		ex4.formaPagamento = leia.next().toUpperCase().charAt(0);
		ex4.exibirPagamento();
		
	}

}
