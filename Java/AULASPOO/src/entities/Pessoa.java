package entities;

public class Pessoa {

	//atributos: o que o objeto é, tem, oi estar
	public String nome;
	public int anoNascimento;
	public boolean viva;
	public String email;
	public char pronome;
	
	
	//metodo
	public int calcularIdade( ) {
		return 2021 - anoNascimento;	
	}
	
	public int cacularIdade(int ano ) {
		return ano - anoNascimento;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anoNascimento=" + anoNascimento + ", viva=" + viva + ", email=" + email
				+ ", pronome=" + pronome + "]";
	}
	
}
