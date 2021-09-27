programa
{
	
	funcao inicio()
	{
		/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares 
		 * que são  múltiplos de três 
		 * e que se encontram no conjunto dos números de 1 até 500. */

		 inteiro x=1 , somatorio=0

		 para (x=1 ;x <=500; x++){
			se ((x % 3 == 0) e (x % 2 ==1)){
			somatorio = somatorio + x
			escreva(x," é ímpar e multiplo de 3.\n")
			}
			
								 	
		 }

		 escreva("\nO somatório de todos os números é igual a: ",somatorio)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */