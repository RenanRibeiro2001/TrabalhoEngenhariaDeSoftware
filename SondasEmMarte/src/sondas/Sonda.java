package sondas;

public class Sonda {

	private int posicaoX;
	private int posicaoY;
	private String posicao_bussola;
	private String comando_sonda;
	
	public Sonda(int posicaoX, int posicaoY, String posicao_bussola) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.posicao_bussola = posicao_bussola;
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

	public String getPosicao_bussola() {
		return posicao_bussola;
	}

	public void setPosicao_bussola(String posicao_bussola) {
		this.posicao_bussola = posicao_bussola;
	}
}