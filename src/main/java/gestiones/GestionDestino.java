package gestiones;
import clases.Destino;
import java.util.LinkedList;

public class GestionDestino {
	
	private LinkedList<Destino> lstDestino = new LinkedList<>();

	public GestionDestino() {
		super();
	}

	public LinkedList<Destino> getLstDestino() {
		return lstDestino;
	}
	
	/**
	 * Metodo utilizado para agregar destino con un id auto-incrementable
	 * @param destino destino de tipo Destino
	 * @return true - si todo se realizo correctamente
	 */
	public boolean Agregar(Destino destino) {
		destino.set_codigo(lstDestino.size()+1);
		lstDestino.add(destino);
		return true;
	}
	
	/**
	 * Metodo para modificar o reemplazar un elemento de la coleccion
	 * @param posicion del elemento a modificar
	 * @param nuevoDestino elemento a reemplazar
	 * @return
	 */
	public boolean Modificar(int posicion, Destino nuevoDestino) {
		if(posicion<0 || posicion>lstDestino.size()) {
			return false;
		}else{
			int posicionEncontrada=BuscarPorcodigo(nuevoDestino.get_codigo());
			if(posicionEncontrada==-1 || posicionEncontrada==posicion) {
				lstDestino.set(posicion, nuevoDestino);
				return true;
			}else {
				return false;
			}
		}
	}
	
	/**
	 * Metodo para eliminar elementos de la coleccion
	 * @param posicion del elemento a eliminar
	 * @return true - si todo se realizo correctamente
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>lstDestino.size()) {
			return false;
		}else {
			lstDestino.remove(posicion);
			return true;
		}
	}
	/**
	 * Metodo para buscar elementos de la coleccion por su codigo
	 * @param codigo del elemento a buscar
	 * @return posicion del elemento
	 */
	public int BuscarPorcodigo(int codigo) {
		int posicion=-1;
		for(int i=0; i <lstDestino.size(); i++) {
			if(lstDestino.get(i).get_codigo()==codigo) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	/**
	 * Metodo para buscar elementos de la coleccion por su codigo
	 * @param codigo del elemento a buscar
	 * @return elemento de la coleccion
	 */
	public Destino BuscarPorCodigoGetElem(int codigo) {
		Destino destinoObtenido=null;
		for(int i=0; i <lstDestino.size(); i++) {
			if(lstDestino.get(i).get_codigo()==codigo) {
				destinoObtenido=lstDestino.get(i);
				break;
				
			}
		}
		return destinoObtenido;
	}
	
	/**
	 * Imprime todos los elementos de la coleccion
	 */
	public void ImprimirTodos() {
		for(int i=0;i<lstDestino.size();i++) {
			System.out.println(lstDestino.get(i));
		}
	}
        
        public Object[][] GetArrayGestion() {
            // String codigo, descripcion
            Object [][] array=new Object[this.lstDestino.size()][4];
                for(int i=0;i<lstDestino.size();i++) {
                        System.out.println(lstDestino.get(i));
                        array[i][0]= lstDestino.get(i).get_codigo();
                        array[i][1]= lstDestino.get(i).get_descripcion();
                }
        return array;
        }        
        
	
	public Destino getElementoPorPosicion(int posicion) {
		return lstDestino.get(posicion);
		
	}

}
