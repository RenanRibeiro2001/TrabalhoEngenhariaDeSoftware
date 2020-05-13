package Plato;

import java.util.Scanner;

public class plato {
	
	private int tamanhoX;
	private int tamanhoY;
	
	Scanner scan = new Scanner(System.in);
	
	public void montarPlato() {
		int repitir = 1;
		
		while(repitir == 1) {
			System.out.println("Digite a largura e altura do platô: ");
			String coordenadas = scan.nextLine();
		
			String Tamanhox = coordenadas.split(" ")[0];
			String Tamanhoy = coordenadas.split(" ")[1];
			
			ehInteiro(Tamanhox);
			ehInteiro(Tamanhoy);
			
			if(ehInteiro(Tamanhox) == true && ehInteiro(Tamanhoy) == true) {
				tamanhoX = Integer.parseInt(Tamanhox);
				tamanhoY = Integer.parseInt(Tamanhoy);
				
				if(tamanhoX < 0) {
					System.out.println("Você digitou uma largura negativa, tente novamente");
				}else if(tamanhoY < 0) {
					System.out.println("Você digitou uma altura negativa, tente novamente");
				}else {
					repitir++;
				 	System.out.println("O tamanho do platô é: " + tamanhoX + " X " + tamanhoY);
				}
			}else {
				System.out.println("Você digitou uma letra, tente novamente");
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
        
	public void coordenadasPlato() {
		int [][] coordenadas = new int[tamanhoX][tamanhoY];
	}

	public int getTamanhoX() {
		return tamanhoX;
	}

	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}

	public int getTamanhoY() {
		return tamanhoY;
	}

	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	}
	
	
}
