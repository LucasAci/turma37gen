package entities;

public class ContaEmpresa extends Conta {
	
	//ATRIBUTOS
	private double emprestimoEmpresa;

	//CONSTRUTOR EMPRESA
	public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
		super(numero, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	//ENCAPSULAMENTO
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	//MÉTODOS
	public void pedirEmprestimo(double emprestimoPedido) {
		if (emprestimoPedido > emprestimoEmpresa || emprestimoPedido <= 0) {
			System.out.println("Não é possível completar essa operação.");
		}
		else {
			//emprestimoEmpresa = emprestimoEmpresa - EmprestimoPedido
			this.emprestimoEmpresa -= emprestimoPedido;
				super.credito(emprestimoPedido);
		}
	}
	
	

}
