package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import com.sun.prism.Graphics;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;

public class PantallaInicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio window = new PantallaInicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image comer = new ImageIcon("./img/comer.png").getImage();
		Image mueble = new ImageIcon("./img/tienda.png").getImage();
		Image ajustes = new ImageIcon("./img/ajustes.png").getImage();
		Image menu = new ImageIcon("./img/menu.png").getImage();
		Image dinero  = new ImageIcon("./img/dinero.png").getImage();
		Image salud  = new ImageIcon("./img/salud.png").getImage();
		HojaSprites hoja = new HojaSprites("HojaSprites");
		
		NuevoJPanel panel = new NuevoJPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setBounds(47, 391, 40, 40);
		panel.add(btnNewButton);
		btnNewButton.setIcon(escalar(comer, 30, 30));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(118, 391, 40, 40);
		panel.add(btnNewButton_1);
		btnNewButton_1.setIcon(escalar(mueble, 30, 30));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(187, 391, 40, 40);
		panel.add(btnNewButton_2);
		btnNewButton_2.setIcon(escalar(ajustes, 30, 30));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(10, 11, 40, 40);
		panel.add(btnNewButton_3);
		btnNewButton_3.setIcon(escalar(menu, 30, 30));
		
		BufferedImage[] sprites = hoja.generarSprites(0);
		JLabel lblNewLabel = new JLabel(escalar(sprites[0],140,105));
		lblNewLabel.setBounds(68, 253, 140, 105);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(escalar(dinero, 45, 45));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(224, 11, 50, 50);
		panel.add(lblNewLabel_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(119, 29, 132, 14);
		panel.add(progressBar);
		
		JLabel lblNewLabel_2 = new JLabel(escalar(salud, 35, 35));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(223, 52, 50, 50);
		panel.add(lblNewLabel_2);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(118, 71, 132, 14);
		panel.add(progressBar_1);
		
		/*for(int i=1; i<sprites.length;i++) {
			lblNewLabel.setIcon(escalar(sprites[i],140,105));
			try
			{
			    Thread.sleep(200);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
		}*/
		
	}
	
	public ImageIcon escalar(Image imagen, int ancho, int largo) {
		ImageIcon nuevaImagen = new ImageIcon(imagen.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH));
		return nuevaImagen;
	}
	
	public ImageIcon escalar(Image imagen, JPanel panel) {
		ImageIcon nuevaImagen = new ImageIcon(imagen.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH));
		return nuevaImagen;
	}
}
