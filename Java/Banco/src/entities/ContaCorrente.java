package entities;

public class ContaCorrente extends Conta {
	private int  contadorTalao;

	//CONSTRUTOR CLASSE CONTA
	public ContaCorrente(int numero, String cpf) {
		super(numero, cpf);
		
	}
	//EMCAPSULAMENTO
	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	//MÉTODOS
	
	public void pedirTalao() {
		
		this.contadorTalao++;
		
		if (contadorTalao == 3) {
			System.out.println("Limite de cheque Atingido");
		}
		else {
			super.debito(30.00);
		}
	}
	
	

}
