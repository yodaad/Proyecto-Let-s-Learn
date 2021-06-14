package Contenido;


public class Evaluacion {

	private boolean respuesta;
	Paises pais=new Paises();

	public Evaluacion () {

	}

	public void setRespuesta (String respuestausuario) {
		respuesta=respuestausuario.equalsIgnoreCase(pais.getPais());
	}

	public boolean getRespuesta () {
		return respuesta;
	}


}
