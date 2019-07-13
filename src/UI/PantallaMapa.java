package UI;

import java.util.ArrayList;

public class PantallaMapa extends Pantalla{
	
	private ArrayList<int []> puntosDeReciclaje; 
	private ArrayList<int []> puntosDeResiduosPeligrosos;
	
	public ArrayList<int[]> getPuntosDeReciclaje() {
		return puntosDeReciclaje;
	}
	
	public void setPuntosDeReciclaje(ArrayList<int[]> puntosDeReciclaje) {
		this.puntosDeReciclaje = puntosDeReciclaje;
	}
	
	public ArrayList<int[]> getPuntosDeResiduosPeligrosos() {
		return puntosDeResiduosPeligrosos;
	}
	
	public void setPuntosDeResiduosPeligrosos(ArrayList<int[]> puntosDeResiduosPeligrosos) {
		this.puntosDeResiduosPeligrosos = puntosDeResiduosPeligrosos;
	}
	
	public void  mostrarInformacion() {
		
	}
}
