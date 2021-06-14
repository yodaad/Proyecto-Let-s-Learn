package Contenido;


public class Evaluacion {
	
//	protected String respuestausuario;
	protected boolean respuesta=true;
	Paises pais=new Paises();
	
	public Evaluacion () {
		
	}
	
	public void setRespuesta (String respuestausuario) {
		if (respuestausuario.equalsIgnoreCase(pais.getPais())) {
			this.respuesta=true;
		} else {
			this.respuesta=false;
		}
	}
	
	public boolean getRespuesta () {
		return respuesta;
	}

	
}
