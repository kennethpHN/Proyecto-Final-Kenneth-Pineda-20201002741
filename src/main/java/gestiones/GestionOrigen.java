package gestiones;

import clases.Origen;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class GestionOrigen implements Serializable {

    private LinkedList<Origen> lstOrigen = new LinkedList<>();

    public GestionOrigen() {
        super();
    }

    public LinkedList<Origen> getLstOrigen() {
        return lstOrigen;
    }

    /**
     * Metodo utilizado para agregar origen con un codigo auto-incrementable
     *
     * @param origen origen de tipo Origen
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(Origen origen) {
        origen.set_codigo(lstOrigen.size() + 1);
        lstOrigen.add(origen);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoOrigen elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, Origen nuevoOrigen) {
        if (posicion < 0 || posicion > lstOrigen.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorcodigo(nuevoOrigen.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstOrigen.set(posicion, nuevoOrigen);
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
        if (posicion < 0 || posicion > lstOrigen.size()) {
            return false;
        } else {
            lstOrigen.remove(posicion);
            return true;
        }
    }

    /**
     * Metodo para buscar elementos de la coleccion por su codigo
     *
     * @param codigo del elemento a buscar
     * @return posicion del elemento
     */
    public int BuscarPorcodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstOrigen.size(); i++) {
            if (lstOrigen.get(i).get_codigo() == codigo) {
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
    public Origen BuscarPorcodigoGetElem(int codigo) {
        Origen origenObtencodigo = null;
        for (int i = 0; i < lstOrigen.size(); i++) {
            if (lstOrigen.get(i).get_codigo() == codigo) {
                origenObtencodigo = lstOrigen.get(i);
                break;

            }
        }
        return origenObtencodigo;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstOrigen.size(); i++) {
            System.out.println(lstOrigen.get(i));
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, descripcion
        Object[][] array = new Object[this.lstOrigen.size()][2];
        for (int i = 0; i < lstOrigen.size(); i++) {
            System.out.println(lstOrigen.get(i));
            array[i][0] = lstOrigen.get(i).get_codigo();
            array[i][1] = lstOrigen.get(i).get_descripcion();
        }
        return array;
    }

    public Origen getElementoPorPosicion(int posicion) {
        return lstOrigen.get(posicion);

    }

    public DefaultComboBoxModel getCboModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < lstOrigen.size(); i++) {
            model.addElement(lstOrigen.get(i).get_descripcion());
        }
        return model;
    }

    public String getInfoReporte() {
        String _resultado = "Código; Descripción; \n";
        for (int i = 0; i < lstOrigen.size(); i++) {
            _resultado += lstOrigen.get(i).get_codigo() + ";" + lstOrigen.get(i).get_descripcion() + ";\n";
        }
        return _resultado;
    }
}
