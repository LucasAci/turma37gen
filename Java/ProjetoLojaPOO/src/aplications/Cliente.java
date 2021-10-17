package aplications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Carrinho;
import entities.Loja;
import entities.Produto;

public class Cliente {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			Loja loja = new Loja();
			Carrinho carrinho = new Carrinho();
			List<Produto> vitrine = new ArrayList<>();
			
			vitrine.add(new Produto("Mouse		  ", "G301", 30.00, 10));
			vitrine.add(new Produto("Teclado      ", "G302", 30.00, 10));
			vitrine.add(new Produto("Webcam    	  ", "G303", 30.00, 10));
			vitrine.add(new Produto("Impressora   ", "G304", 30.00, 10));
			vitrine.add(new Produto("Monitor 	  ", "G305", 30.00, 10));
			vitrine.add(new Produto("HeadSet	  ", "G306", 30.00, 10));
			vitrine.add(new Produto("Caixa de Som ", "G307", 30.00, 10));
			vitrine.add(new Produto("Roteador	  ", "G308", 30.00, 10));
			vitrine.add(new Produto("Hd Externo	  ", "G309", 30.00, 10));
			vitrine.add(new Produto("Cabi HDMI	  ", "G310", 30.00, 10));
			
			
	}

}
