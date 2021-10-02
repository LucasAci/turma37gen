programa
{
	
	funcao inicio()
	{
		
		cadeia codigo [] =  {"G3-01","G3-02","G3-03","G3-04","G3-05","G3-06","G3-07","G3-08","G3-09","G3-10"}
		cadeia produto [] = {"mouse","teclado","webcam","impressora","monitor","head set","caixa de som","roteador","hd externo","cabo hdmi"}
		real preco [] = {30.00,40.00,80.00,500.00,800.00,100.00,70.00,150.00,400.00,30.00}
		inteiro estoque [10]
		caracter DesejaEntrarNoSite
		inteiro carrinhpCompras [10]

		para (inteiro i=0; i<10; i++){
		Mangue-Tech()
		
		// Entrada no site
		faca{
			escreva("Deseja entrar na nossa loja ?: [S/N]")
			leia(desejaEntrarNoSite)
			limpa()
			
			// Tabela de código, produto, preço e estoque.	
			}se (DesejaEntrarNoSite == 'S' ou DesejaEntrarNoSite == 's'){
				tituloTabela()
					para (i=0; i<10; i++){
						escreva("\n\t",codigo[i]," \t \t", produto[i],"\t",preco[i],"\t   \t ",estoque[i])	
					}
						linha(verdadeiro)
			}
		
		 
		}
		

			
			
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 904; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */