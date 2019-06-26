package datos;

import java.util.ArrayList;

public class CatalogoResiduos {
	
	private static ArrayList<Residuos> catalogo = new  ArrayList<>();

	public static ArrayList<Residuos> getCatalogo() {
		return catalogo;
	}

	public static void setCatalogo(ArrayList<Residuos> catalogo) {
		CatalogoResiduos.catalogo = catalogo;
	}
}
