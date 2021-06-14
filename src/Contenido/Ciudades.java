package Contenido;

import java.util.*;

public class Ciudades extends Palabras{

	protected String[] listaciudades=new String[] {"Nueva York","Bogotá","Paris","Timbuktu","Dublin"};
	protected String[] listapistas=new String[] {"La gran manzana","1280 metros más cerca de las estrellas","Torre Eiffel","55.000 habitantes","Duendes"};
	protected String ciudad;
	protected String pista;
	protected int index;

	public Ciudades () {

	}

	public String getCiudades () {
		return Arrays.toString(listaciudades);
	}


	public String getCiudad() {
		String ciudad = listaciudades[(int) (Math.random() * listaciudades.length)];
		index= Arrays.asList(listaciudades).indexOf(ciudad);
		List<String> list=new ArrayList<String>(Arrays.asList(listaciudades));
		list.remove(index);
		listaciudades=list.toArray(new String[0]);
		return ciudad;
		
	}

	public String getPista () {
		pista=listapistas[index];
		
		return pista;
	}

}
