package testeSondas;

import comandos.Verificacoes;
import plato.Plato;
import sondas.Sonda;

public class Teste{
	public static void main(String[] args) {
		
		Verificacoes verificacao = new Verificacoes();
		Plato plato = new Plato(10, 10);
		Sonda sonda1 = new Sonda(3, 5 ,"L");
		Sonda sonda2 = new Sonda(6, 7 ,"N");
		
		// TESTE PLATO
		verificacao.verifica_plato(plato.getTamanhoX(), plato.getTamanhoY());
		
		// TESTE SONDA
		verificacao.verifica_sonda(sonda1.getPosicaoX(), sonda1.getPosicaoY(), sonda1.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
		// Aqui coloca o movimento
		verificacao.verifica_sonda(sonda2.getPosicaoX(), sonda2.getPosicaoY(), sonda2.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
		// Aqui coloca o movimento
	}
}
