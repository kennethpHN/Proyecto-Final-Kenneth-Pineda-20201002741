package implementacion;
import java.util.Scanner;

import Util.*;
import gestiones.*;
import clases.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		boolean centinelaPr=true,centinelaAero=true,centinelaOrg=true,centinelaBl=true,centinelaBl2=true,centinelaDest=true,centinelaCateg=true,centinelaHora=true,centinelaFecha=true,centinelaFc=true;
		int opcionPr, opcionAero,opcionBl,opcionBl2,opcionFactura,codSelec,contador=0,contadorFactura=0;
		int codSelecFact, codSelecBol,posSelecBol,idFactEncontrada;
		double subtotalFactura=0,subtotal1=0,subtotal2=0,isv=0,total=0;
		String nombres,apellidos,dni;
		String fecha = AdminFechas.getFechaActualString();
		
		//Objeto Factura
		Factura factura1 = new Factura();
		Factura facturaEncontrada = new Factura();
		//Objeto DetalleFactura
		DetalleFactura detalle1 = new DetalleFactura();
		// Gestiones
		GestionBoleto gBoleto= new GestionBoleto();
		GestionPasajero gPasajero= new GestionPasajero();
		GestionCliente gCliente = new GestionCliente();
		GestionAsesorServ gAsesor = new GestionAsesorServ();
		GestionFactura gFactura = new GestionFactura();
		GestionAerolinea gAero = new GestionAerolinea();
		GestionOrigen gOrigen = new GestionOrigen();
		GestionDestino gDestino = new GestionDestino();
		GestionCategVuelo gCateg = new GestionCategVuelo();
		GestionNumPuerta gNpuerta= new GestionNumPuerta();
		GestionHoraAbordaje gHora = new GestionHoraAbordaje();
		GestionFecha gFecha = new GestionFecha();
		GestionAsiento gAsiento = new GestionAsiento();
		//
		
		// Inicializando objetos
		
		Pasajero pasajeroSelec = new Pasajero();
		
		Aerolinea aero1 = new Aerolinea("Avianca");
		Aerolinea aero2 = new Aerolinea("Spirit");
		Aerolinea aero3 = new Aerolinea("Delta");
		Aerolinea aeroSelec = new Aerolinea (null);
		gAero.Agregar(aero1);
		gAero.Agregar(aero2);
		gAero.Agregar(aero3);
		
		AsesorServ asesor1 = new AsesorServ("Jorge", "Espina;", "0801-1988-13430");
		gAsesor.Agregar(asesor1);
		Origen origSelec=new Origen();
		Origen orig1 = new Origen("Tegucigalpa");
		Origen orig2 = new Origen("San Pedro Sula");
		Origen orig3 = new Origen("La Ceiba");
		Origen orig4 = new Origen("Roatan");
		gOrigen.Agregar(orig1);
		gOrigen.Agregar(orig2);
		gOrigen.Agregar(orig3);
		gOrigen.Agregar(orig4);
		
		Destino destSelec=new Destino();
		Destino dest1 = new Destino("Miami - USA");
		Destino dest2 = new Destino("San Jose - CR");
		Destino dest3 = new Destino("Los Angeles - USA");
		Destino dest4 = new Destino("Nueva York - USA");
		Destino dest5 = new Destino("Ciudad de Mexico - MX");
		gDestino.Agregar(dest1);
		gDestino.Agregar(dest2);
		gDestino.Agregar(dest3);
		gDestino.Agregar(dest4);
		gDestino.Agregar(dest5);
		
		CategVuelo categSelec=new CategVuelo();
		CategVuelo categ1 = new CategVuelo(100, "Economica");
		CategVuelo categ2 = new CategVuelo(150, "Ejecutiva");
		CategVuelo categ3 = new CategVuelo(300, "Primera Clase");
		gCateg.Agregar(categ1);
		gCateg.Agregar(categ2);
		gCateg.Agregar(categ3);
		
		NumPuerta nPuertaSelec = new NumPuerta();
		NumPuerta nPuerta1 = new NumPuerta();
		NumPuerta nPuerta2 = new NumPuerta();
		NumPuerta nPuerta3 = new NumPuerta();
		gNpuerta.Agregar(nPuerta1);
		gNpuerta.Agregar(nPuerta2);
		gNpuerta.Agregar(nPuerta3);
		
		HoraAbordaje horaSelec= new HoraAbordaje();
		HoraAbordaje hora1 = new HoraAbordaje("9:00 AM");
		HoraAbordaje hora2 = new HoraAbordaje("1:00 PM");
		HoraAbordaje hora3 = new HoraAbordaje("4:00 PM");
		gHora.Agregar(hora1);
		gHora.Agregar(hora2);
		gHora.Agregar(hora3);
		
		Fecha fechaSelec = new Fecha();
		Fecha fecha1 = new Fecha(AdminFechas.stringToDate("19/10/21"));
		Fecha fecha2 = new Fecha(AdminFechas.stringToDate("21/10/21"));
		Fecha fecha3 = new Fecha(AdminFechas.stringToDate("23/10/21"));
		gFecha.Agregar(fecha1);
		gFecha.Agregar(fecha2);
		gFecha.Agregar(fecha3);
		
		
		
		Asiento asientoSelec = new Asiento();
		//
		
		centinelaPr=true;
		while(centinelaPr) {
			
			System.out.println("Menu Principal");
			System.out.println("Seleccione una Aerolinea");
			gAero.ImprimirTodos();
			System.out.println("4-- Salir");
			opcionPr = sc.nextInt();
			aeroSelec = gAero.BuscarPorcodigoGetElem(opcionPr);
			if(opcionPr!=1 && opcionPr!=2 && opcionPr!=3 || opcionPr==4) {
				centinelaPr=false;
				System.out.println("saliendo");
				break;
			}
			centinelaAero=true;
			while (centinelaAero) {
				System.out.println("Gestion de Aerolinea " + aeroSelec.get_descripcion());
				System.out.println("1--Gestion de Boletos");
				System.out.println("2--Gestion de Facturas");
				System.out.println("3-- Salir");
				opcionAero=sc2.nextInt();
				
				switch (opcionAero) {
				case 1://Gestion de Boletos
					centinelaBl=true;
					while(centinelaBl) {
						System.out.println("Gestion de Boletos");
						System.out.println("1--Compra de Boletos");
						System.out.println("2--Buscar Boletos");
						System.out.println("3--Imprimir todos");
						System.out.println("4-- Salir");
						opcionBl=sc.nextInt();
						switch (opcionBl) {
						case 1://Compra de boletos
							contadorFactura++;
							centinelaBl2=true;
							while(centinelaBl2) {
								contador++;
								/* Pasos Compra de Boletos
								 * Pasos
								 * 1. Ingresar datos de boleto
								 * 2. Inicializar objeto y almacenar datos en el objeto de tipo boleto
								 * 3. Almacenar boleto en la lista de gestion
								 * 4. Agregar boleto en detalle
								 */
								
								System.out.println("Compra de Boletos \n \n");
								//paso 1
								System.out.println("datos del pasajero \n");
								System.out.println("Ingrese su nombre");
								nombres=sc3.nextLine();
								System.out.println("Ingrese sus apellidos");
								apellidos=sc3.nextLine();
								System.out.println("Ingrese su DNI");
								dni=sc3.nextLine();
								
								centinelaOrg=true;
								while(centinelaOrg) { // Seleccion Ciudad de Origen
									System.out.println("seleccione la Ciudad de Origen");
									gOrigen.ImprimirTodos();
									codSelec=sc.nextInt();
									origSelec = gOrigen.BuscarPorcodigoGetElem(codSelec);
									if(origSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Ciudad de Origen seleccionada: " + origSelec.get_descripcion());
										centinelaOrg=false;
									}
								}//Fin centinelaOrg
								centinelaDest=true;
								while(centinelaDest) { // Seleccion Ciudad de Destino
									System.out.println("seleccione la Ciudad de Destino");
									gDestino.ImprimirTodos();
									codSelec=sc2.nextInt();
									destSelec = gDestino.BuscarPorCodigoGetElem(codSelec);
									if(destSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Destino seleccionado: " + destSelec/*.get_descripcion()*/);
										centinelaDest=false;
									}
								}//Fin centinelaDest
								
								centinelaCateg=true;
								while(centinelaCateg) { // Seleccion Categoria de Vuelo
									System.out.println("seleccione la Categoria de Vuelo");
									gCateg.ImprimirTodos();
									codSelec=sc2.nextInt();
									categSelec = gCateg.BuscarPorCodigoGetElem(codSelec);
									if(categSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Categoria de vuelo seleccionada: " + categSelec.get_descripcion() + " Precio: " + categSelec.get_precio());
										centinelaCateg=false;
									}
								}//Fin centinelaCateg
								
								switch(destSelec.get_codigo()) {
								case 1:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(1); //Puerta 1 - USA
									break;
								case 2:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(2); //Puerta 2 - CR
									break;
								case 3:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(1); //Puerta 1 - USA
									break;
								case 4:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(1); //Puerta 1 - USA
									break;
								case 5:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(3); //Puerta 3 - MX
									break;	
								}
								
								centinelaHora=true;
								while(centinelaHora) { // Seleccion Hora de Abordaje
									System.out.println("seleccione la Hora de Abordaje");
									gHora.ImprimirTodos();
									codSelec=sc.nextInt();
									horaSelec = gHora.BuscarPorCodigoGetElem(codSelec);
									if(horaSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Hora de Abordaje seleccionada: " + horaSelec.get_descripcion());
										centinelaHora=false;
									}
								}//Fin centinelaHora
								
								centinelaFecha=true;
								while(centinelaFecha) { // Seleccion Fecha
									System.out.println("seleccione Fecha de Vuelo");
									gFecha.ImprimirTodos();
									codSelec=sc.nextInt();
									fechaSelec = gFecha.BuscarPorCodigoGetElem(codSelec);
									if(fechaSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Fecha de Vuelo seleccionada: " + fechaSelec.get_descripcion());
										centinelaFecha=false;
									}
								}//Fin centinelaFecha	
								
								//Asiento con codigo correlativo al boleto
								Asiento asiento1 = new Asiento();
								gAsiento.Agregar(asiento1);
								asientoSelec = gAsiento.BuscarPorcodigoGetElem(contador);
								
								//pasajero con codigo correlativo al boleto
								Pasajero pasajero1 = new Pasajero(nombres, apellidos, dni);
								gPasajero.Agregar(pasajero1);
								pasajeroSelec = gPasajero.BuscarPorcodigoGetElem(contador);
								
								//paso 2

								Boleto boleto1 = new Boleto(aeroSelec, pasajeroSelec, origSelec, destSelec, nPuertaSelec, horaSelec, fechaSelec, categSelec, asientoSelec);

								//paso 3
								gBoleto.Agregar(boleto1);
								
								//paso 4
								subtotal1 = gBoleto.BuscarPorIdGetElem(contador).get_categoriaVuelo().get_precio();
								subtotal2 +=  subtotal1;
								detalle1.set_boleto(gBoleto.BuscarPorIdGetElem(contador));
								detalle1.set_subtotal(subtotal1);
								factura1.agregarDetalle(detalle1);
								System.out.println("Desea agregar otro boleto a su compra?");
								System.out.println("1-- Si");
								System.out.println("2-- No");
								opcionBl2=sc.nextInt();
								switch (opcionBl2) {
								case 1:
									centinelaBl2=true;
									break;
								case 2:
									centinelaBl2=false;
									break;
								default:
									centinelaBl2=false;
									break;
								}//fin switch opcionBl2
							}// fin centinelaBl2
							System.out.println("Emitiendo Factura");
							System.out.println("Ingrese datos del cliente");
							System.out.println("Ingrese su nombre");
							nombres=sc3.nextLine();
							System.out.println("Ingrese sus apellidos");
							apellidos=sc3.nextLine();
							System.out.println("Ingrese su DNI");
							dni=sc3.nextLine();
							Cliente cliente1 = new Cliente(nombres, apellidos, dni);
							gCliente.Agregar(cliente1);
							
							//System.out.println("Ingrese la fecha");
							//fecha=sc.nextLine();
							
							
							/*isv=subtotal2 * 0.15;
							total= subtotal2 * 1.15;*/
							subtotalFactura = factura1.ObtenerSubTotal();
							factura1.set_subtotal(subtotalFactura);
							isv = factura1.ObtenerSubTotal_ISV();
							factura1.set_isv(isv);
							total = factura1.ObtenerTotal();
							factura1.set_total(total);
							
							
							factura1.set_aerolinea(aeroSelec);
							factura1.set_asesorServ(asesor1);
							factura1.set_cliente(gCliente.BuscarPorcodigoGetElem(contadorFactura));
							factura1.set_fecha(fecha);

							gFactura.Agregar(factura1);
							
							//System.out.println("Factura #" + contadorFactura);
							//System.out.println(gFactura.getElementoPorPosicion(contadorFactura));
							gFactura.ImprimirFactura(contadorFactura);
							System.out.println(factura1.get_total());
							System.out.println(factura1.ObtenerTotal());
							
							break;
						case 2: // Buscar boletos
							//Buscar Boleto
							System.out.println("Ingrese el codigo de boleto");
							gBoleto.ImprimirTodos();
							codSelec= sc3.nextInt();
							gBoleto.ImprimirBoleto(codSelec);
							break;
						case 3:
							gBoleto.ImprimirTodos();
							break;
						case 4:
							centinelaBl=false;
							break;
						default:
							centinelaBl=false;
							break;
						}// fin switch opcionBl
					}// fin centinelaBl
					break;// fin caso 1 opcionAero
				case 2://Gestion de Facturas
					centinelaFc=true;
					subtotal2=0;
					while(centinelaFc==true) {
						System.out.println("Gestion de Facturas");
						System.out.println("1-- Buscar Factura");
						System.out.println("2-- Modificar Factura");
						System.out.println("3-- Imprimir todas las facturas");
						System.out.println("4-- Eliminar factura");
						System.out.println("5-- Salir");
						opcionFactura=sc.nextInt();
						switch (opcionFactura) {
						case 1:// Buscar Factura
							System.out.println("Ingrese el codigo de factura");
							gFactura.ImprimirTodos();
							codSelec= sc3.nextInt();
							gFactura.ImprimirFactura(codSelec);
							break;
							
						case 2:// Modificar Factura
							System.out.println("Seleccione el codigo de la factura a modificarse");
							gFactura.ImprimirTodos();
							codSelecFact = sc.nextInt();
							facturaEncontrada= gFactura.BuscarPorIdGetElem(codSelecFact);
							idFactEncontrada= gFactura.BuscarPorId(codSelecFact);
							System.out.println("Ingrese el codigo del boleto a modificar");
							facturaEncontrada.imprimirDetalle();
							codSelecBol = sc.nextInt();
							posSelecBol=facturaEncontrada.obtenerDetallePorCodigoProducto(codSelecBol);
							centinelaBl2=true;
							while(centinelaBl2) {
								/*
								 * Pasos
								 * 1. Ingresar datos de boleto
								 * 2. Inicializar objeto y almacenar datos en el objeto de tipo boleto
								 * 3. Almacenar boleto en la lista de gestion
								 * 4. Agregar boleto en detalle
								 */
								
								System.out.println("Moficando Boleto \n \n");
								//paso 1
								System.out.println("datos del pasajero \n");
								System.out.println("Ingrese su nombre");
								nombres=sc3.nextLine();
								System.out.println("Ingrese sus apellidos");
								apellidos=sc3.nextLine();
								System.out.println("Ingrese su DNI");
								dni=sc3.nextLine();
								
								centinelaOrg=true;
								while(centinelaOrg) { // Seleccion Ciudad de Origen
									System.out.println("seleccione la Ciudad de Origen");
									gOrigen.ImprimirTodos();
									codSelec=sc.nextInt();
									origSelec = gOrigen.BuscarPorcodigoGetElem(codSelec);
									if(origSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Ciudad de Origen seleccionada: " + origSelec.get_descripcion());
										centinelaOrg=false;
									}
								}//Fin centinelaOrg
								centinelaDest=true;
								while(centinelaDest) { // Seleccion Ciudad de Destino
									System.out.println("seleccione la Ciudad de Destino");
									gDestino.ImprimirTodos();
									codSelec=sc2.nextInt();
									destSelec = gDestino.BuscarPorCodigoGetElem(codSelec);
									if(destSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Destino seleccionado: " + destSelec/*.get_descripcion()*/);
										centinelaDest=false;
									}
								}//Fin centinelaDest
								
								centinelaCateg=true;
								while(centinelaCateg) { // Seleccion Categoria de Vuelo
									System.out.println("seleccione la Categoria de Vuelo");
									gCateg.ImprimirTodos();
									codSelec=sc2.nextInt();
									categSelec = gCateg.BuscarPorCodigoGetElem(codSelec);
									if(categSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Categoria de vuelo seleccionada: " + categSelec.get_descripcion() + " Precio: " + categSelec.get_precio());
										centinelaCateg=false;
									}
								}//Fin centinelaCateg
								
								switch(destSelec.get_codigo()) {
								case 1:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(1); //Puerta 1 - USA
									break;
								case 2:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(2); //Puerta 2 - CR
									break;
								case 3:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(1); //Puerta 1 - USA
									break;
								case 4:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(1); //Puerta 1 - USA
									break;
								case 5:
									nPuertaSelec=gNpuerta.BuscarPorcodigoGetElem(3); //Puerta 3 - MX
									break;	
								}
								
								centinelaHora=true;
								while(centinelaHora) { // Seleccion Hora de Abordaje
									System.out.println("seleccione la Hora de Abordaje");
									gHora.ImprimirTodos();
									codSelec=sc.nextInt();
									horaSelec = gHora.BuscarPorCodigoGetElem(codSelec);
									if(horaSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Hora de Abordaje seleccionada: " + horaSelec.get_descripcion());
										centinelaHora=false;
									}
								}//Fin centinelaHora
								
								centinelaFecha=true;
								while(centinelaFecha) { // Seleccion Fecha
									System.out.println("seleccione Fecha de Vuelo");
									gFecha.ImprimirTodos();
									codSelec=sc.nextInt();
									fechaSelec = gFecha.BuscarPorCodigoGetElem(codSelec);
									if(fechaSelec==null) {
										System.out.println("La seleccion no es valida, intente nuevamente");
									}
									else {
										System.out.println("Fecha de Vuelo seleccionada: " + fechaSelec.get_descripcion());
										centinelaFecha=false;
									}
								}//Fin centinelaFecha	
								
								//Asiento con codigo correlativo al boleto
								Asiento asiento1 = new Asiento(codSelecBol);
								//asientoSelec = gAsiento.BuscarPorcodigoGetElem(codSelecBol);
								
								//pasajero con codigo correlativo al boleto
								Pasajero pasajero1 = new Pasajero(nombres, apellidos, dni,codSelecBol);
								//pasajeroSelec = gPasajero.BuscarPorcodigoGetElem(codSelecBol);
								
								//paso 2

								Boleto boletoObtenido = new Boleto(codSelecBol, pasajero1, origSelec, destSelec, nPuertaSelec, horaSelec, fechaSelec, categSelec, asiento1, aeroSelec);

								//paso 3
								gBoleto.Modificar(posSelecBol, boletoObtenido);
								
								//paso 4
								subtotal1 = gBoleto.BuscarPorIdGetElem(codSelecBol).get_categoriaVuelo().get_precio();
								subtotal2 +=  subtotal1;
								detalle1.set_boleto(gBoleto.BuscarPorIdGetElem(codSelecBol));
								detalle1.set_subtotal(subtotal1);
								factura1.modificarDetalle(detalle1, posSelecBol);


								centinelaBl2=false;
							}// fin centinelaBl2
							isv=subtotal2 * 0.15;
							total= subtotal2 * 1.15;
							factura1.set_aerolinea(aeroSelec);
							factura1.set_asesorServ(asesor1);
							factura1.set_cliente(gCliente.BuscarPorcodigoGetElem(contadorFactura));
							factura1.set_fecha(fecha);
							factura1.set_subtotal(subtotal2);
							factura1.set_isv(isv);
							factura1.set_total(total);
							gFactura.Modificar(idFactEncontrada, factura1);
							
							//System.out.println("Factura #" + contadorFactura);
							//System.out.println(gFactura.getElementoPorPosicion(contadorFactura));
							gFactura.ImprimirFactura(contadorFactura);
							break;
						case 3:// Imprimir Facturas
							gFactura.ImprimirTodos();
							centinelaFc=true;
							break;
							
						case 4:// Eliminar Factura
							int idFacturaEliminar,facturaPosEliminar;
							System.out.println("Eliminar Factura");
							System.out.println("Ingresar id de la factura a eliminarse");
							gFactura.ImprimirTodos();
							idFacturaEliminar=sc.nextInt();
							facturaPosEliminar=gFactura.BuscarPorId(idFacturaEliminar);
							gFactura.Eliminar(facturaPosEliminar);
							
							break;
						case 5: // Salir
							centinelaFc=false;
							break;
	
						default:
							centinelaFc=false;
							break;
						}
					}// Fin centinelaFc
				case 3://salir
					centinelaAero=false;
					break;
				default:
					centinelaAero=false;
					break;
				}//fin switch opcionAero
			} // fin centinelaAero
		}//fin centinelaPr	
	// FIN
	sc.close();
	sc2.close();
	sc3.close();
	}
}