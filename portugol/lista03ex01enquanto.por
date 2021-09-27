programa
{
	
	funcao inicio()
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
		 * e apresente no final o total do somatório, a média e o total de valores lidos. 
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver 
		 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário 
		 * fornecer um valor negativo.*/

		 inteiro somatorio=0, i=0, numero=0
		 real media=0

		 		 
		 	enquanto (numero >= 0 ){
		 	escreva("Informe um valor númerico ou digite um número negativo para finalizar: ")
		 	leia(numero)

		 		se (numero >= 0){
		 		i++
				somatorio = somatorio + numero
		 		}
				
		 }

		 	media = somatorio/i

		 	escreva("O somatório do valores lidos foi: ",somatorio)
		 	escreva("\nA média dos valores lidos foi: ",media)
		 	escreva("\nO total de valores lidos foi: ",i)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */