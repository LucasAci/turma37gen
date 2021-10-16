package application;

import entities.Carro;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("PEB-3445","toro","Fiat");
		
		carro1.ligarCarro();
		carro1.andarCarro();
		System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.getVelocidade());
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.getVelocidade());
		carro1.subirMarcha();
		
		for (int x=1; x<10; x++) {
			carro1.acelerar();
		}
		System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.getVelocidade());
		carro1.descerMarcha();
		
		for (int x=1; x<10; x++) {
			carro1.reduzir();	
		}
		
		System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.getVelocidade());
		carro1.freio();
		System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.getVelocidade());
		carro1.freio();
		System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.getVelocidade());
		carro1.freio();
		
		carro1.descerMarcha();
		carro1.descerMarcha();
		carro1.pararCarro();
		System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.getVelocidade());
		
	}
}

