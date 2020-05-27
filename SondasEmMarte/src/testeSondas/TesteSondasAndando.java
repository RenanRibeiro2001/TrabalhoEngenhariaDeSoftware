package testeSondas;

import org.junit.jupiter.api.Test;

import comandos.Verificacoes;
import plato.Plato;
import sondas.Sonda;

class TesteSondasAndando {

	@Test
	public void testeComandoErrado() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "N");
		veri.movimentacao_sondas("PMLR", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoNorteParaOeste() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "N");
		veri.movimentacao_sondas("L", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoOesteParaSul() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "O");
		veri.movimentacao_sondas("L", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoSulParaLeste() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "S");
		veri.movimentacao_sondas("L", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoLesteParaNorte() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "E");
		veri.movimentacao_sondas("L", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoNorteParaLeste() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "N");
		veri.movimentacao_sondas("R", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoLesteParaSul() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "E");
		veri.movimentacao_sondas("R", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoSulParaOeste() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "S");
		veri.movimentacao_sondas("R", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeGirandoDoOesteParaNorte() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "O");
		veri.movimentacao_sondas("R", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeAndandoAtéAbordaEmDirecaoAoNorte() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "N");
		veri.movimentacao_sondas("MMMMMM", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeAndandoAtéAbordaEmDirecaoAoLeste() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "E");
		veri.movimentacao_sondas("MMMMMM", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeAndandoAtéAbordaEmDirecaoAoSul() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "S");
		veri.movimentacao_sondas("MMMMMM", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeAndandoAtéAbordaEmDirecaoAoOeste() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "O");
		veri.movimentacao_sondas("MMMMMM", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
	
	@Test
	public void testeCaminhoFeliz() {
		Verificacoes veri = new Verificacoes();
		Plato plato = new Plato(10,10);
		Sonda sonda = new Sonda(5, 5, "N");
		veri.movimentacao_sondas("LLMMRRRMM", sonda.getPosicaoX(), sonda.getPosicaoY(), sonda.getPosicao_bussola(), 
				                         plato.getTamanhoX(), plato.getTamanhoY());
	}
}