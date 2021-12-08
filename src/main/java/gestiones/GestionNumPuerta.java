package gestiones;

import clases.NumPuerta;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class GestionNumPuerta implements Serializable {

    private LinkedList<NumPuerta> lstNumPuerta = new LinkedList<>();

    public GestionNumPuerta() {
        super();
    }

    public LinkedList<NumPuerta> getLstNumPuerta() {
        return lstNumPuerta;
    }

    /**
     * Metodo utilizado para agregar numPuerta con un id auto-incrementable
     *
     * @param numPuerta numPuerta de tipo NumPuerta
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(NumPuerta numPuerta) {
        numPuerta.set_codigo(lstNumPuerta.size() + 1);
        lstNumPuerta.add(numPuerta);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoNumPuerta elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, NumPuerta nuevoNumPuerta) {
        if (posicion < 0 || posicion > lstNumPuerta.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorcodigo(nuevoNumPuerta.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstNumPuerta.set(posicion, nuevoNumPuerta);
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
        if (posicion < 0 || posicion > lstNumPuerta.size()) {
            return false;
        } else {
            lstNumPuerta.remove(posicion);
            return true;
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, descripcion
        Object[][] array = new Object[this.lstNumPuerta.size()][1];
        for (int i = 0; i < lstNumPuerta.size(); i++) {
            System.out.println(lstNumPuerta.get(i));
            array[i][0] = lstNumPuerta.get(i).get_codigo();
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
        for (int i = 0; i < lstNumPuerta.size(); i++) {
            if (lstNumPuerta.get(i).get_codigo() == codigo) {
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
    public NumPuerta BuscarPorcodigoGetElem(int codigo) {
        NumPuerta numPuertaObtenido = null;
        for (int i = 0; i < lstNumPuerta.size(); i++) {
            if (lstNumPuerta.get(i).get_codigo() == codigo) {
                numPuertaObtenido = lstNumPuerta.get(i);
                break;

            }
        }
        return numPuertaObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstNumPuerta.size(); i++) {
            System.out.println(lstNumPuerta.get(i));
        }
    }

    public NumPuerta getElementoPorPosicion(int posicion) {
        return lstNumPuerta.get(posicion);

    }
    public DefaultComboBoxModel getCboModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < lstNumPuerta.size(); i++) {
            model.addElement(lstNumPuerta.get(i).get_codigo());
        }
        return model;
    }
    
    
    public String getInfoReporte() {
        String _resultado = "Código; \n";
        for (int i = 0; i < lstNumPuerta.size(); i++) {
            _resultado += lstNumPuerta.get(i).get_codigo() + ";\n";
        }
        return _resultado;
    }

}
