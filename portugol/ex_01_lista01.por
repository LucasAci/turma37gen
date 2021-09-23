programa
{
	
	funcao inicio()
	{
	/* 1 -Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	 *  meses e dias e mostre-a expressa apenas em dias. */

	inteiro i_anos, total_dias, i_meses, i_dias
	
	
	 escreva("Informe a sua idade em anos: ")
	 leia(i_anos)
	 escreva("Informe a sua idade em meses: ")
	 leia(i_meses)
	 escreva("Informe a sua idade em dias: ")
	 leia(i_dias)

	 total_dias = (i_anos * 365) + (i_meses * 30 ) + i_dias
	 escreva("A sua idade expresa em dias é: " , total_dias , " dias.")
	

	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */