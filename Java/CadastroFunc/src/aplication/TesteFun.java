package aplication;

import entities.Funcionario;
import entities.Horista;
import entities.Terceiro;

public class TesteFun {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("001","Arisvaldo");
		Terceiro ter1 = new Terceiro("002","Zefinha",20.00);
		
		
		Horista colab1 = new Horista("111","Marivaldo");
		
		System.out.println("Pagamento horista "+colab1.getNome()+" R$ "+colab1.pagamentohorista(4,20.55));
		System.out.println();
		
		func1.setHorasTrabalhadas(44);
		func1.setValorHora(15.00);
		
		ter1.setHorasTrabalhadas(44);
		ter1.setValorHora(12.00);
		
		System.out.println("Salário do funcionário "+func1.getNome()+" R$ "+func1.calcularSalario()+"Ferias R$ "+func1.calcularSalarioFerias());
		System.out.println("Salário do funcionário "+ter1.getNome()+" R$ "+ter1.calcularSalario()+"Ferias R$ "+ter1.calcularSalarioFerias());

	}

}
