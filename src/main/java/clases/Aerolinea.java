package clases;

import java.io.Serializable;

public class Aerolinea implements Serializable {

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
        if (_descripcion == null || _descripcion.equals("")) {
            throw new IllegalArgumentException("Descripción de la aerolinea es un dato obligatorio");
        } else {
            this._descripcion = _descripcion;
        }
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
