programa
{
	
	funcao inicio()
	{
	//SALA IMPAR: PEDE GRAUS FARENHEIGHT E CONVERTER PRA CELCIUS

		cadeia nome
		real temp_f, temp_c

		escreva("informe o seu nome: ")
		leia(nome)

		escreva("Informe a temperatura em °Celcius: ")
		leia(temp_c)

		temp_f = (1.8 * temp_c) + 32

		escreva("Oi " , nome , ", a temperatura atual em Recife está: " , temp_f , "°F.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */