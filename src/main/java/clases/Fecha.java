package clases;

import java.io.Serializable;
import java.util.Date;

public class Fecha implements Serializable {

    private int _codigo;
    private Date _descripcion;

    public Fecha() {
    }

    public Fecha(int codigo, Date descripcion) {
        super();
        this._codigo = codigo;
        this._descripcion = descripcion;
    }

    public Fecha(Date _descripcion) {
        super();
        this._descripcion = _descripcion;
    }

    public int get_codigo() {
        return _codigo;
    }

    public void set_codigo(int codigo) {
        this._codigo = codigo;
    }

    public Date get_descripcion() {
        return _descripcion;
    }

    public void set_descripcion(Date _descripcion) {
        if (_descripcion == null || _descripcion.equals("")) {
            throw new IllegalArgumentException("Descripción de la fecha es un dato obligatorio");
        } else {
            this._descripcion = _descripcion;
        }
    }

    @Override
    public String toString() {
        String _infoClase = String.format("Codigo: %s, Fecha: %s",
                this._codigo,
                this._descripcion);
        return _infoClase;
    }

}
