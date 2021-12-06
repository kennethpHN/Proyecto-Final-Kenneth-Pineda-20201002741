package gestiones;

import clases.Asiento;
import java.io.Serializable;
import java.util.LinkedList;

public class GestionAsiento implements Serializable {

    private LinkedList<Asiento> lstAsiento = new LinkedList<>();

    public GestionAsiento() {
        super();
    }

    public LinkedList<Asiento> getLstAsiento() {
        return lstAsiento;
    }

    /**
     * Metodo utilizado para agregar asiento con un id auto-incrementable
     *
     * @param asiento asiento de tipo Asiento
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(Asiento asiento) {
        asiento.set_codigo(lstAsiento.size() + 1);
        lstAsiento.add(asiento);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoAsiento elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, Asiento nuevoAsiento) {
        if (posicion < 0 || posicion > lstAsiento.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorcodigo(nuevoAsiento.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstAsiento.set(posicion, nuevoAsiento);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Metodo para eliminar elementos de la coleccion
     *
     * @param posicion del elemento a eliminar
     * @return true - si todo se realizo correctamente
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstAsiento.size()) {
            return false;
        } else {
            lstAsiento.remove(posicion);
            return true;
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, descripcion
        Object[][] array = new Object[this.lstAsiento.size()][1];
        for (int i = 0; i < lstAsiento.size(); i++) {
            System.out.println(lstAsiento.get(i));
            array[i][0] = lstAsiento.get(i).get_codigo();
        }
        return array;
    }

    /**
     * Metodo para buscar elementos de la coleccion por su codigo
     *
     * @param codigo del elemento a buscar
     * @return posicion del elemento
     */
    public int BuscarPorcodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstAsiento.size(); i++) {
            if (lstAsiento.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Metodo para buscar elementos de la coleccion por su codigo
     *
     * @param codigo del elemento a buscar
     * @return elemento de la coleccion
     */
    public Asiento BuscarPorcodigoGetElem(int codigo) {
        Asiento asientoObtenido = null;
        for (int i = 0; i < lstAsiento.size(); i++) {
            if (lstAsiento.get(i).get_codigo() == codigo) {
                asientoObtenido = lstAsiento.get(i);
                break;

            }
        }
        return asientoObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstAsiento.size(); i++) {
            System.out.println(lstAsiento.get(i));
        }
    }

    public Asiento getElementoPorPosicion(int posicion) {
        return lstAsiento.get(posicion);

    }

    public String getInfoReporte() {
        String _resultado = "Código; \n";
        for (int i = 0; i < lstAsiento.size(); i++) {
            _resultado += lstAsiento.get(i).get_codigo() +";\n";
        }
        return _resultado;
    }

}
