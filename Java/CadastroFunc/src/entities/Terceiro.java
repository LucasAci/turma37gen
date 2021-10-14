package entities;

public class Terceiro extends Funcionario {
	
	//ATRIBUTOS
	private double adicional;
	
	//CONSTRUTOR
	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}
	//ENCAPSULAMENTO
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	//MEÓDOS (FUNCIONÁRIO
	@Override 
	// forma de garantir que você está sobrescrevendo um método e não criando um novo.
	// só pode ser usando em classe filha
	
	public double calcularSalario() {
		
		// colocando a classe mãe no meio:	
	//	return (super.getHorasTrabalhadas() *super.getValorHora())+this.adicional;  //copiei da classe mae funcionario
		
	return (horasTrabalhadas * valorHora) +adicional; //usando protected
	
	}
	@Override
	public double calcularSalarioFerias() {
		
		return (calcularSalario()*1.3);
	}
	
	

}
