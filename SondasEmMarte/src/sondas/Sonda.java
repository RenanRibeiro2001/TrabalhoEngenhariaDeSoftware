package sondas;

import java.util.ArrayList;
import java.util.Scanner;

import plato.Plato;
import testeSondas.Teste;

public class Sonda {

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
			
			ehInteiro(PosicaoX);
			ehInteiro(PosicaoY);
			ehLetra(posicao_bussola);
			
			if(ehInteiro(PosicaoX) == true && ehInteiro(PosicaoY) == true) {
				if(ehLetra(posicao_bussola) == true) {
					posicaoX = Integer.parseInt(PosicaoX);
					posicaoY = Integer.parseInt(PosicaoY);
					
					if(posicaoX > Teste.getTemp1().getTamanhoX() || posicaoY > Teste.getTemp1().getTamanhoY()) {
						System.out.println("A sonda não pode ser colocada fora do plato");
					}else if(posicaoX < 0 || posicaoY < 0) {
						System.out.println("A sonda não pode ter uma posição negativa");
					}else {
						repitir++;
						System.out.println("a posicao inicial da sonda é: " + posicaoX + " X " + posicaoY + " " + posicao_bussola);
					}
				}else {
					System.out.println("Você digitou uma posição errada, tente novamente");
				}
			}else {
				System.out.println("Você digitou uma coordenada errada, tente novamente");
			}
	    }	
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

	public char getPosicaoDianteria() {
		return posicaoDianteria;
	}

	public void setPosicaoDianteria(char posicaoDianteria) {
		this.posicaoDianteria = posicaoDianteria;
	}
	
	
}