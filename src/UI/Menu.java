package UI;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends Pantalla{
        
    public static JPanel mostrarMenu() {
        JPanel panel = new JPanel();
        panel.setSize(200, 400);
        JButton ajustes = new JButton("Informacion");
        JButton tutorial = new JButton("Tutorial");
        JButton mapa = new JButton("Mapa");
        panel.add(ajustes);
        panel.add(tutorial);
        panel.add(mapa);
        return panel;
    }
	
    public void  acceder() {
		
    }
}
