package aplicacionISI;

import java.util.ArrayList;

public class Juego{
	String nombre;
	String plataforma;
	ArrayList<Precios> money = new ArrayList();
	String precio;
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public void setPrecio(String p) {
		this.precio = p;
	}
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public String getPrecio() {
		return(this.precio);
	}

	
}