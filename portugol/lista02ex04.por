programa
{
	
	funcao inicio()
	{
	// lista 2, questão 4

	inteiro num
	
	escreva("Digite um número inteiro: ")
	leia(num)

	se(num == 0){
		escreva( num, " é um número neutro")
		
	}
	senao se(num % 2 ==1){
		escreva(num , " é um número impar e positivo.")
	}
	senao se(num % 2 == 0 ){
		escreva(num , " é um número par e positivo.")
	}
	senao{
		escreva("este número é negativo, informe um número positivo inteiro.")
	}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 55; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */