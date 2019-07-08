package datos;

import javax.swing.ImageIcon;

public class Organicos  extends Residuos {
	public Organicos() {
		setTipo("Ordinarios");
    	setRecompensa(200);
    	setImagen(new ImageIcon("./img/organico.png").getImage());
	}
}
