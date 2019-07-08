package datos;

import javax.swing.ImageIcon;

public class Ordinarios extends Residuos{
    public Ordinarios() {
    	setTipo("Ordinarios");
    	setRecompensa(50);
    	setImagen(new ImageIcon("./img/ordinario.png").getImage());
    }
}
