programa
{
	
	funcao inicio()
	{
/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

		inteiro pontos [5], maiorPonto=0

		para (inteiro i=0;i<5;i++){
		escreva("Informe a pontuação da atividade: ")
		leia(pontos[i])
          }	
          para (inteiro i=0;i<5;i++){
           	se (pontos[i] > maiorPonto){
           		maiorPonto = pontos[i]
           	}
           }
          	escreva("\nA maior pontuação foi: ",maiorPonto)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */