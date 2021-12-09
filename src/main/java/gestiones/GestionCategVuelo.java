package gestiones;

import clases.CategVuelo;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class GestionCategVuelo implements Serializable {

    private LinkedList<CategVuelo> lstCategVuelo = new LinkedList<>();

    public GestionCategVuelo() {
        super();
    }

    public LinkedList<CategVuelo> getLstCategVuelo() {
        return lstCategVuelo;
    }

    /**
     * Metodo utilizado para agregar categVuelo con un id auto-incrementable
     *
     * @param categVuelo categVuelo de tipo CategVuelo
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(CategVuelo categVuelo) {
        categVuelo.set_codigo(lstCategVuelo.size() + 1);
        lstCategVuelo.add(categVuelo);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoCategVuelo elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, CategVuelo nuevoCategVuelo) {
        if (posicion < 0 || posicion > lstCategVuelo.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorId(nuevoCategVuelo.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstCategVuelo.set(posicion, nuevoCategVuelo);
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
        if (posicion < 0 || posicion > lstCategVuelo.size()) {
            return false;
        } else {
            lstCategVuelo.remove(posicion);
            return true;
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, precio, descripcion
        Object[][] array = new Object[this.lstCategVuelo.size()][3];
        for (int i = 0; i < lstCategVuelo.size(); i++) {
            System.out.println(lstCategVuelo.get(i));
            array[i][0] = lstCategVuelo.get(i).get_codigo();
            array[i][1] = lstCategVuelo.get(i).get_precio();
            array[i][2] = lstCategVuelo.get(i).get_descripcion();
        }
        return array;
    }

    /**
     * Metodo para buscar elementos de la coleccion por su codigo
     *
     * @param codigo del elemento a buscar
     * @return posicion del elemento
     */
    public int BuscarPorId(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstCategVuelo.size(); i++) {
            if (lstCategVuelo.get(i).get_codigo() == codigo) {
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
    public CategVuelo BuscarPorCodigoGetElem(int codigo) {
        CategVuelo categVueloObtenido = null;
        for (int i = 0; i < lstCategVuelo.size(); i++) {
            if (lstCategVuelo.get(i).get_codigo() == codigo) {
                categVueloObtenido = lstCategVuelo.get(i);
                break;

            }
        }
        return categVueloObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstCategVuelo.size(); i++) {
            System.out.println(lstCategVuelo.get(i));
        }
    }

    public CategVuelo getElementoPorPosicion(int posicion) {
        return lstCategVuelo.get(posicion);

    }

    public DefaultComboBoxModel getCboModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < lstCategVuelo.size(); i++) {
            model.addElement(lstCategVuelo.get(i).get_descripcion());
        }
        return model;
    }

    public String getInfoReporte() {
        String _resultado = "Código; precio ;Descripción; \n";
        for (int i = 0; i < lstCategVuelo.size(); i++) {
            _resultado += lstCategVuelo.get(i).get_codigo() 
                    + ";" + lstCategVuelo.get(i).get_precio() 
                    + ";" + lstCategVuelo.get(i).get_descripcion() + ";\n";
        }
        return _resultado;
    }
}
