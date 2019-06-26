package GUI;

public class PantallaAjustes extends Pantalla{
	
	private int volumen;
	private int sonidoFX;
	private boolean notificaciones;
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getSonidoFX() {
		return sonidoFX;
	}
	
	public void setSonidoFX(int sonidoFX) {
		this.sonidoFX = sonidoFX;
	}
	
	public boolean isNotificaciones() {
		return notificaciones;
	}
	
	public void setNotificaciones(boolean notificaciones) {
		this.notificaciones = notificaciones;
	}
	
}
