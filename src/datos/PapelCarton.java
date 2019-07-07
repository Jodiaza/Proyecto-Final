package datos;

public class PapelCarton extends Residuos{
    public PapelCarton(int  cantidad) {
    	setCantidad(cantidad);
    	setTipo("Papel o carton");
    	setRecompensa(100);
    }
}
