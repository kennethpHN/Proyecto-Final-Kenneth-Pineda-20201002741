package gestiones;

import java.util.LinkedList;
import clases.Aerolinea;
import java.io.Serializable;

public class GestionAerolinea implements Serializable {

    private LinkedList<Aerolinea> lstAerolinea = new LinkedList<>();

    public GestionAerolinea() {
        super();
    }

    public LinkedList<Aerolinea> getLstAerolinea() {
        return lstAerolinea;
    }

    /**
     * Metodo utilizado para agregar objeto con un id auto-incrementable
     *
     * @param aerolinea objeto de tipo Aerolinea
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(Aerolinea aerolinea) {
        aerolinea.set_codigo(lstAerolinea.size() + 1);
        lstAerolinea.add(aerolinea);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoClase elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, Aerolinea nuevoClase) {
        if (posicion < 0 || posicion > lstAerolinea.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorcodigo(nuevoClase.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstAerolinea.set(posicion, nuevoClase);
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
        if (posicion < 0 || posicion > lstAerolinea.size()) {
            return false;
        } else {
            lstAerolinea.remove(posicion);
            return true;
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, descripcion
        Object[][] array = new Object[this.lstAerolinea.size()][2];
        for (int i = 0; i < lstAerolinea.size(); i++) {
            System.out.println(lstAerolinea.get(i));
            array[i][0] = lstAerolinea.get(i).get_codigo();
            array[i][1] = lstAerolinea.get(i).get_descripcion();
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
        for (int i = 0; i < lstAerolinea.size(); i++) {
            if (lstAerolinea.get(i).get_codigo() == codigo) {
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
    public Aerolinea BuscarPorcodigoGetElem(int codigo) {
        Aerolinea objetoObtenido = null;
        for (int i = 0; i < lstAerolinea.size(); i++) {
            if (lstAerolinea.get(i).get_codigo() == codigo) {
                objetoObtenido = lstAerolinea.get(i);
                break;

            }
        }
        return objetoObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstAerolinea.size(); i++) {
            System.out.println(lstAerolinea.get(i));
        }
    }

    public Aerolinea getElementoPorPosicion(int posicion) {
        return lstAerolinea.get(posicion);

    }

    public String getInfoReporte() {
        String _resultado = "Código; Descripción; \n";
        for (int i = 0; i < lstAerolinea.size(); i++) {
            _resultado += lstAerolinea.get(i).get_codigo() + ";" + lstAerolinea.get(i).get_descripcion() + ";\n";
        }
        return _resultado;
    }

}
