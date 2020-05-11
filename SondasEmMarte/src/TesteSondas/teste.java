package TesteSondas;

import Plato.plato;
import Sondas.sonda;

public class teste{
	private static plato temp1 = new plato();
	public static void main(String[] args) {
		
		sonda temp2 = new sonda();
		sonda temp3 = new sonda();
		
		temp1.montarPlato();
		temp2.posicionar_sonda();
		//aqui receber o comando
		temp3.posicionar_sonda();
		//aqui receber o comando
	}
	
	public static plato getTemp1() {
		return temp1;
	}
	public static void setTemp1(plato temp1) {
		teste.temp1 = temp1;
	}
}
