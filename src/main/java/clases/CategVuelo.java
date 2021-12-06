package clases;

import java.io.Serializable;

public class CategVuelo implements Serializable {

    private int _codigo;
    private int _precio;
    private String _descripcion;

    public CategVuelo() {
    }

    public CategVuelo(int _codigo, int _precio, String _descripcion) {
        super();
        this._codigo = _codigo;
        this._precio = _precio;
        this._descripcion = _descripcion;
    }

    public CategVuelo(int _precio, String _descripcion) {
        super();
        this._precio = _precio;
        this._descripcion = _descripcion;
    }

    public int get_codigo() {
        return _codigo;
    }

    public void set_codigo(int _codigo) {
        this._codigo = _codigo;
    }

    public int get_precio() {
        return _precio;
    }

    public void set_precio(int _precio) {
        if (_precio <= 0) {
            throw new IllegalArgumentException("Ingrese un precio mayor que 0");
        } else {
            this._precio = _precio;
        }
    }

    public String get_descripcion() {
        return _descripcion;
    }

    public void set_descripcion(String _descripcion) {
        if (_descripcion == null || _descripcion.equals("")) {
            throw new IllegalArgumentException("Descripción de la Categoria de vuelo es un dato obligatorio");
        } else {
            this._descripcion = _descripcion;
        }
    }

    @Override
    public String toString() {
        String _infoClase = String.format("código: %d, Categoria de vuelo: %s, Precio: %s",
                this._codigo,
                this._descripcion,
                this._precio);
        return _infoClase;
    }

}
