package entities;

public class ContaEspecial extends Conta {

	// ATRIBUTOS
	private double limite;

	// CONSTRUTOR

	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = 1000;
	}

	// ENCAPSULAMENTO
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// MÉTODOS
	public void usarLimite(double quantidadeLimite) {

		if (quantidadeLimite > limite) {
			System.out.printf("Quantidade de limite indisponível. Seu limite é de R$ %f.\n", limite);
		}

		else {
			this.credito(quantidadeLimite);
			limite -= quantidadeLimite;
		}
	}

	public void debito(double valor) {

		if (valor < 0) {
			System.out.println("Valor negativo, impossível realizar!");
		}

		else if (valor > getSaldo()) {
			double qtddLimiteQuer = valor - getSaldo();
			usarLimite(qtddLimiteQuer);
			super.debito(valor);
		}

		else {
			super.debito(valor);
		}
	}

	public double getLimite1() {
		return limite;

	}
}
