package entities;

import java.text.DecimalFormat;

public class Loja {
	DecimalFormat df = new DecimalFormat("#.00");

	public void menuPagamento() {
		System.out.println("Formas de pagamento: ");
		System.out.println("1 - � vista com 10% de desconto: ");
		System.out.println("2 - No cart�o de cr�dito em 1x (10% de acr�scimo");
		System.out.println("3 - No cart�o de cr�dito em 2x (15% de acr�scimo");
		System.out.println("Informe a forma de pagamento [ 1 | 2 | 3 ]: ");
	}

	public void formaPagamento(char formaPagamento, double valorTotal) {

		double imposto = valorTotal;

		if (formaPagamento == '1') {
			valorTotal = valorTotal * 0.9;
			System.out.print("\n\t\t   * NOTA FISCAL *\n\n");
			System.out.print("\"\\n\\tPAGAMENTO � VISTA| 10% DE DESCONTO\\n\"");
			System.out.print("\t\t\nVALOR TOTAL: R$ " + df.format(valorTotal));
			imposto = valorTotal * 0.09;
			System.out.print("\t\t\n9% DE IMPOSTO: R$ " + df.format(valorTotal));

		} else if (formaPagamento == '2') {
			valorTotal = valorTotal * 1.1;
			System.out.print("\n\t\t   * NOTA FISCAL *\n\n");
			System.out.print("\"\\n\\tCART�O DE CR�DITO 1X | 10% DE ACR�SCIMO\\n\"");
			System.out.print("\t\t\nVALOR TOTAL: R$ " + df.format(valorTotal));
			imposto = valorTotal * 0.09;
			System.out.print("\t\t\n9% DE IMPOSTO: R$ " + df.format(valorTotal));

		} else if (formaPagamento == '3') {
			valorTotal = valorTotal * 1.15;
			System.out.print("\n\t\t   * NOTA FISCAL *\n\n");
			System.out.print("\"\\n\\tPARCELADO EM 2X | 15% DE ACR�SCIMO\\n\"");
			System.out.print("\t\t\nVALOR TOTAL: R$ " + df.format(valorTotal));
			imposto = valorTotal * 0.09;
			System.out.print("\t\t\n9% DE IMPOSTO: R$ " + df.format(valorTotal));

		} else {
			System.out.print("\nMETODO N�O IDENTIFICADO");
			System.out.print("\nTENTE NOVAMENTE");
		}

	}
	
	public void mostraCabecalhoLoja() {
		System.out.println();
		System.out.println("\t\t    * Mangue-Tech *");
		System.out.println("CODIGO \t VALOR \t ESTOQUE \t NOME");

	}
	
	public void mostraCabecalhoNF() {
		System.out.println();
		System.out.println("\t\t    * Mangue-Tech *");
	}

}
