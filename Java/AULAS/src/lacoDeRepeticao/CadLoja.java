package lacoDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String codigoProduto[] = {"X01", "X02","X03"};
		String nomeProduto[] = {"CALÇA", "CAMISA","SAIA"};
		int estoque [] = {20,20,20};
		double valorProduto[] = {100.50, 50.75, 70.99};
		String auxCodigo;
		int auxQtde;
		
		// MOSTRANDO NA TELA
		System.out.println("LOJA DA TURMA 37");
		System.out.println();
		System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
		for (int x=0; x<nomeProduto.length; x++) { //O ponto Lenght é par usar quando não souber o tamanho do vetor
		System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);	// ele vai fazer o for até o tamanho do vetor
	//System.out.println(codigoProduto[x]+"\t"+nomeProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);

	}
		System.out.println();
		System.out.println("Digite o codigo do produto que deseja comprar");
		auxCodigo = leia.next().toUpperCase();
		
		System.out.println("PRODUTO ESCOLHIDO");
		System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
}
}