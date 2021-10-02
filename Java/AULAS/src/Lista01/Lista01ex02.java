package Lista01;
import java.util.Scanner;

public class Lista01ex02 {

	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias
	//e mostre-a expressa em anos, meses e dias. 
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int iDias, iMeses, iAnos;
		
		System.out.println("Informe a sua idade em dias: ");
		iDias = leia.nextInt();
				
		iAnos = iDias/365;
		iMeses = (iDias % 365)/ 30;
		iDias = (iDias%365) % 30;
				
		System.out.println("Você tem: "+iAnos+" anos."+"\nVocê tem: "+iMeses+" meses."+"\nVocê tem: "+iDias+" dias.");
		
		
		

	}

}
