package GUI;

import java.awt.Color;

public abstract class Pantalla {
	private int ancho;
	private int alto;
	private int posicionX;
	private int posicionY;
	private Color color;
	
	public int getAncho() {
		return ancho;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public int getPosicionX() {
		return posicionX;
	}
	
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	
	public int getPosicionY() {
		return posicionY;
	}
	
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
}
