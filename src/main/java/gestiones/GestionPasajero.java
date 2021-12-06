package gestiones;

import clases.Pasajero;
import java.io.Serializable;
import java.util.LinkedList;

public class GestionPasajero implements Serializable {

    private LinkedList<Pasajero> lstPasajero = new LinkedList<>();

    public GestionPasajero() {
        super();
    }

    public LinkedList<Pasajero> getLstPasajero() {
        return lstPasajero;
    }

    /**
     * Metodo utilizado para agregar pasajero con un id auto-incrementable
     *
     * @param pasajero pasajero de tipo Pasajero
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(Pasajero pasajero) {
        pasajero.set_codigo(lstPasajero.size() + 1);
        lstPasajero.add(pasajero);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoPasajero elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, Pasajero nuevoPasajero) {
        if (posicion < 0 || posicion > lstPasajero.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorId(nuevoPasajero.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstPasajero.set(posicion, nuevoPasajero);
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
        if (posicion < 0 || posicion > lstPasajero.size()) {
            return false;
        } else {
            lstPasajero.remove(posicion);
            return true;
        }
    }

    /**
     * Metodo para buscar elementos de la coleccion por su codigo
     *
     * @param codigo del elemento a buscar
     * @return posicion del elemento
     */
    public int BuscarPorId(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstPasajero.size(); i++) {
            if (lstPasajero.get(i).get_codigo() == codigo) {
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
    public Pasajero BuscarPorcodigoGetElem(int codigo) {
        Pasajero pasajeroObtenido = null;
        for (int i = 0; i < lstPasajero.size(); i++) {
            if (lstPasajero.get(i).get_codigo() == codigo) {
                pasajeroObtenido = lstPasajero.get(i);
                break;

            }
        }
        return pasajeroObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstPasajero.size(); i++) {
            System.out.println(lstPasajero.get(i));
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, dni, nombre, apellido
        Object[][] array = new Object[this.lstPasajero.size()][4];
        for (int i = 0; i < lstPasajero.size(); i++) {
            System.out.println(lstPasajero.get(i));
            array[i][0] = lstPasajero.get(i).get_codigo();
            array[i][1] = lstPasajero.get(i).get_dni();
            array[i][2] = lstPasajero.get(i).get_nombre();
            array[i][3] = lstPasajero.get(i).get_apellido();

        }
        return array;
    }

    public Pasajero getElementoPorPosicion(int posicion) {
        return lstPasajero.get(posicion);

    }

    public String getInfoReporte() {
        String _resultado = "Código; DNI; Nombres; Apellidos; \n";
        for (int i = 0; i < lstPasajero.size(); i++) {
            _resultado += lstPasajero.get(i).get_codigo() + ";" + lstPasajero.get(i).get_dni() + ";"+lstPasajero.get(i).get_nombre()+ ";" + lstPasajero.get(i).get_apellido()+ ";\n";
        }
        return _resultado;
    }

}
