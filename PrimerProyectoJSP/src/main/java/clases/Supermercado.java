package clases;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	protected ArrayList<Producto>productos;
	
	public Supermercado() {
		super();
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void anadirProd (Producto p) {
		productos.add(p);
	}


	public void setProductos(Producto p) {
		productos.add(p);
	}


	public String getNombre() {
		return nombre;
	}
	
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public String getProductos2() {
		StringBuilder productoss= new StringBuilder();
		for (Producto p:productos) {
			productoss.append(p.toString()+ "\n");
		}
		String produc= productoss.toString();
		return produc;
	}
	
	@Override
	public String toString() {
		return "Supermercado [nombre=" + nombre + ", productos=" + productos + "]";
	}
	
	
	
	
}
