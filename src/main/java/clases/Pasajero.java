package clases;

public class Pasajero  extends Persona{



	public Pasajero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pasajero(String _nombre, String _apellido, String _dni, int _codigo) {
		super(_nombre, _apellido, _dni, _codigo);
		// TODO Auto-generated constructor stub
	}

	public Pasajero(String _nombre, String _apellido, String _dni) {
		super(_nombre, _apellido, _dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "-----------\nDatos del Pasajero: \n"+super.toString()+"\n-----------";
	}


	
	
	
	
}
