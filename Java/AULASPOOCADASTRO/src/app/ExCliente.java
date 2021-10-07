package app;

import java.util.Scanner;

import entities.Clientes;

public class ExCliente {

	public static void main(String[] args) {
		
		//OBJETO
		Clientes exemplo1 = new Clientes();
		Scanner leia = new Scanner(System.in);
		
		//ENTRADAS
		exemplo1.nome = "Lucas";
		exemplo1.anoNascimento = 1994;
		exemplo1.cpf = 123456789;
		exemplo1.contato = 90901212;
		
		//SAIDA
		exemplo1.exibirNome();
		exemplo1.exibirIdade();
		exemplo1.exibirCpf();
		exemplo1.exibirContato();
		
		System.out.println("O cliente pagara como? digite 'D' para crédito 'C' ou 'E' para espécie: ");
		exemplo1.formaPagamento = leia.next().toUpperCase().charAt(0);
		exemplo1.exibirPagamento();		
		
		

	}

}
