programa
{
	// Lista 01, questão 08
	funcao inicio()
	{
	real custo_consumidor, custo_fabrica
	const real PERCENT_DISTRIBUIDOR = 1.28 
	const real PERCENT_IMPOSTOS = 1.45
	
	escreva("Informe o custo de fábrica do carro: ")
	leia(custo_fabrica)

	custo_consumidor = ((custo_fabrica * PERCENT_DISTRIBUIDOR) + (custo_fabrica * PERCENT_IMPOSTOS) - custo_fabrica)
	
	escreva("O custo do carro ao consumidor é: " , custo_consumidor, " reais.")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */