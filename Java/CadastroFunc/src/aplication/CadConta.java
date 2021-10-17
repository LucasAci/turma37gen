package aplication;

import java.util.Scanner;

import entities.Conta2;

public class CadConta {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Conta2 cc1 = new Conta2(100,"111.111.111-11");
		
		
		System.out.println("O número da conta é: "+cc1.getNumero()+" e o CPF é: "+cc1.getCpf());
		
		cc1.setNumero(200);  //o set altera
		cc1.setCpf("222.222.222-22");
		
		System.out.println("O número da conta é: "+cc1.getNumero()+" e o CPF é: "+cc1.getCpf());
		System.out.println();
		
		System.out.print("digite o núemro da conta: ");  // perguntado ao usuário numero de conta e cpf
		int auxConta = leia.nextInt();
		System.out.print("Digite o cpf: ");
		String auxCpf = leia.next();
		
		Conta2 cc2 = new Conta2(auxConta,auxCpf);
		System.out.println("O número da conta é: "+cc2.getNumero()+" e o CPF é: "+cc2.getCpf());
		System.out.println("Ativar conta? [S/N]");  // ativar conta
		char op = leia.next().toUpperCase().charAt(0);
		if (op == 'S') {
			cc2.ativarConta();
		}
		else if(op == 'N') {
			cc2.desativarConta();
		}
		// interface com o usurário 
		System.out.println("Saldo atual R$: "+cc2.getSaldo());
		System.out.println("Registrando 5 movimentos");
		for (int i=1; i<=5; i++) {
			System.out.println("Lançamento "+i);
			System.out.println("Digite o valor RS: ");
			double auxValor = leia.nextDouble();
			System.out.println("D-debito ou C-Crédito: ");
		 op = leia.next().toUpperCase().charAt(0);
		 if (op == 'D'&& cc2.isAtiva()) {
			 cc2.debito(auxValor);
		 }
		 else if (op == 'C' && cc2.isAtiva()) {
			 cc2.credito(auxValor);
		 }
		 
		 System.out.println("Seu saldo é R$: "+cc2.getSaldo());
		}
		
		
	}

}
