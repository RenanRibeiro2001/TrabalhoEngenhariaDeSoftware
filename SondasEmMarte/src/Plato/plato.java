package Plato;

import java.util.Scanner;

public class plato {
	
	private int tamanhoX;
	private int tamanhoY;
	
	Scanner scan = new Scanner(System.in);
	
	public void montarPlato() {
		int repitir = 1;
		
		while(repitir == 1) {
			System.out.println("Digite a largura do plat�: ");
			tamanhoX = scan.nextInt();
			System.out.println("Digite a altura do plat�: ");
			tamanhoY = scan.nextInt();
			
			if(tamanhoX < 0) {
				System.out.println("Voc� digitou uma largura negativa, tente novamente");
			}else if(tamanhoY < 0) {
				System.out.println("Voc� digitou uma altura negativa, tente novamente");
			}else {
				repitir++;
				System.out.println("O tamanho do plat� �: " + tamanhoX + " X " + tamanhoY);
			}
		}
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
