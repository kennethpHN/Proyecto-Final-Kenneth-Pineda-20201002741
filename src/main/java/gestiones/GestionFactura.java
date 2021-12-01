package gestiones;
import clases.Factura;
import java.util.LinkedList;

public class GestionFactura {

	private LinkedList<Factura> lstFactura = new LinkedList<>();

	public GestionFactura() {
		super();
	}

	public LinkedList<Factura> getLstFactura() {
		return lstFactura;
	}
	
	/**
	 * Metodo utilizado para agregar factura con un id auto-incrementable
	 * @param factura factura de tipo Factura
	 * @return true - si todo se realizo correctamente
	 */
	public boolean Agregar(Factura factura) {
		factura.set_id(lstFactura.size()+1);
		lstFactura.add(factura);
		return true;
	}
	
		/**
		 * Metodo para modificar o reemplazar un elemento de la coleccion
		 * @param posicion del elemento a modificar
		 * @param nuevoFactura elemento a reemplazar
		 * @return
		 */
		public boolean Modificar(int posicion, Factura nuevoFactura) {
			if(posicion<0 || posicion>lstFactura.size()) {
				return false;
			}else{
				int posicionEncontrada=BuscarPorId(nuevoFactura.get_id());
				if(posicionEncontrada==-1 || posicionEncontrada==posicion) {
					lstFactura.set(posicion, nuevoFactura);
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
			if(posicion<0 || posicion>lstFactura.size()) {
				return false;
			}else {
				lstFactura.remove(posicion);
				return true;
			}
		}
		/**
		 * Metodo para buscar elementos de la coleccion por su id
		 * @param id del elemento a buscar
		 * @return posicion del elemento
		 */
		public int BuscarPorId(int id) {
			int posicion=-1;
			for(int i=0; i <lstFactura.size(); i++) {
				if(lstFactura.get(i).get_id()==id) {
					posicion = i;
					break;
				}
			}
			return posicion;
		}
		/**
		 * Metodo para buscar elementos de la coleccion por su id
		 * @param id del elemento a buscar
		 * @return elemento de la coleccion
		 */
		public Factura BuscarPorIdGetElem(int id) {
			Factura facturaObtenido=null;
			for(int i=0; i <lstFactura.size(); i++) {
				if(lstFactura.get(i).get_id()==id) {
					facturaObtenido=lstFactura.get(i);
					break;
					
				}
			}
			return facturaObtenido;
		}
		
		/**
		 * Imprime todos los elementos de la coleccion
		 */
		public void ImprimirTodos() {
			for(int i=0;i<lstFactura.size();i++) {
				System.out.println(lstFactura.get(i));
			}
		}
		
		public Factura getElementoPorPosicion(int posicion) {
			return lstFactura.get(posicion);
			
		}
		/**
		 * Imprime la factura segun su id
		 * @param id
		 */
		public void ImprimirFactura(int id ) {
			Factura facturaObtenido=null;
			for(int i=0; i <lstFactura.size(); i++) {
				if(lstFactura.get(i).get_id()==id) {
					facturaObtenido=lstFactura.get(i);
					break;
				}
			}
			if(facturaObtenido!=null) {
				System.out.println(facturaObtenido);
			}
			else {
				System.out.println("No se ha encontrado el elemento solicitado");
			}
		}
}
