package entities;

public class Horista {

	//ATRIBUTOS
	private String cpf;
	private String nome;
	private double valorHora;
	private int horasTrabalhadas;
	
	
	//COSNTRUTORES 
	public Horista(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//MÉTODOS
	
	public double pagamentohorista(int horasTrabalhadas, double valorHora) {
		return valorHora*horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
