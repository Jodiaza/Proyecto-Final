package datos;

import javax.swing.ImageIcon;

public class Peligrosos extends Residuos{
	public Peligrosos() {
		setTipo("Peligrosos");
		setRecompensa(600);
		setImagen(new ImageIcon("./img/peligroso.png").getImage());
	}
}
