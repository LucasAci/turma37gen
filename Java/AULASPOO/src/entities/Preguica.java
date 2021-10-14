package entities;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void subirArvore() {
		System.out.println("Subindo na arvore....");
	}
	
	public void correr() {
		System.out.println("Correndo bemmmmm devagar...");
	}

}
