package datos;
import java.util.*;

public abstract class Personaje implements Sonido{
    
    private String nombre;
    private ArrayList<Articulo> articulos;
    private int salud;

    public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public void comer() {
    	
    }
    
    public void saltar() {
    	
    }
    
    public void enfermarse() {
    	
    }
    
    @Override
	public void emitirSonido() {
		
	}
}
