programa
{
	
	funcao inicio()
	{
/*Crie um programa que receba valores do usuário para preencher 
 * uma matriz 3X3 e em seguida, exiba a soma dos valores dela e 
 * a soma dos valores da primeira diagonal, ou seja, diagonal principal. */
	
	inteiro m [3][3], soma=0, somaDiagonalPrincipal=0

 	para (inteiro l=0; l<3 ;l++){
 		para (inteiro c=0; c<3 ;c++){
 			escreva("Digite o número da matriz [" ,l, "] [" ,c, "] = ")
 			leia(m[l][c])

 			soma += m[l][c]  //soma = soma + m[l][c]

 			se (l == c){
 				somaDiagonalPrincipal += m[l][c]
 			}
 		}
 	}

 	escreva("A soma das matrizes é: ",soma)
 	escreva("\nA soma da diagonal principal é: ",somaDiagonalPrincipal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 10, 9, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */