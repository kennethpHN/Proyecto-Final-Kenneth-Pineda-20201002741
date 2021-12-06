package clases;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String _nombre, String _apellido, String _dni) {
		super(_nombre, _apellido, _dni);
		// TODO Auto-generated constructor stub
	}
	
	

	public Cliente(String _nombre, String _apellido, String _dni, int _codigo) {
		super(_nombre, _apellido, _dni, _codigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n-----------\nDatos del Cliente: \n"+super.toString()+"\n-----------";
	}


	
	
	
	
}
