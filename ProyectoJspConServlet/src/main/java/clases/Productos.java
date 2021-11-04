package clases;

import java.util.ArrayList;
import java.util.HashMap;

public class Productos {
	protected ArrayList<Producto> productos;

	public Productos() {
		super();
		this.productos = new ArrayList<Producto>();
		init();
	}
	/**public void init() {/**Producto y cantidad**/
/**		productos.put("leche",0);
		productos.put("pollo",0);
		productos.put("cereales",0);
		productos.put("zumo",0);
		
	}**/
	public void init () {
		
		/**Crear productos**/
		Producto p1= new Producto("leche", 2, 0);
		Producto p2= new Producto("pollo", 2, 0);
		Producto p3= new Producto("cereales", 2, 0);
		Producto p4= new Producto("zumo", 2, 0);
		/**Anadimos los productos en el array**/
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		
		
	}
public ArrayList<Producto> getProductos() {
	return productos;
}
@Override
public String toString() {
	return "Productos [productos=" + productos + "]";
}
	
	
	
	
	
	
}