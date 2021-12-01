package gestiones;
import clases.Cliente;
import java.util.LinkedList;

public class GestionCliente {

	private LinkedList<Cliente> lstCliente = new LinkedList<>();

	public GestionCliente() {
		super();
	}

	public LinkedList<Cliente> getLstCliente() {
		return lstCliente;
	}
	
	/**
	 * Metodo utilizado para agregar cliente con un id auto-incrementable
	 * @param cliente cliente de tipo Cliente
	 * @return true - si todo se realizo correctamente
	 */
	public boolean Agregar(Cliente cliente) {
		cliente.set_codigo(lstCliente.size()+1);
		lstCliente.add(cliente);
		return true;
	}
	
		/**
		 * Metodo para modificar o reemplazar un elemento de la coleccion
		 * @param posicion del elemento a modificar
		 * @param nuevoCliente elemento a reemplazar
		 * @return
		 */
		public boolean Modificar(int posicion, Cliente nuevoCliente) {
			if(posicion<0 || posicion>lstCliente.size()) {
				return false;
			}else{
				int posicionEncontrada=BuscarPorcodigo(nuevoCliente.get_codigo());
				if(posicionEncontrada==-1 || posicionEncontrada==posicion) {
					lstCliente.set(posicion, nuevoCliente);
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
			if(posicion<0 || posicion>lstCliente.size()) {
				return false;
			}else {
				lstCliente.remove(posicion);
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
			for(int i=0; i <lstCliente.size(); i++) {
				if(lstCliente.get(i).get_codigo()==codigo) {
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
		public Cliente BuscarPorcodigoGetElem(int codigo) {
			Cliente clienteObtenido=null;
			for(int i=0; i <lstCliente.size(); i++) {
				if(lstCliente.get(i).get_codigo()==codigo) {
					clienteObtenido=lstCliente.get(i);
					break;
					
				}
			}
			return clienteObtenido;
		}
		
		/**
		 * Imprime todos los elementos de la coleccion
		 */
		public void ImprimirTodos() {
			for(int i=0;i<lstCliente.size();i++) {
				System.out.println(lstCliente.get(i));
			}
		}
		
		public Cliente getElementoPorPosicion(int posicion) {
			return lstCliente.get(posicion);
			
		}
}