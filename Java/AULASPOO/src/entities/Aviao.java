package entities;

public class Aviao {
	
	//ATRIBUTOS 
	public String empresa;
	public int capacidade;
	public int anoFabricacao;
	public double valorMercado;
	
	//METODOS
	
	public void exibirNome() {
		
		System.out.println("A empresa é: "+empresa);
	}
	public void exibirCapacidade() {
		
		System.out.println("A capacidade do avião: "+capacidade);
	}
	public void exibirAnoFabricacao() {
		
		System.out.println("O ano de fabricação do avião é: "+anoFabricacao);
	}
	public void exibirvalorMercado() {
		
		System.out.println("O valor de mercado do avião é: "+valorMercado);
	}
	
	@Override
	public String toString() {
		return "Aviao [empresa=" + empresa + ", capacidade=" + capacidade + ", anoFabricacao=" + anoFabricacao
				+ ", valorMercado=" + valorMercado + "]";
	}

}
