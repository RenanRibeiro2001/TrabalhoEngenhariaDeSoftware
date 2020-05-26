package testeSondas;


import java.util.ArrayList;
import java.util.Scanner;

import comandos.Verificacoes;
import plato.Plato;
import sondas.Sonda;

public class Teste{
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Verificacoes verificacao = new Verificacoes();
		Plato plato = new Plato(10, 10);
		Sonda sonda1 = new Sonda(3, 5 ,"E");
		Sonda sonda2 = new Sonda(6, 7 ,"O");
		
		String comandos1;
		String comandos2;
	
		System.out.println("Dados de entrada:");
		// TESTE PLATO
		verificacao.verifica_plato(plato.getTamanhoX(), plato.getTamanhoY());
		
		// TESTE SONDA
		verificacao.verifica_sonda(sonda1.getPosicaoX(), sonda1.getPosicaoY(), sonda1.getPosicao_bussola(),
				                   plato.getTamanhoX(), plato.getTamanhoY());
		
		comandos1 = scan1.nextLine();	
		
		verificacao.verifica_sonda(sonda2.getPosicaoX(), sonda2.getPosicaoY(), sonda2.getPosicao_bussola(), 
				                   plato.getTamanhoX(), plato.getTamanhoY());
		 
		comandos2 = scan2.nextLine();
		
		System.out.println("Dados de saida:");
		
		verificacao.movimentacao_sondas(comandos1,sonda1.getPosicaoX(), sonda1.getPosicaoY(), sonda1.getPosicao_bussola(),
		        plato.getTamanhoX(), plato.getTamanhoY());
		
		verificacao.movimentacao_sondas(comandos2,sonda2.getPosicaoX(), sonda2.getPosicaoY(), sonda2.getPosicao_bussola(),
        plato.getTamanhoX(), plato.getTamanhoY());
	}
}
