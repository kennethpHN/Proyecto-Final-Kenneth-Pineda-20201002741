package clases;

import java.io.Serializable;

public class Asiento implements Serializable {

    private int _codigo;

    public Asiento() {
    }

    public Asiento(int _codigo) {
        super();
        this._codigo = _codigo;
    }

    public int get_codigo() {
        return _codigo;
    }

    public void set_codigo(int _codigo) {
        this._codigo = _codigo;
    }

    @Override
    public String toString() {
        String _infoClase = String.format("Asiento # %s",
                this._codigo
        );
        return _infoClase;
    }

}
