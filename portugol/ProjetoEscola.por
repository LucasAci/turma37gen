programa
{
	inclua biblioteca Util
	
	cadeia cpf =""
	inteiro matricula=0
	real pontos = 0.00  //É o somatório
	real pontoMovimento = 0.00 // Ponto que acabou de ser incluido
	logico ativo  = verdadeiro //verdadeiro ou falso - para saber o status do aluno ativo ou inativo
		
	funcao inicio()
	{
		//Variaveis	
		caracter opcao   // variavel para escoler uma opção de curso
		cadeia tipo	 // tipo de ensino

		//Entradas
		faca {					//Quando não queremos pedir ao usuário, e queremos fazer algo
		limpa()		
		escreva("Escola GENERATION BRASIL\n\n")
		escreva("INGRESSE NO MERCADO COM QUEM MAIS ENTENDE!!\n")
		escreva("\n")
		escreva(" 1 - BÁSICO\n")
		escreva(" 2 - MÉDIO\n")
		escreva(" 3 - GRADUAÇÃO\n")
		escreva(" 4 - PÓS GRADUAÇÃO\n")
		escreva(" 5 - MESTRADO\n")
		escreva(" 6 - SAIR\n")
		escreva("Digite o número de sua opção: ")
		leia(opcao)
		se (opcao == '1'){
			inteiro diaAniversario
			caracter auxInclusaoRetirada
			inteiro auxDia
			caracter auxSair
			tipo = "BÁSICO"
			cabecalho(tipo)
			escreva("Digite o dia do anoversário do aluno: ")
			leia(diaAniversario)
			para (inteiro x=1; x<10; x++){
				escreva("Motimento: ",x,"\n")  // mostra o movimento que está: ex: 1,2,3.... até 10
				escreva("Pontos atual: ", pontos,"\n")
				escreva("Digite \nI-Inclusão\nA-Ajuste de nota: ")
				leia(auxInclusaoRetirada)
				enquanto(auxInclusaoRetirada != 'A' e auxInclusaoRetirada != 'a' e auxInclusaoRetirada != 'I' e auxInclusaoRetirada != 'i' )
				 {
					escreva("Digite \nI-Inclusão\nA-Ajuste de nota: ")
					leia(auxInclusaoRetirada)
				}
				escreva("Valor do movimento: ")  // ponto que acabou de ser incluido
				leia(pontoMovimento)
				
				se (auxInclusaoRetirada == 'I' ou auxInclusaoRetirada == 'i') {
					
					pontos = pontos + pontoMovimento  //Vai ler a pontuação e somar com a pontuação que acabou de ser incluida
					
				} senao se (auxInclusaoRetirada == 'A' ou auxInclusaoRetirada == 'a') {
					enquanto(pontoMovimento > pontos){							// essa regra impede que ele leia maior que os pontos que tem na pontuação total
						escreva("Valor acima do permitido, tente de novo. ")
						escreva("Pontos atuais: ",pontos,"\n")
						escreva("Digite novamente o valor para ajustar: ")
						leia(pontoMovimento)
					}
					pontos = pontos - pontoMovimento
					
					
				}
				escreva("Continua S/N: ")
				leia(auxSair)
				se (auxSair == 'N' ou auxSair == 'n'){
					pare
				}
				
			
			}
			escreva("Qual o dia de hoje: ")
			leia(auxDia)
			se (auxDia == diaAniversario){
				pontos = (pontos*0.01) + pontos  //aumenta em 1% os pontos totais que o aluno tem
			}
			escreva("\nMATRICULA: ",matricula)
			escreva("\nCPF: ",cpf)
			escreva("\nAtivo: ",ativo)
			escreva("\nA dia de aniversário: ",diaAniversario)
			escreva("\nPontos: ",pontos)
			Util.aguarde(10000)
			
		}senao se (opcao == '2'){
			tipo = "MÉDIO"
			cabecalho(tipo)
			Util.aguarde(2000) 
			
		}senao se (opcao == '3'){
			tipo = "GRADUAÇÃO"
			cabecalho(tipo)
			Util.aguarde(2000) 
			
		}senao se (opcao == '4'){
			tipo = "PÓS GRADUAÇÃO"
			cabecalho(tipo)
			Util.aguarde(2000)
			 
		}senao se (opcao == '5'){
			tipo = "MESTRADO"
			cabecalho(tipo)
			Util.aguarde(2000) 
			
		}senao se (opcao == '6'){
			escreva("\nVOCÊ ESCOLHEU SAIR \nOBRIGADO, VOLTE SEMPRE!!")
			Util.aguarde(2000)
			pare												//Quebra o looping 
			
		}senao {
			escreva("Você não selecionou um número entre 1 e 6: \n")
			Util.aguarde(2000)
		}
						
	}enquanto (opcao != '6')

		escreva("\nFIM DE PROGRAMA")
	}

	funcao cabecalho(cadeia tipo){
		caracter aux					// Variavel Auxiliar
		limpa()
		escreva("Escola GENERATION BRASIL\n\n")
		escreva("INGRESSE NO MERCADO COM QUEM MAIS ENTENDE!!\n")
		escreva("\n")
		escreva("ENSINO ",tipo, "\n")
		escreva("Matricula: ")
		leia(matricula)
		escreva("CPF: ")
		leia(cpf)
		escreva("1 - Ativo OU 2 -Inativo: ")
		leia(aux)
		se (aux == '1' ){
			ativo = verdadeiro
		}senao {
			ativo = falso
		}
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */