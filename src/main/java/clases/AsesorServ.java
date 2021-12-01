package clases;

public class AsesorServ extends Persona{

	public AsesorServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AsesorServ(String _nombre, String _apellido, String _dni) {
		super(_nombre, _apellido, _dni);
		// TODO Auto-generated constructor stub
	}

	
	
	public AsesorServ(String _nombre, String _apellido, String _dni, int _codigo) {
		super(_nombre, _apellido, _dni, _codigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n-----------\nDatos del Asesor de Servicio: \n"+super.toString()+"\n-----------";
	}


	
	
	
	
}
