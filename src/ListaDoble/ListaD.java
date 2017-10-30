package ListaDoble;

public class ListaD {
	private NodoD cabeza;
	private NodoD cola;

	
	public NodoD getCabeza() {
		return cabeza;
	}
	public void setCabeza(NodoD cabeza) {
		this.cabeza = cabeza;
	}
	public NodoD getCola() {
		return cola;
	}
	public void setCola(NodoD cola) {
		this.cola = cola;
	}
	public ListaD()
	{
		cabeza=null;
		cola=null;
		
	}
	public boolean isVacio() {// creamos el metodo de tipo booleano isVacio 
		boolean respuesta=false; // creamos una variable boolean con el nombre="respuesta" y la inicializamos en true
		if(this.cabeza==null){
			respuesta=true;
		}
		return respuesta;
	}
	public void insertarinicio(Music dato)
	{
		if(isVacio()) {
			cabeza=new NodoD(dato,null,null);
			cola=cabeza;
		}
		else {
			NodoD nuevo=new NodoD(dato,cabeza,null);
			cabeza.setAnterior(nuevo);
			cabeza=nuevo;
		}
	}

	
	
	public void insertarfinal(Music datos) {
		if(cola==null) {
			cola=new NodoD(datos,null,null);
			cabeza=cola;
		}else {
			NodoD nuevo=new NodoD(datos,null,cola);
			cola.setSiguiente(nuevo);
			cola=nuevo;
		}
	
	}
	
	public Music  eliminarprimer() {
		Music valor=cabeza.getValor();
		cabeza=cabeza.getSiguiente();
		if(cabeza!=null) {
			cabeza.setAnterior(null);
			
		}else {
			cola=null;
		}
		return valor;
		
	}
	
	public Music  eliminarultimo() {
		Music valor=cola.getValor();
		cola=cola.getAnterior();
		if(cola!=null) {
			cabeza.setSiguiente(null);
			
		}else {
			cabeza=null;
		}
		return valor;	
	}
	
	
	
	public StringBuilder imprimiradelante() {
		StringBuilder cadena = new StringBuilder();
	    NodoD temp=cabeza;
	    cadena.append("NULL<---> ");
	    while(temp!=null) {
	    	cadena.append(temp.getValor());
	    	cadena.append("-->");
			temp=temp.getSiguiente();
	    	
	    }
		cadena.append("NULL");
		return cadena;
	}
	
	
	public StringBuilder imprimiratras() {
		StringBuilder cadena = new StringBuilder();
	    NodoD temp=cola;
	    cadena.append("NULL<---> ");
	    while(temp!=null) {
	    	cadena.append(temp.getValor());
	    	cadena.append("-->");
			temp=temp.getAnterior();
	    	
	    }
		cadena.append("NULL");
		return cadena;
	}

}
