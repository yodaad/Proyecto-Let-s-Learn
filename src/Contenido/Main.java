package Contenido;

public class Main {

	public static void main(String[] args) {
		
		Paises pais=new Paises();
		Jugador jugador=new Jugador();
		System.out.println(pais.getPaises());
		System.out.println(pais.getPais());
		System.out.println(pais.getPista()+"\n");
		System.out.println(jugador.getVidas()+" vidas");
		System.out.println(jugador.getPuntaje()+" puntos");
	

	}

}
