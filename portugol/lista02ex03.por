programa
{
	inclua biblioteca Matematica --> math

	//Lista 2, questão 3
	
	funcao inicio()
	{
	real a, b, c, d 

	escreva("Digite 4 números em sequência: ")
	leia(a)
	leia(b)
	leia(c)
	leia(d)

	a = (math.potencia(a, 2))
	b = (math.potencia(b, 2))
	c = (math.potencia(c, 2))
	d = (math.potencia(d, 2))

	se ( c >= 1000 ){
		escreva( c)
	}senao{
		escreva ((math.raiz(a, 2)), " seu quadrado é: " , a, "\n")
		escreva ((math.raiz(b, 2)), " seu quadrado é: " , b, "\n")
		escreva ((math.raiz(c, 2)), " seu quadrado é: " , c, "\n")
		escreva ((math.raiz(d, 2)), " seu quadrado é: " , d, "\n")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 72; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */