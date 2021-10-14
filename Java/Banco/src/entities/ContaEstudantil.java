package entities;

public class ContaEstudantil extends Conta {
	
	//ATRIBUTO
	private double limiteEstudantil;
	
	
	//CONSTRUTOR - HERANÇA
	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	//ENCAPSULAMENTO
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}


	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//MÉTODOS
	
	public void usarEstudantil(double limiteSolicitado) {
		
		if(limiteSolicitado <= 0) {
			System.out.println("Impossível realizar");
			
		}else if (limiteSolicitado > this.limiteEstudantil) {
			System.out.println("Limite Indisponível");
			
		}else {
			this.limiteEstudantil = this.limiteEstudantil - limiteSolicitado;
			super.credito(getSaldo() + limiteSolicitado);
		}
		
	
	}

	@Override
	public String toString() {
		return "ContaEstudantil [limiteEstudantil=" + limiteEstudantil + ", getNumero()=" + getNumero() + ", getCpf()="
				+ getCpf() + ", getSaldo()=" + getSaldo() + "]";
	}

	
	}
	
	
	
		
	
	
	


