package Sondas;

public class sonda {

	private int posicaoX;
	private int posicaoY;
	private char posicaoDianteria;
	
	public sonda(int posicaoX, int posicaoY, char posicaoDianteira) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.posicaoDianteria = posicaoDianteira;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public char getPosicaoDianteria() {
		return posicaoDianteria;
	}

	public void setPosicaoDianteria(char posicaoDianteria) {
		this.posicaoDianteria = posicaoDianteria;
	}
	
	
}