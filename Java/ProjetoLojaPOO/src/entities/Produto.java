package entities;

public class Produto {
	
	//ATIBUTOS
	private String produto;
	private String codigo;
	private double valor;
	private int estoque;
	
	//CONSTRUTORES
	
	public Produto(String produto, String codigo, double valor, int estoque) {
		super();
		this.produto = produto;
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
	}

	//ENCAPSULAMENTO
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
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

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void retirarEstoque(int quantidade) {
		if(quantidade > estoque) {
			System.out.println("Quantidade indisponivel");
			
		}else {
			
			this.estoque = this.estoque - quantidade;
		}
	}
	
	//MÉTODOS
	
	public void incluEstoque(int quantidade) {
		if ( quantidade <= 0 ) {
			System.out.println("Quantidade incorreta.Tente novamente!");
			
		}else {
			
			this.estoque = this.estoque + quantidade;
		}
	}
	
	
	

}
