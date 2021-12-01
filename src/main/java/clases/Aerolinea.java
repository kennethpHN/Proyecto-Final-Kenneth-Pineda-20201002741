package clases;

public class Aerolinea {
	
	private int _codigo;
	private String _descripcion;
	
	public Aerolinea() {
	}
	
	public Aerolinea(String _descripcion) {
		super();
		this._descripcion = _descripcion;
	}

	public int get_codigo() {
		return _codigo;
	}

	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	@Override
	public String toString() {
		String _infoClase = String.format("--------\nCodigo: %s, Nombre de la Aerolinea: %s,",
				this._codigo,
				this._descripcion
				
				
				
				);
		
		return _infoClase;
	}
	
	

}
