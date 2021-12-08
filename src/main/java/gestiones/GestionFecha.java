package gestiones;

import clases.Fecha;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class GestionFecha implements Serializable {

    private LinkedList<Fecha> lstFecha = new LinkedList<>();

    public GestionFecha() {
        super();
    }

    public LinkedList<Fecha> getLstFecha() {
        return lstFecha;
    }

    /**
     * Metodo utilizado para agregar fecha con un id auto-incrementable
     *
     * @param fecha fecha de tipo Fecha
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(Fecha fecha) {
        fecha.set_codigo(lstFecha.size() + 1);
        lstFecha.add(fecha);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoFecha elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, Fecha nuevoFecha) {
        if (posicion < 0 || posicion > lstFecha.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorcodigo(nuevoFecha.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstFecha.set(posicion, nuevoFecha);
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
        if (posicion < 0 || posicion > lstFecha.size()) {
            return false;
        } else {
            lstFecha.remove(posicion);
            return true;
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, descripcion
        Object[][] array = new Object[this.lstFecha.size()][2];
        for (int i = 0; i < lstFecha.size(); i++) {
            System.out.println(lstFecha.get(i));
            array[i][0] = lstFecha.get(i).get_codigo();
            array[i][1] = lstFecha.get(i).get_descripcion();
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
        for (int i = 0; i < lstFecha.size(); i++) {
            if (lstFecha.get(i).get_codigo() == codigo) {
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
    public Fecha BuscarPorCodigoGetElem(int codigo) {
        Fecha fechaObtenido = null;
        for (int i = 0; i < lstFecha.size(); i++) {
            if (lstFecha.get(i).get_codigo() == codigo) {
                fechaObtenido = lstFecha.get(i);
                break;

            }
        }
        return fechaObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstFecha.size(); i++) {
            System.out.println(lstFecha.get(i));
        }
    }

    public Fecha getElementoPorPosicion(int posicion) {
        return lstFecha.get(posicion);

    }

    public DefaultComboBoxModel getCboModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < lstFecha.size(); i++) {
            model.addElement(lstFecha.get(i).get_descripcion());
        }
        return model;
    }

    public String getInfoReporte() {
        String _resultado = "Código; Descripción; \n";
        for (int i = 0; i < lstFecha.size(); i++) {
            _resultado += lstFecha.get(i).get_codigo() + ";" + lstFecha.get(i).get_descripcion() + ";\n";
        }
        return _resultado;
    }

}
