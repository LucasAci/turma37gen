package Lista01;
import java.util.Scanner;

public class Lista01ex03 {

	// 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	// expressa
	// em segundos e mostre-o expresso em horas, minutos e segundos.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int hora, min, seg;

		System.out.println("Informe a duração do evento realizado na fábrica em segundos: ");
		seg = leia.nextInt();

		hora = seg / 3600;
		min = (seg % 3600) / 60;
		seg = (seg % 3600) % 60;

		System.out.println("O evento da fábrica durou: " + hora + " horas." + "\n" + min + " minutos." + "\n" + seg
				+ " segundos.");

	}

}
