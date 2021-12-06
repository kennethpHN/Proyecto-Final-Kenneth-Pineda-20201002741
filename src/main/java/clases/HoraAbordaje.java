package clases;

import java.io.Serializable;

public class HoraAbordaje implements Serializable {

    private int _codigo;
    private String _descripcion;

    public HoraAbordaje() {
    }

    public HoraAbordaje(int codigo, String descripcion) {
        super();
        this._codigo = codigo;
        this._descripcion = descripcion;
    }

    public HoraAbordaje(String _descripcion) {
        super();
        this._descripcion = _descripcion;
    }

    public int get_codigo() {
        return _codigo;
    }

    public void set_codigo(int codigo) {
        this._codigo = codigo;
    }

    public String get_descripcion() {
        return _descripcion;
    }

    public void set_descripcion(String _descripcion) {
        if (_descripcion == null || _descripcion.equals("")) {
            throw new IllegalArgumentException("Descripción de la Hora de Abordaje es un dato obligatorio");
        } else {
            this._descripcion = _descripcion;
        }
    }

    @Override
    public String toString() {
        String _infoClase = String.format("Codigo: %s, Hora de Abordaje: %s",
                this._codigo,
                this._descripcion);
        return _infoClase;
    }

}
