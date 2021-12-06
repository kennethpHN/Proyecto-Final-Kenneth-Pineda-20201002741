package clases;

import java.io.Serializable;

public class CategVuelo implements Serializable{

	private int _id;
	private int _precio;
	private String _descripcion;
	
	public CategVuelo() {
	}

	public CategVuelo(int _id, int _precio, String _descripcion) {
		super();
		this._id = _id;
		this._precio = _precio;
		this._descripcion = _descripcion;
	}
	
	

	public CategVuelo(int _precio, String _descripcion) {
		super();
		this._precio = _precio;
		this._descripcion = _descripcion;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int get_precio() {
		return _precio;
	}

	public void set_precio(int _precio) {
		this._precio = _precio;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	@Override
	public String toString() {
		String _infoClase = String.format("id: %d, Categoria de vuelo: %s, Precio: %s",
				this._id,
				this._descripcion,
				this._precio);
		return _infoClase;
	}
	
	
	
}
