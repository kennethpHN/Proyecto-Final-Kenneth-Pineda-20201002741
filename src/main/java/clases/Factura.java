package clases;
import java.util.LinkedList;

import Util.Calculo;
import java.io.Serializable;
public class Factura implements Calculo, Serializable{

	private String _fecha;
	private int _id;
	private AsesorServ _asesorServ;
	private Cliente _cliente;
	private LinkedList<DetalleFactura> _detalleFactura=new LinkedList<>();
	private Aerolinea _aerolinea;
	private double _subtotal;
	private double _isv;
	private double _total;
	public Factura() {
	}

	public Factura(String _fecha, int _id, AsesorServ _asesorServ, Cliente _cliente,
			LinkedList<DetalleFactura> _detalleFactura, Aerolinea _aerolinea, double _subtotal, double _isv, double _total) {
		super();
		this._fecha = _fecha;
		this._id = _id;
		this._asesorServ = _asesorServ;
		this._cliente = _cliente;
		this._detalleFactura = _detalleFactura;
		this._aerolinea = _aerolinea;
		this._isv = _isv;
		this._subtotal = _subtotal;
		this._total = _total;
	}
	

	/**
	 * M�todo para agregar detalle a la factura
	 * @param detalle
	 * @return true si todo se realizo correctamente
	 */
	public boolean agregarDetalle(DetalleFactura detalle) {
		_detalleFactura.add(detalle);
		return true;
	}
	
	/**
	 * Metodo para obtener detalle por el codigo de producto
	 * @param codigoProducto objeto de tipo int
	 * @return posicion del elemento encontrado
	 */
	public int obtenerDetallePorCodigoProducto(int codigoProducto) {
		int posicion=-1;
		for(int i=0;i<=_detalleFactura.size();i++) {
			if(this._detalleFactura.get(i).get_boleto().get_codigo()==codigoProducto) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * M�todo para modificar un detalle a la factura
	 * @param detalle, posicion
	 * @return true si todo se realizo correctamente
	 */
	public boolean modificarDetalle(DetalleFactura detalle, int posicion) {
		this._detalleFactura.set(posicion, detalle);
		return true;
	}
	
	/**
	 * Metodo para imprimir la lista detalle
	 */
	public void imprimirDetalle() {
		for(int i=0;i<_detalleFactura.size(); i++) {
			System.out.println(_detalleFactura.get(i));
		}
	}
	
	public String get_fecha() {
		return _fecha;
	}

	public void set_fecha(String _fecha) {
		this._fecha = _fecha;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public AsesorServ get_asesorServ() {
		return _asesorServ;
	}

	public void set_asesorServ(AsesorServ _asesorServ) {
		this._asesorServ = _asesorServ;
	}

	public Cliente get_cliente() {
		return _cliente;
	}

	public void set_cliente(Cliente _cliente) {
		this._cliente = _cliente;
	}

	public LinkedList<DetalleFactura> get_detalleFactura() {
		return _detalleFactura;
	}

	public void set_detalleFactura(LinkedList<DetalleFactura> _detalleFactura) {
		this._detalleFactura = _detalleFactura;
	}

	public Aerolinea get_aerolinea() {
		return _aerolinea;
	}

	public void set_aerolinea(Aerolinea _aerolinea) {
		this._aerolinea = _aerolinea;
	}
	
	public double get_subtotal() {
		return _subtotal;
	}

	public void set_subtotal(double _subtotal) {
		this._subtotal = _subtotal;
	}

	public double get_isv() {
		return _isv;
	}

	public void set_isv(double _isv) {
		this._isv = _isv;
	}

	public double get_total() {
		return _total;
	}

	public void set_total(double _total) {
		this._total = _total;
	}

	@Override
	public double ObtenerSubTotal() {
		double subtotal_Factura = 0;
		for(DetalleFactura elemento : _detalleFactura) {
			subtotal_Factura += elemento.get_subtotal();
		}
		return subtotal_Factura;
	}
	
	/**
	 * Metodo para obtener el ISV sobre el subtotal de la factura
	 * @return ISV de factura
	 */
	@Override
	public double ObtenerSubTotal_ISV() {
		double subtotal_ISVFactura = 0;
		for(DetalleFactura elemento : _detalleFactura) {
			subtotal_ISVFactura += elemento.get_subtotal() * ISV;
		}
		return subtotal_ISVFactura;
	}
	
	@Override
	public double ObtenerTotal() {
		double total_Factura = 0;
		total_Factura = ObtenerSubTotal()+ObtenerSubTotal_ISV();
		return total_Factura;
	}
	
	
	@Override
	public String toString() {
		String _infoClase = String.format("Datos de la factura: \nID de Factura: %s, Fecha: %s, %s, %s, \n%s, \nAerolinea: %s, \nsubtotal: %s, ISV(0.15): %s, Total: %s",
				this._id,
				this._fecha,
				this._asesorServ,
				this._cliente,
				this._detalleFactura,
				this._aerolinea,
				this._subtotal,
				this._isv,
				this._total
				);
		
		return _infoClase;
	}








	
	
	
	
	
}
