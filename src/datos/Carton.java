package datos;

import javax.swing.ImageIcon;

public class Carton extends Residuos{
	public Carton() {
    	setTipo("Carton");
    	setRecompensa(100);
    	setImagen(new ImageIcon("./img/carton.png").getImage());
    }
}
