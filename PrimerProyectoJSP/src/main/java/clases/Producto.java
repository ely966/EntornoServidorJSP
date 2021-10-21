package clases;

import java.util.Objects;

public class Producto {
	private int id;
	private String nombre;
	private int precio;
	private int idsig=1;
	
	public Producto () {
		super();
		this.id=idsig;
		this.nombre = nombre;
		this.precio=precio;
		this.idsig=idsig+1;
	}

	public int getId() {
		return id;
	}
	


	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public int getIdsig() {
		return idsig;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
