package Lista04;

public class ExLancamento {

	public static void main(String[] args) {
		
		int max = 9;
		int min = 0;
		int lancamentos[] = new int[10];
		
		for (int i = min; i<=max; i++) {
			lancamentos [i] = (int) (Math.random()*(20));
			
			System.out.println(lancamentos[i]);
		}
		
		
	}

}
