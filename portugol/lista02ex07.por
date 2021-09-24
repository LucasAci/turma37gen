programa
{
	
	// Lista 2, Questão 7
	
	funcao inicio()
	{

	real base, altura, area

	escreva("Informe o valor da base do triângulo: ")
	leia(base)
	escreva("Informe o valor da altura do triÂngulo: ")
	leia(altura)

	se (base * altura > 0){
		escreva("Valores válidos.\n")
		area = base * altura
		escreva("A área do triângulo é: ", area, ".")
	}
	senao{
		escreva("Valores inválidos, porfavor digite um númeiro positivo maior que 0.")
		
	}
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */