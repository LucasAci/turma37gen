programa
{
	
	funcao inicio()
	{
	// Informar se o número é par, impar ou neutro.

	inteiro num
	
	escreva("Digite um número inteiro: ")
	leia(num)

	se(num == 0){
		escreva( num, " é um número neutro")
		
	}
	senao se(num % 2 ==1){
		escreva(num , " é um número impar.")
	}
	senao se(num % 2 == 0 ){
		escreva(num , " é um número par.")
	}
	senao{
		escreva("Informe um número positivo inteiro.")
	}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 81; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */