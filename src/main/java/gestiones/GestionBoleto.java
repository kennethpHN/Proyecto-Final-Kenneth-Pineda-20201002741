package gestiones;

import clases.Boleto;
import java.io.Serializable;
import java.util.LinkedList;

public class GestionBoleto implements Serializable {

    private LinkedList<Boleto> lstBoleto = new LinkedList<>();

    public GestionBoleto() {
        super();
    }

    public LinkedList<Boleto> getLstBoleto() {
        return lstBoleto;
    }

    /**
     * Metodo utilizado para agregar boleto con un id auto-incrementable
     *
     * @param boleto boleto de tipo Boleto
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(Boleto boleto) {
        boleto.set_codigo(lstBoleto.size() + 1);
        lstBoleto.add(boleto);
        return true;
    }

    /**
     * Metodo para modificar o reemplazar un elemento de la coleccion
     *
     * @param posicion del elemento a modificar
     * @param nuevoBoleto elemento a reemplazar
     * @return
     */
    public boolean Modificar(int posicion, Boleto nuevoBoleto) {
        if (posicion < 0 || posicion > lstBoleto.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoBoleto.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstBoleto.set(posicion, nuevoBoleto);
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
        if (posicion < 0 || posicion > lstBoleto.size()) {
            return false;
        } else {
            lstBoleto.remove(posicion);
            return true;
        }
    }

    public Object[][] GetArrayGestion() {
        // String codigo, pasajero, origen, destino, puerta, hora, fecha, categoria, asiento, aerolinea
        Object[][] array = new Object[this.lstBoleto.size()][10];
        for (int i = 0; i < lstBoleto.size(); i++) {
            System.out.println(lstBoleto.get(i));
            array[i][0] = lstBoleto.get(i).get_codigo();
            array[i][1] = lstBoleto.get(i).get_pasajero();
            array[i][2] = lstBoleto.get(i).get_origen();
            array[i][3] = lstBoleto.get(i).get_destino();
            array[i][4] = lstBoleto.get(i).get_numPuerta();
            array[i][5] = lstBoleto.get(i).get_horaAbordaje();
            array[i][6] = lstBoleto.get(i).get_fecha();
            array[i][7] = lstBoleto.get(i).get_categoriaVuelo();
            array[i][8] = lstBoleto.get(i).get_asiento();
            array[i][9] = lstBoleto.get(i).get_aerolinea();

        }
        return array;
    }

    /**
     * Metodo para buscar elementos de la coleccion por su codigo
     *
     * @param codigo del elemento a buscar
     * @return posicion del elemento
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstBoleto.size(); i++) {
            if (lstBoleto.get(i).get_codigo() == codigo) {
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
    public Boleto BuscarPorIdGetElem(int codigo) {
        Boleto boletoObtenido = null;
        for (int i = 0; i < lstBoleto.size(); i++) {
            if (lstBoleto.get(i).get_codigo() == codigo) {
                boletoObtenido = lstBoleto.get(i);
                break;

            }
        }
        return boletoObtenido;
    }

    /**
     * Imprime todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstBoleto.size(); i++) {
            System.out.println(lstBoleto.get(i));
        }
    }

    public Boleto getElementoPorPosicion(int posicion) {
        return lstBoleto.get(posicion);

    }

    public String getInfoReporte() {
        // String codigo, pasajero, origen, destino, puerta, hora, fecha, categoria, asiento, aerolinea
        String _resultado = "Código; Pasajero; Origen; Destino; Numero de Puerta; Hora de Abordaje; Fecha; Categoria de Vuelo; Número de Asiento; Aerolinea ; \n";
        for (int i = 0; i < lstBoleto.size(); i++) {
            _resultado += lstBoleto.get(i).get_codigo() + ";" + lstBoleto.get(i).get_pasajero() + ";" + lstBoleto.get(i).get_origen()
                    + ";" + lstBoleto.get(i).get_destino() + ";" + lstBoleto.get(i).get_numPuerta() + ";" + lstBoleto.get(i).get_horaAbordaje()
                    + ";" + lstBoleto.get(i).get_fecha() + ";" + lstBoleto.get(i).get_categoriaVuelo()
                    + ";" + lstBoleto.get(i).get_asiento() + ";" + lstBoleto.get(i).get_aerolinea() + ";\n";
        }
        return _resultado;
    }

    /**
     * Imprime el boleto segun su codigo
     *
     * @param codigo
     */
    public void ImprimirBoleto(int codigo) {
        Boleto boletoObtenido = null;
        for (int i = 0; i < lstBoleto.size(); i++) {
            if (lstBoleto.get(i).get_codigo() == codigo) {
                boletoObtenido = lstBoleto.get(i);
                break;
            }
        }
        if (boletoObtenido != null) {
            System.out.println(boletoObtenido);
        } else {
            System.out.println("No se ha encontrado el elemento solicitado");
        }
    }
}
