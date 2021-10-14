package aplications;

import entities.ContaEstudantil;

public class testeEstudantil {

	public static void main(String[] args) {
		
		
		ContaEstudantil cont1 = new ContaEstudantil(111, "1111.1111.111", 5000.0);
		System.out.println(cont1.toString());
		cont1.usarEstudantil(4000);
		System.out.println(cont1.toString());
	}

}
