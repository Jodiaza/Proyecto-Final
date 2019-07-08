package datos;

import java.util.HashMap;

public class CatalogoResiduos {
	
	private static HashMap<String, Residuos> catalogo = new  HashMap<String, Residuos>();

	public static HashMap<String, Residuos> getCatalogo() {
		return catalogo;
	}

	public static void setCatalogo(HashMap<String, Residuos> catalogo) {
		CatalogoResiduos.catalogo = catalogo;
	}
	
	public CatalogoResiduos() {
		Plasticos plasticos = new Plasticos();
		Carton carton = new Carton();
		Papel papel = new Papel();
		Vidrios vidrios = new Vidrios();
		Peligrosos peligrosos = new Peligrosos();
		Ordinarios ordinarios = new Ordinarios();
		Organicos organicos = new Organicos();
		
		catalogo.put(plasticos.getTipo(), plasticos);
		catalogo.put(carton.getTipo(), carton);
		catalogo.put(papel.getTipo(), papel);
		catalogo.put(vidrios.getTipo(), vidrios);
		catalogo.put(peligrosos.getTipo(), peligrosos);
		catalogo.put(ordinarios.getTipo(), ordinarios);
		catalogo.put(organicos.getTipo(), organicos);
	}
}
