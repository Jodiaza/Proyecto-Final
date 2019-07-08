package GUI;

import java.awt.Image;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import datos.CatalogoResiduos;
import datos.Residuos;

public class PantallaDeResiduos{
	
	public void mostrarCatalogo(JFrame frame) {
		HashMap<String, Residuos> catalogo = CatalogoResiduos.getCatalogo();
		Image atras = new ImageIcon("./img/atras.png").getImage();
		
		JScrollPane panel = new JScrollPane();
		panel.setSize(frame.getWidth(), frame.getHeight());
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		
		JButton button = new JButton(PantallaInicio.escalar(catalogo.get("plastico").getImagen(), 90, 90));
		button.setSize(100, 100);
		panel.add(button);
		
		JButton button1 = new JButton(PantallaInicio.escalar(catalogo.get("vidrio").getImagen(), 90, 90));
		button1.setSize(100, 100);
		panel.add(button1);
		
		JButton button2 = new JButton(PantallaInicio.escalar(catalogo.get("papel").getImagen(), 90, 90));
		button2.setSize(100, 100);
		panel.add(button2);
		
		JButton button3 = new JButton(PantallaInicio.escalar(catalogo.get("carton").getImagen(), 90, 90));
		button3.setSize(100, 100);
		panel.add(button3);
		
		JButton button4 = new JButton(PantallaInicio.escalar(catalogo.get("peligroso").getImagen(), 90, 90));
		button4.setSize(100, 100);
		panel.add(button4);
		
		JButton button5 = new JButton(PantallaInicio.escalar(catalogo.get("organico").getImagen(), 90, 90));
		button5.setSize(100, 100);
		panel.add(button5);
		
		JButton button6 = new JButton(PantallaInicio.escalar(catalogo.get("ordinario").getImagen(), 90, 90));
		button6.setSize(100, 100);
		panel.add(button6);
		
		JPanel esquina = new JPanel();
		esquina.setBounds(10, 10, 40, 40);
		esquina.setLayout(null);
		
		JButton button7 = new JButton(PantallaInicio.escalar(atras, 30, 30));
		button7.setSize(40, 40);
		esquina.add(button7);
	}
	
	public void acceder() {
		
	}

}
