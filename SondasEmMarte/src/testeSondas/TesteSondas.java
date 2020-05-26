package testeSondas;

import org.junit.jupiter.api.Test;

import comandos.Verificacoes;
import plato.Plato;
import sondas.Sonda;

class TesteSondas {

	@Test
	public void testeSondaEixoXIgualAZero() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(0, 10, "N");
		veri.verifica_sonda(sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeSondaEixoXNegativo() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(-10, 10, "N");
		veri.verifica_sonda(sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeSondaEixoYIgualAZero() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 0, "N");
		veri.verifica_sonda(sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeSondaEixoYNegativo() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 0, "N");
		veri.verifica_sonda(sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeSondaBussolaNaoForUmaLetra() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 6, "6");
		veri.verifica_sonda(sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeSondaBussolaNaoForOsPontosCaridiais() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 6, "T");
		veri.verifica_sonda(sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeSondaCaminhoFeliz() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 6, "N");
		veri.verifica_sonda(sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), plato.getTamanhoX(), plato.getTamanhoY());
	}
}
