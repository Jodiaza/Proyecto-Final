package datos;

import javax.swing.ImageIcon;

public class Papel extends Residuos{
    public Papel() {
    	setTipo("Papel");
    	setRecompensa(100);
    	setImagen(new ImageIcon("./img/papel.png").getImage());
    }
}
