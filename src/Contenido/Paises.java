package Contenido;

import java.util.*;


public class Paises extends Palabras{

	protected String[] listapaises=new String[] {"Colombia","Dinamarca","Estados Unidos","Argelia","China"};
	protected String[] listapistas=new String[] {"País en sudamérica","Pais nordico","Hablan inglés","Pais Africano","Pais con más habitantes"};
	protected String pais;
	protected String pista;
	protected int index;

	public Paises () {

	}

	public String getPaises () {
		return Arrays.toString(listapaises);
	}
	
	

	public String getPais() {
		String pais = listapaises[(int) (Math.random() * listapaises.length)];
		index= Arrays.asList(listapaises).indexOf(pais);
		List<String> list=new ArrayList<String>(Arrays.asList(listapaises));
		list.remove(index);
		listapaises=list.toArray(new String[0]);
		return pais;
		
	}

	public String getPista () {
		pista=listapistas[index];
		List<String> list=new ArrayList<String>(Arrays.asList(listapistas));
		list.remove(index);
		listapistas=list.toArray(new String[0]);
		return pista;
	}

}
