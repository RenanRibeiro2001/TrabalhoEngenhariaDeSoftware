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
	
	public void verifica_plato(int x, int y) {
		if(x <= 0 || y <= 0) {
			System.out.println("o plato não pode ter posicao zerada ou negativa");
		}else {
			System.out.println(x + " " + y);
		}
	}
	
	public void verifica_sonda(int sondax, int sonday,String bussola ,int platox, int platoy) {
		if(sondax > platox || sonday > platoy) {
			System.out.println("a sonda nao pode ser colocada fora do plato");
		}else if(sondax <= 0 || sonday <= 0) {
			System.out.println("a sonda não pode ter posicao zerada ou negativa");
		}else if(ehLetra(bussola) == false || bussola != "N" && bussola != "L" && bussola != "S" && bussola != "O") {
			System.out.println("a posicao da bussola esta errada");
		}else {
			System.out.println(sondax + " " + sonday + " " + bussola);
		}
	}
}
