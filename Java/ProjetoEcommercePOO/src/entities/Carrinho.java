package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	List<Carrinho> carrinho = new ArrayList<>();
	

	//ATRIBUTOS
	private String Produto;
	private String codigo;
	private double valor;
	private int quantidade;
	private double valorTotal;  //varivel para atualizar o valor
	
	int atualizaQuantidade;
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	//CONSTRUTORES
	public Carrinho() {
		super();
	}

	public Carrinho(String produto, String codigo, double valor, int quantidade) {
		super();
		Produto = produto;
		this.codigo = codigo;
		this.valor = valor;
		this.quantidade = quantidade;
		
	
	}

	//ENCAPSULAMENTO
	public String getProduto() {
		return Produto;
	}



	public void setProduto(String produto) {
		Produto = produto;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Boolean verificaCarrinho(String codigo, int quantidade) { // verifica se j� eciste o c�digo q eat� sendo passado no carrinho
		for (Carrinho x : carrinho) {							//se sim, atualiza a quantidade, com o que j� tinha
			if(x.getCodigo().equals(codigo)) {
					atualizaQuantidade =+ x.getQuantidade() + quantidade;
					x.setQuantidade(atualizaQuantidade);     //atualiza o carrinho
					setValorTotal(atualizaQuantidade * x.getValor()); 
					atualizaQuantidade = 0;
					return true;
			}
		} return false;
	}
	
	
	public void entraCarrinho(String produto, String codigo, double valor, int quantidade) {
		if (quantidade == 0) {
			System.out.println("QUANTIDADE INV�LIDA");
			
		}else {
			carrinho.add(new Carrinho(produto, codigo, valor, quantidade));
			if(atualizaQuantidade != 0) {
				double valorTotalCompra =+ getValorTotal() + (valor * atualizaQuantidade);
				setValorTotal(valorTotalCompra);    //set, atualiza o valor total da compra
			} else {
				double valorTotalCompra =+ getValorTotal() + (valor * quantidade);
				setValorTotal(valorTotalCompra);
			}
		}
	}
	
	public void mostraCarrinho() {
		System.out.println();
		System.out.println(" *** CARRINHO *** ");
		System.out.println();
		if (carrinho.isEmpty()) {
			System.out.println("O CARRINHO EST� VAZIO");
		}
		else {
			for (Carrinho x: carrinho) { 
				System.out.printf("" + x.getQuantidade() + " x " + x.getProduto() + "\t Valor Unitario: " + x.getValor() + "\t Valor Total: " + (x.getQuantidade() * x.getValor()) + "\n");
			}																													//mostra o valortal X quantidade
		}
	}
	
	public void mostraCarrinhoNF() {
		System.out.println();
		for (Carrinho x: carrinho) {
			System.out.printf("%d x %s - %2.f\n", x.getQuantidade(),x.getProduto(),x.getValor());
		}
	}
	
	public void limparCarrinho() {
		carrinho.clear();
	}
}
