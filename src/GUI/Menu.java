package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends Pantalla{
	
    static int ancho = 500;
    static int alto = 500;
        
    public static void mostrarMenu() {
        JFrame menu = new JFrame("Menu");
        menu.setSize(ancho, alto);
        menu.setVisible(true);
        JPanel panel = new JPanel();
        menu.add(panel);
        JButton ajustes = new JButton("Ajustes");
        JButton tutorial = new JButton("Tutorial");
        JButton mapa = new JButton("Mapa");
        panel.add(ajustes);
        panel.add(tutorial);
        panel.add(mapa);
    }
	
    public void  acceder() {
		
    }
}
