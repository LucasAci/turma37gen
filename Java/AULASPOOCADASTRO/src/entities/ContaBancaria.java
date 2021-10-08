package entities;

public class ContaBancaria {

	//Atributos
	
	public String titular;
	public String cpf;
	public double saldo;
	public double credito;
	
	//Métodos
	
	public void exibirExtrato() {
		System.out.println("TITULAR\t\tCPF\tSALDO\tCRÉDITO");
		System.out.println("\n"+ titular + "\t" + cpf + "\t" + saldo + "\t" + credito);
	}
}
