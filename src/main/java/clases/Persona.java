package clases;

import java.io.Serializable;

public class Persona implements Serializable {

    protected String _nombre;
    protected String _apellido;
    protected String _dni;
    protected int _codigo;

    public Persona() {
        super();
    }

    public Persona(String _nombre, String _apellido, String _dni) {
        super();
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._dni = _dni;
    }

    public Persona(String _nombre, String _apellido, String _dni, int _codigo) {
        super();
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._dni = _dni;
        this._codigo = _codigo;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        if (_nombre == null || _nombre.equals("")) {
            throw new IllegalArgumentException("El ingreso del nombre es obligatorio");
        } else {
            this._nombre = _nombre;
        }
    }

    public String get_apellido() {
        return _apellido;
    }

    public void set_apellido(String _apellido) {
        if (_apellido == null || _apellido.equals("")) {
            throw new IllegalArgumentException("El ingreso del apellido es obligatorio");
        } else {
            this._apellido = _apellido;
        }
    }

    public String get_dni() {
        return _dni;
    }

    public void set_dni(String _dni) {
        if (_dni == null || _dni.equals("")) {
            throw new IllegalArgumentException("El ingreso del DNI es obligatorio");
        } else {
            this._dni = _dni;
        }
    }

    public int get_codigo() {
        return _codigo;
    }

    public void set_codigo(int _codigo) {
        if (_codigo <= 0) {
            throw new IllegalArgumentException("El código es incorrecto");
        } else {
            this._codigo = _codigo;
        }

    }

    @Override
    public String toString() {

        String _infoClase = String.format("Codigo: %s, \nNombre: %s %s, \ndni: %s,",
                this._codigo,
                this._nombre,
                this._apellido,
                this._dni
        );

        return _infoClase;
    }

}
