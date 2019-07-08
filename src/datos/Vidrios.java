package datos;

import javax.swing.ImageIcon;

public class Vidrios extends Residuos{
    public Vidrios() {
    	setTipo("Vidrios");
    	setRecompensa(500);
    	setImagen(new ImageIcon("./img/vidrio.png").getImage());
    }
}
