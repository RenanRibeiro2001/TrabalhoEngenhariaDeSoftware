package testeSondas;

import plato.Plato;
import sondas.Sonda;

public class Teste{
	private static Plato temp1 = new Plato();
	public static void main(String[] args) {
		
		Sonda temp2 = new Sonda();
		Sonda temp3 = new Sonda();
		
		temp1.montarPlato();
		temp2.posicionar_sonda();
		//aqui receber o comando
		temp3.posicionar_sonda();
		//aqui receber o comando
	}
	
	public static Plato getTemp1() {
		return temp1;
	}
	public static void setTemp1(Plato temp1) {
		Teste.temp1 = temp1;
	}
}
