package Contenido;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		Paises pais=new Paises();
		Jugador jugador=new Jugador();
		System.out.println(pais.getPaises());
		System.out.println(pais.getPais());
		System.out.println(pais.getPista()+"\n");
		Evaluacion eval=new Evaluacion();
		eval.setRespuesta(JOptionPane.showInputDialog("Ingresa la respuesta:"));
		System.out.println(eval.getRespuesta());
		System.out.println(jugador.getVidas()+" vidas");
		System.out.println(jugador.getPuntaje()+" puntos");


	}

}
