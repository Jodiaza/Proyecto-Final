package GUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NuevoJPanel extends JPanel{
	
	private String url = "fondo";
	private Image imagen = new ImageIcon("./img/"+url+".jpg").getImage();
	
	@Override
    public void paint(Graphics g) {
		
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }

}
