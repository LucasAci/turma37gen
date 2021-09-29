programa
{
	
	funcao inicio()
	{
		inteiro num=0, somatorio=0, i=0

		escreva("Digite um número do seu teclado:") 
		leia(num)

		faca {
			i++
			somatorio=somatorio + i
			se( i == 1){
				escreva(i)
			}senao{
				escreva(" + ", i)
			}
			
		} enquanto(i < num)
			escreva(" = ",somatorio)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */