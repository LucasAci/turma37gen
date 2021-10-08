package app;

import entities.Aviao;

public class exAviao {

	public static void main(String[] args) {
		
		//OBJETO
		Aviao ex2 = new Aviao();
		
		//ENTRADAS
		
		ex2.empresa = "GOL";
		ex2.capacidade = 1000;
		ex2.anoFabricacao = 1970;
		ex2.valorMercado = 10000000.50;
		
		//SAIDAS
		
	//  ex2.exibirNome();					OUTRA FORMA DE EXIBIR
	//	ex2.exibirCapacidade();
	//	ex2.exibirAnoFabricacao();
	//	ex2.exibirvalorMercado();
		
		System.out.println();
		System.out.println(ex2.toString());
	}
	
	
}
