package clases;

import java.io.Serializable;

public class Boleto implements Serializable{

	private int _codigo;
	private Pasajero _pasajero;
	private Origen _origen;
	private Destino _destino;
	private NumPuerta _numPuerta;
	private HoraAbordaje _horaAbordaje;
	private Fecha _fecha;
	private CategVuelo _categoriaVuelo;
	private Asiento _asiento;
	private Aerolinea _aerolinea;
	
	public Boleto() {
	}



	public Boleto(int _codigo, Pasajero _pasajero, Origen _origen, Destino _destino, NumPuerta _numPuerta,
			HoraAbordaje _horaAbordaje, Fecha _fecha, CategVuelo _categoriaVuelo, Asiento _asiento,
			Aerolinea _aerolinea) {
		super();
		this._codigo = _codigo;
		this._pasajero = _pasajero;
		this._origen = _origen;
		this._destino = _destino;
		this._numPuerta = _numPuerta;
		this._horaAbordaje = _horaAbordaje;
		this._fecha = _fecha;
		this._categoriaVuelo = _categoriaVuelo;
		this._asiento = _asiento;
		this._aerolinea = _aerolinea;
	}



	public Boleto(Aerolinea _aerolinea, Pasajero _pasajero, Origen _origen, Destino _destino, NumPuerta _numPuerta,
			HoraAbordaje _horaAbordaje, Fecha _fecha, CategVuelo _categoriaVuelo, Asiento _asiento) {
		super();
		this._aerolinea = _aerolinea;
		this._pasajero = _pasajero;
		this._origen = _origen;
		this._destino = _destino;
		this._numPuerta = _numPuerta;
		this._horaAbordaje = _horaAbordaje;
		this._fecha = _fecha;
		this._categoriaVuelo = _categoriaVuelo;
		this._asiento = _asiento;
	}


	
	public Aerolinea get_aerolinea() {
		return _aerolinea;
	}

	public void set_aerolinea(Aerolinea _aerolinea) {
		this._aerolinea = _aerolinea;
	}

	public int get_codigo() {
		return _codigo;
	}

	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}

	public Pasajero get_pasajero() {
		return _pasajero;
	}

	public void set_pasajero(Pasajero _pasajero) {
		this._pasajero = _pasajero;
	}

	public Origen get_origen() {
		return _origen;
	}

	public void set_origen(Origen _origen) {
		this._origen = _origen;
	}

	public Destino get_destino() {
		return _destino;
	}

	public void set_destino(Destino _destino) {
		this._destino = _destino;
	}

	public NumPuerta get_numPuerta() {
		return _numPuerta;
	}

	public void set_numPuerta(NumPuerta _numPuerta) {
		this._numPuerta = _numPuerta;
	}

	public HoraAbordaje get_horaAbordaje() {
		return _horaAbordaje;
	}

	public void set_horaAbordaje(HoraAbordaje _horaAbordaje) {
		this._horaAbordaje = _horaAbordaje;
	}

	public Fecha get_fecha() {
		return _fecha;
	}

	public void set_fecha(Fecha _fecha) {
		this._fecha = _fecha;
	}

	public CategVuelo get_categoriaVuelo() {
		return _categoriaVuelo;
	}

	public void set_categoriaVuelo(CategVuelo _categoriaVuelo) {
		this._categoriaVuelo = _categoriaVuelo;
	}

	public Asiento get_asiento() {
		return _asiento;
	}

	public void set_asiento(Asiento _asiento) {
		this._asiento = _asiento;
	}

	@Override
	public String toString() {
		
		String _infoClase = String.format("\n_________\nDatos de Boleto: \nCodigo de boleto: %d, \n%s, \n%s, \n%s, \n%s, \n%s, \n%s, \n%s, \n%s"+"\n_________\n",
				
				this._codigo,
				this._pasajero,
				this._origen,
				this._destino,
				this._numPuerta,
				this._horaAbordaje,
				this._fecha,
				this._categoriaVuelo,
				this._asiento
				
				
				);
		
		return  _infoClase /*"Boleto [_codigo=" + _codigo + ", _pasajero=" + _pasajero + ", _origen=" + _origen + ", _destino=" + _destino
				+ ", _numPuerta=" + _numPuerta + ", _horaAbordaje=" + _horaAbordaje + ", _fecha=" + _fecha
				+ ", _categoriaVuelo=" + _categoriaVuelo + ", _asiento=" + _asiento + "]"*/;
	}
	
	
	
	
	
	
}
