package ListaDoble;

public class NodoD {
	private Music datos;
	private NodoD siguiente;
	private NodoD anterior;
	
	public NodoD(Music dato, NodoD sig,NodoD ant) {
		siguiente=sig;
		anterior=ant;
		datos=dato;
	}
	
	
	public Music getValor() {
		return datos;
	}
	public void setValor(Music valor) {
		this.datos = valor;
	}
	public NodoD getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoD siguiente) {
		this.siguiente = siguiente;
	}
	public NodoD getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoD anterior) {
		this.anterior = anterior;
	}
	

}
