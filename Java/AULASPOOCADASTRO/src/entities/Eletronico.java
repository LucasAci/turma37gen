package entities;

public class Eletronico {
	
	
	
	// ATRIBUTOS
	
	public String nome;
	public String modelo;
	public int unidade;
	public double preco;
	public char formaPagamento;
	
	// MÉTODOS
	
	public void exibirNome() {
		
		System.out.println("O nome do aparelho é: "+nome);
	}
	
	public void exibirModelo() {
		
		System.out.println("O modelo é: "+modelo);
	}
	
	public void exibirUnidade() {
		
		System.out.println("A quantidade solicitada é: "+unidade);
	}
	
	public void exibirPreco() {
		
		System.out.println("O preço do aparelho é: "+preco);
	}
	
	public void exibirPagamento() {
		
if (formaPagamento == 'D') {
			
			System.out.println("Cliente "+nome+",pagará no débito");
			
		}
		else if (formaPagamento == 'C') {
			
			System.out.println("Cliente "+nome+",pagará no crédito");
		}
		else if (formaPagamento == 'E') {
			
			System.out.println("Cliente "+nome+",pagará em espécie");
		}
	}

}
