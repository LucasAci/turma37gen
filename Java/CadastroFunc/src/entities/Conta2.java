package entities;

public class Conta2 {

	// ATRIBUTOS
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	private double valor;

	// CONSTRUTORES
	public Conta2(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	// ENCAPSULAMENTO
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo; 
	} */

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	// METODOS

	public void debito(double valor) {
		saldo = saldo - valor;
	}

	public void credito(double valor) {
		saldo = saldo + valor;
	}
	
	public void ativarConta() {
		ativa = true;
		System.out.println("Conta Ativada");
	}
	
	public void desativarConta() {
		ativa = false;
		System.out.println("Sou conta não foi ativada");
	}
	
	/*public boolean contaAtiva() { metodo com retorno
		return this.ativa = true;
	} */

}
