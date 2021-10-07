package app;

import java.util.Scanner;

import entities.Pessoa;
import entities.Produto;

public class CadProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa cad1 = new Pessoa();
		Produto p1 = new Produto();
		int quantidade = 0;
		
		System.out.println("Digite o nome nome da pessoa: ");
		cad1.nome = leia.next();
		System.out.println("Digite 1-masculino, 2-feminina, 3-neutre");
		char op = leia.next().charAt(0);
		if (op=='1') {
			cad1.pronome='o';
		}else if (op=='2') {
			cad1.pronome='a';
		}else {
			cad1.pronome='e';
		}
		System.out.println("Digite o código do produto: ");
		p1.codigo = leia.next();
		System.out.println("Digite 1-colocar, 2-retirar: ");
		p1.estoque =leia.nextInt();
		op = leia.next().charAt(0);
		if (op=='1') {
			System.out.println("Digite a quantiade que você deseja inserir: ");
			quantidade = leia.nextInt();
			p1.colocarEstoque(quantidade);
			
		}else if  (op=='2'){
			System.out.println("Digite a quantidade que você deseja retirar: ");
			quantidade = leia.nextInt();
			p1.tirarEstouqe(quantidade);
		}
		
		System.out.println(p1.toString());
		System.out.println(cad1.toString());
	}

}
