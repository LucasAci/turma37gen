package entities;

public abstract class Conta {
	
	//ATRIBUTOS
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	private double valor;
	
	
	//CONSTRUTORES
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	//EMCAPSULAMENTO
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


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	//MÉTODOS
	
	public boolean pessoaAtiva() {
		return this.ativo = true;
	}
	
	public boolean pessoaDesativada() {
		return this.ativo = false;
	}
	
	public void debito(double valor) {
		
		if(valor == 0) {
			System.out.println("Debito vazio,Impossivel realizar");
		}
		
		else if (valor <0) {
			System.out.println("Valor informado negativo, impossivel realizar");
			
		}
		
		else if (valor > saldo) {
			
		}
		
		//this.saldo = saldo - valor;
		this.saldo -= valor;
	}
	
	public void credito(double valor) {
		
		if(valor < 0) {
			System.out.println("Você não pode afetuar esse tipo de operação");
		}
		else {
			
			this.saldo += valor;
		}
	}
	

}
