package gestiones;

import clases.HoraAbordaje;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

public class GestionHoraAbordaje implements Serializable {

    private LinkedList<HoraAbordaje> lstHoraAbordaje = new LinkedList<>();

    public GestionHoraAbordaje() {
        super();
    }

    public LinkedList<HoraAbordaje> getLstHoraAbordaje() {
        return lstHoraAbordaje;
    }

    /**
     * Metodo utilizado para agregar horaAbordaje con un id auto-incrementable
     *
     * @param horaAbordaje horaAbordaje de tipo HoraAbordaje
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(HoraAbordaje horaAbordaje) {
        horaAbordaje.set_codigo(lstHoraAbordaje.size() + 1);
        lstHoraAbordaje.add(horaAbordaje);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoHoraAbordaje elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, HoraAbordaje nuevoHoraAbordaje) {
        if (posicion < 0 || posicion > lstHoraAbordaje.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorcodigo(nuevoHoraAbordaje.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstHoraAbordaje.set(posicion, nuevoHoraAbordaje);
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
        if (posicion < 0 || posicion > lstHoraAbordaje.size()) {
            return false;
        } else {
            lstHoraAbordaje.remove(posicion);
            return true;
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, descripcion
        Object[][] array = new Object[this.lstHoraAbordaje.size()][2];
        for (int i = 0; i < lstHoraAbordaje.size(); i++) {
            System.out.println(lstHoraAbordaje.get(i));
            array[i][0] = lstHoraAbordaje.get(i).get_codigo();
            array[i][1] = lstHoraAbordaje.get(i).get_descripcion();
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
        for (int i = 0; i < lstHoraAbordaje.size(); i++) {
            if (lstHoraAbordaje.get(i).get_codigo() == codigo) {
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
    public HoraAbordaje BuscarPorCodigoGetElem(int codigo) {
        HoraAbordaje horaAbordajeObtenido = null;
        for (int i = 0; i < lstHoraAbordaje.size(); i++) {
            if (lstHoraAbordaje.get(i).get_codigo() == codigo) {
                horaAbordajeObtenido = lstHoraAbordaje.get(i);
                break;

            }
        }
        return horaAbordajeObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstHoraAbordaje.size(); i++) {
            System.out.println(lstHoraAbordaje.get(i));
        }
    }

    public HoraAbordaje getElementoPorPosicion(int posicion) {
        return lstHoraAbordaje.get(posicion);

    }

    public DefaultComboBoxModel getCboModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < lstHoraAbordaje.size(); i++) {
            model.addElement(lstHoraAbordaje.get(i).get_descripcion());
        }
        return model;
    }

    public String getInfoReporte() {
        String _resultado = "Código; Descripción; \n";
        for (int i = 0; i < lstHoraAbordaje.size(); i++) {
            _resultado += lstHoraAbordaje.get(i).get_codigo() + ";" + lstHoraAbordaje.get(i).get_descripcion() + ";\n";
        }
        return _resultado;
    }

}
