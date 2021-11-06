package clases;

import java.util.HashMap;
public class Usuarios {
	private String nombre;
	protected HashMap<String,String> usuarioss;

	public Usuarios() {
		super();
		nombre="Userss";
		usuarioss = new HashMap<String,String>();
		init(); /**Anadirle los usuarios inicialmente**/
	}
	public void init () {
		usuarioss.put("Pedro", "Pedro");
		usuarioss.put("Maria","Maria");
		usuarioss.put("Antonio","Antonio");
	}
	
	public boolean comprobar (String usuario,String pass) {
		boolean comprobacion= false; /**Iniciamos diciendo que el usuario no existe**/
		for (String user : usuarioss.keySet()) { /**Recorremos ls usuarios**/
			if (user.equals(usuario)) {/**Si el usuario introducido coincide con algun usuario de la array, que cambie**/
				if(user.equals(pass)) {
					comprobacion = true;
				}
			}
		}
		//if(comprobacion ==false) {
		//	throw new RuntimeException("Error, el usuario no existe");
			
		//}
		return comprobacion;
	}
	public String getNombre() {
		return nombre;
	}
	public HashMap<String, String> getUsuarioss() {
		return usuarioss;
	}
	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", Usuarioss=" + usuarioss + "]";
	}
	
}

