package datos;

import java.util.ArrayList;

public class CatalogoArticulos {
	
	private static ArrayList<Articulo> catalogo = new ArrayList<>();

	public static ArrayList<Articulo> getCatalogo() {
		return catalogo;
	}

	public static void setCatalogo(ArrayList<Articulo> catalogo) {
		CatalogoArticulos.catalogo = catalogo;
	}
}
