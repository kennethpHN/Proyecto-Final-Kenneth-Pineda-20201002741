package clases;

import java.io.Serializable;

public class NumPuerta implements Serializable{
	
	private int _codigo;

	public NumPuerta() {
	}

	public NumPuerta(int codigo) {
		super();
		this._codigo = codigo;
	}

	public int get_codigo() {
		return _codigo;
	}

	public void set_codigo(int codigo) {
		this._codigo = codigo;
	}

	@Override
	public String toString() {
		String _infoClase = String.format("Numero de puerta codigo: %s",
				this._codigo);
		return _infoClase;
	}
	
}
