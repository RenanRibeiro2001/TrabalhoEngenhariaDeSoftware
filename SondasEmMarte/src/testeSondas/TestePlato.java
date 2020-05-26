package testeSondas;

import org.junit.Test;

import comandos.Verificacoes;
import plato.Plato;

public class TestePlato {

	@Test
	public void testePlatoEixoXIgualAZero() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(0,10);
		veri.verifica_plato(plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testePlatoEixoXNegativo() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(-5,10);
		veri.verifica_plato(plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testePlatoEixoYIgualAZero() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,0);
		veri.verifica_plato(plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testePlatoEixoYNegativo() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,-5);
		veri.verifica_plato(plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testePlatoCaminhoFeliz() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		veri.verifica_plato(plato.getTamanhoX(), plato.getTamanhoY());
	}
}