package clases;

import java.io.Serializable;

public class Destino extends Ciudades implements Serializable {

    public Destino() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Destino(String _descripcion) {
        super(_descripcion);
        // TODO Auto-generated constructor stub
    }

    public Destino(int _codigo, String _descripcion) {
        super(_codigo, _descripcion);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Ciudad de Destino: " + super.toString();
    }

}
