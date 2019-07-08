package datos;

import java.awt.Image;

public abstract class Residuos {
    
    private String tipo;
    private int recompensa;
    private Image imagen;

    public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public int getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}

	public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
