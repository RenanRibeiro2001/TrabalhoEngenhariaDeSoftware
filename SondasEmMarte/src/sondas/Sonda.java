package sondas;

import java.util.ArrayList;
import java.util.Scanner;

import plato.Plato;
import testesondas.Teste;

public class Sonda {

	private int posicaoX;
	private int posicaoY;
	private String posicao_bussola;
	
	public Sonda(int posicaoX, int posicaoY, String posicao_bussola) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.posicao_bussola = posicao_bussola;
	}
	
		
	
	public boolean ehInteiro( String s ) {

        // cria um array de char
        char[] c = s.toCharArray();
        boolean d = true;

        for ( int i = 0; i < c.length; i++ ) {
            // verifica se o char não é um dígito
            if ( !Character.isDigit( c[ i ] ) ) {
                d = false;
                break;
            }
        } 
          return d;
     }
	
	public boolean ehLetra( String s ) {

        // cria um array de char
        char[] c = s.toCharArray();
        boolean d = true;

        for ( int i = 0; i < c.length; i++ ) {
            // verifica se o char não é um dígito
            if ( Character.isDigit( c[ i ] ) ) {
                d = false;
                break;
            }
        } 
          return d;
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
	
}