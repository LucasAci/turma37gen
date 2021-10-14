package app;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class ExAnimais {

	public static void main(String[] args) {
	

		Cachorro dog1 = new Cachorro("Tobby",1);
		Cavalo horse1 = new Cavalo("Speed",4);
		Preguica preg1 = new Preguica("Ed",50);
		
		System.out.println(dog1.getNome());
		dog1.correr();
		dog1.eminirSom();
		dog1.abanandoRabo();
		System.out.println(horse1.getNome());
		horse1.correr();
		horse1.eminirSom();
		System.out.println(preg1.getIdade());
		preg1.correr();
	}
	
	

}
