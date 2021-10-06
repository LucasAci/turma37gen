programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
	// Lista 01 questão 04

	inteiro A , B , C , D , R , S

	escreva("Informe o valor de A, B, C\n")
	leia(A)
	leia(B)
	leia(C)
	
	 R = (A + B )
	 R = math.potencia(R, 2)
	 
	 S = (B + C )
	 S = math.potencia(S, 2)

	 D = ( R + S ) / 2
	 
	 escreva("O valor de D é: ", D)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */