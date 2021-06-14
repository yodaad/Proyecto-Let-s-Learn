package Contenido;

public class Jugador {

	protected int vidas=3;
	protected int puntaje=0;
	protected boolean respuesta=true;
	protected boolean estado= true;


	public Jugador () {

	}


	public int getVidas() {
		if (respuesta==false) 
			vidas--;
		return vidas;
	}

	public int getPuntaje() {
		if (respuesta==true) 
			puntaje=puntaje+15;

		return puntaje;
	}
}
