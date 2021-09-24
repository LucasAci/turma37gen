programa
{
	// lista 01, questão 07
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real x, y, a, b, c, d, E, f 

		escreva("Informe o valor de a: ")
		leia(a)
		escreva("Informe o valor de b: ")
		leia(b)
		escreva("Informe o valor de c: ")
		leia(c)
		escreva("Informe o valor de d: ")
		leia(d)
		escreva("Informe o valor de e: ")
		leia(E)
		escreva("Informe o valor de f: ")
		leia(f)

		x = math.arredondar(((c*E) - (b*f) / (a*E) - (b*d)),2)

		y = math.arredondar(((a*f) - (c*d) / (a*E) - (b*d)),2)

		escreva("O valor de x é: ", x)
		escreva("O valor de y é: ", y)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */