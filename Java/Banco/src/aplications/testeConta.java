package aplications;

import java.util.Scanner;

import entities.ContaPoupanca;

public class testeConta {

	public static void main(String[] args) {
		
		ContaPoupanca cc1 = new ContaPoupanca(1, "1234", 200);
		
						
		cc1.credito(100);
		cc1.credito(50);
		cc1.debito(10);
		cc1.correcao(2);
		
	
		System.out.println("Saldo Atual R$: "+cc1.getSaldo());

	}

}
