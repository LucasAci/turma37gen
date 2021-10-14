package entities;

public class ContaPoupanca extends Conta {
	
	
	//ATRIBUTOS
	private int diaAniversariopoupanca;


	//CONSTRUTOR
	public ContaPoupanca(int numero, String cpf, int diaAniversariopoupanca) {
		super(numero, cpf);
		this.diaAniversariopoupanca = diaAniversariopoupanca;
	}

	//EMCAPSULAMENTO
	public int getDiaAniversariopoupanca() {
		return diaAniversariopoupanca;
	}

	public void setDiaAniversariopoupanca(int diaAniversariopoupanca) {
		this.diaAniversariopoupanca = diaAniversariopoupanca;
	}

	//M�TODOS
	
	public void correcao(int diaAtual) {
		
		if (diaAtual == this.diaAniversariopoupanca) {
			
			credito(super.getSaldo()*1.05);
			
		}
		
		else {
			
			System.out.println("hoje n�o � dia de rendimento mensal.");
		}
	}
	
}


