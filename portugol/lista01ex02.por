programa
{
	
	funcao inicio()
	{
	/* 2 - Faça um sistema que leia a idade de uma pessoa expressa em dias 
	 * e mostre-a expressa em anos, meses e dias. */

	 inteiro i_dias, i_meses, i_anos

	 escreva("Informe sua idade em dias: ")
	 leia(i_dias)

	 i_anos = i_dias /365
	 i_meses = (i_dias % 365) / 30
	 i_dias = (i_dias%365) % 30

	 escreva("Você tem: " , i_anos , " anos." , "\nVocê tem: " , i_meses , " meses." ,  "\nVocê tem: " , i_dias, " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 41; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */