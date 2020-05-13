package Sondas;

import java.util.ArrayList;
import java.util.Scanner;

import Plato.plato;
import TesteSondas.teste;

public class sonda {

	private int posicaoX;
	private int posicaoY;
	private char posicaoDianteria;
	private String posicao_bussola;
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String> letras = new ArrayList();
	
	public void posicionar_sonda() {
		
		int repitir = 1;
	    while(repitir == 1) {	
	    	System.out.println("Digite a posição incial da sonda: ");
	    	String posicao_inicial= scan.nextLine();
		
			String PosicaoX = posicao_inicial.split(" ")[0];
			String PosicaoY = posicao_inicial.split(" ")[1];
			posicao_bussola = posicao_inicial.split(" ")[2];
			
			posicaoX = Integer.parseInt(PosicaoX);
			posicaoY = Integer.parseInt(PosicaoY);
			
			if(posicaoX > teste.getTemp1().getTamanhoX() || posicaoY > teste.getTemp1().getTamanhoY()) {
				System.out.println("A sonda não pode ser colocada fora do plato");
			}else if(posicaoX < 0 || posicaoY < 0) {
				System.out.println("A sonda não pode ter uma posição negativa");
			}else {
				repitir++;
				System.out.println("a posicao inicial da sonda é: " + posicaoX + " X " + posicaoY + " " + posicao_bussola);
			}
	    }	
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