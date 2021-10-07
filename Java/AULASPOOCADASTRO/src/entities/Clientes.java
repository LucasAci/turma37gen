package entities;

public class Clientes {
	
	//Atributos
	
	public String nome;
	public int anoNascimento;
	public int cpf;
	public double contato;
	public char formaPagamento;
	
	
	//Métodos
	
	public void exibirNome() {
		
		System.out.println("O nome é: "+ nome);
	}
	public void exibirIdade() {
		
		System.out.println("A idade é: "+(2021-anoNascimento));
	}
	public void exibirCpf() {
		
		System.out.println("O CPF (somente números) é: "+cpf);
	}
	public void exibirContato() {
		
		System.out.println("O número de contato é: "+contato);
	}
	public void exibirPagamento( ) {
		
		if (formaPagamento == 'D') {
			
			System.out.println("Cliente "+nome+",pagará no débito");
			
		}
		else if (formaPagamento == 'C') {
			
			System.out.println("Cliente "+nome+",pagará no crédito");
		}
		else {
			
			System.out.println("Cliente "+nome+",pagará em espécie");
		}
	}
}
