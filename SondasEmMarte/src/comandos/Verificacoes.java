package comandos;

public class Verificacoes {
	
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
	
	public void verifica_plato(int platoX, int platoY) {
		if(platoX <= 0 || platoY <= 0) {
			System.out.println("o plato não pode ter posicao zerada ou negativa");
		}else {
			System.out.println(platoX + " " + platoY);
		}
	}
	
	public void verifica_sonda(int sondaX, int sondaY,String bussola ,int platoX, int platoY) {
		if(sondaX > platoX || sondaY > platoY) {
			System.out.println("a sonda nao pode ser colocada fora do plato");
		}else if(sondaX <= 0 || sondaY <= 0) {
			System.out.println("a sonda não pode ter posicao zerada ou negativa");
		}else if(ehLetra(bussola) == false || bussola != "N" && bussola != "L" && bussola != "S" && bussola != "O") {
			System.out.println("a posicao da bussola esta errada");
		}else {
			System.out.println(sondaX + " " + sondaY + " " + bussola);
		}
	}
	
	public void movimentacao_sondas(String comandos_sondas,int sondaX, int sondaY,String bussola ,int platoX, int platoY) {
		for(int i = 0; i < comandos_sondas.length(); i++) {
			char pegaComando;
			String comandoPego;
			// L R M
			pegaComando = comandos_sondas.charAt(i);
			comandoPego = String.valueOf(pegaComando);
			//System.out.println(comandoPego);
			if(!comandoPego.equals("L") && !comandoPego.equals("R") && !comandoPego.equals("M")) {
				System.out.println("comando invalido");
				break;
			}
		}
	}
}