package entities;

public class Funcionario {
	
	//ATRIBUTOS
	
	private String matricula;
	private String nome;
	protected int horasTrabalhadas;
	protected double valorHora;
	
	
	//CONSTRUTOR -> constructor using fields
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		
	}

	//ENCAPSULAMENTO -> get and set
		
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	// MÉTODOS
	
	public double calcularSalario() {
		
		return (this.horasTrabalhadas *this.valorHora);  //this (é um atributo!) e n é uma variável
		
	}
	
	public double calcularSalarioFerias() {
		
		return (calcularSalario()*1.3);
	}
	
	

	

}
