programa
{
	
	funcao inicio()
	{
	// Lista 01, questão 05. 
	// Média de 3 notas do alunos, considerar o peso das notas (2 , 3 , 5)


	real nota1, nota2, nota3, media
	
	escreva("Informe as 3 notas do aluno: \n")
	leia(nota1)
	leia(nota2)
	leia(nota3)

	media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10

	escreva("A média do aluno é: " , media , ".")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */