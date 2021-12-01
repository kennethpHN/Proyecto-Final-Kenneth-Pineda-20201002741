package clases;

public class DetalleFactura {

	private double _subtotal;
	private Boleto _boleto;
	
	public DetalleFactura() {
	}
	public DetalleFactura(double _subtotal, Boleto _boleto) {
		super();
		this._subtotal = _subtotal;
		this._boleto = _boleto;
	}
	public double get_subtotal() {
		return _subtotal;
	}
	public void set_subtotal(double _subtotal) {
		this._subtotal = _subtotal;
	}
	public Boleto get_boleto() {
		return _boleto;
	}
	public void set_boleto(Boleto _boleto) {
		this._boleto = _boleto;
	}
	
	
	
	@Override
	public String toString() {
		String _infoClase = String.format("%s, \n Subtotal: %s",
				this._boleto,
				this._subtotal);
		return _infoClase;
	}
	

	
	
}
