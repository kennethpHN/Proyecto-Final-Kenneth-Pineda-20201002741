package gestiones;
import clases.Boleto;
import java.io.Serializable;
import java.util.LinkedList;

public class GestionBoleto implements Serializable{

	private LinkedList<Boleto> lstBoleto = new LinkedList<>();

	public GestionBoleto() {
		super();
	}

	public LinkedList<Boleto> getLstBoleto() {
		return lstBoleto;
	}
	
	/**
	 * Metodo utilizado para agregar boleto con un id auto-incrementable
	 * @param boleto boleto de tipo Boleto
	 * @return true - si todo se realizo correctamente
	 */
	public boolean Agregar(Boleto boleto) {
		boleto.set_id(lstBoleto.size()+1);
		lstBoleto.add(boleto);
		return true;
	}
	
		/**
		 * Metodo para modificar o reemplazar un elemento de la coleccion
		 * @param posicion del elemento a modificar
		 * @param nuevoBoleto elemento a reemplazar
		 * @return
		 */
		public boolean Modificar(int posicion, Boleto nuevoBoleto) {
			if(posicion<0 || posicion>lstBoleto.size()) {
				return false;
			}else{
				int posicionEncontrada=BuscarPorId(nuevoBoleto.get_id());
				if(posicionEncontrada==-1 || posicionEncontrada==posicion) {
					lstBoleto.set(posicion, nuevoBoleto);
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
			if(posicion<0 || posicion>lstBoleto.size()) {
				return false;
			}else {
				lstBoleto.remove(posicion);
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
			for(int i=0; i <lstBoleto.size(); i++) {
				if(lstBoleto.get(i).get_id()==id) {
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
		public Boleto BuscarPorIdGetElem(int id) {
			Boleto boletoObtenido=null;
			for(int i=0; i <lstBoleto.size(); i++) {
				if(lstBoleto.get(i).get_id()==id) {
					boletoObtenido=lstBoleto.get(i);
					break;
					
				}
			}
			return boletoObtenido;
		}
		
		/**
		 * Imprime todos los elementos de la coleccion
		 */
		public void ImprimirTodos() {
			for(int i=0;i<lstBoleto.size();i++) {
				System.out.println(lstBoleto.get(i));
			}
		}
		
		public Boleto getElementoPorPosicion(int posicion) {
			return lstBoleto.get(posicion);
			
		}
		/**
		 * Imprime el boleto segun su id
		 * @param id
		 */
		public void ImprimirBoleto(int id ) {
			Boleto boletoObtenido=null;
			for(int i=0; i <lstBoleto.size(); i++) {
				if(lstBoleto.get(i).get_id()==id) {
					boletoObtenido=lstBoleto.get(i);
					break;
				}
			}
			if(boletoObtenido!=null) {
				System.out.println(boletoObtenido);
			}
			else {
				System.out.println("No se ha encontrado el elemento solicitado");
			}
		}
}