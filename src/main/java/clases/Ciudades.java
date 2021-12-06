package clases;

import java.io.Serializable;

public abstract class Ciudades implements Serializable {

    protected int _codigo;
    protected String _descripcion;

    public Ciudades() {
        super();
    }

    public Ciudades(String _descripcion) {
        super();
        this._descripcion = _descripcion;
    }

    public Ciudades(int _codigo, String _descripcion) {
        super();
        this._codigo = _codigo;
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
        if (_descripcion == null || _descripcion.equals("")) {
            throw new IllegalArgumentException("Descripción de la ciudad es un dato obligatorio");
        } else {
            this._descripcion = _descripcion;
        }
    }

    @Override
    public String toString() {
        String _infoClase = String.format("Codigo: %s, %s",
                this._codigo,
                this._descripcion);
        return _infoClase;
    }

}
