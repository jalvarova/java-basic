package pe.com.jalvarova.javabasic.herencia;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

public class Client extends Person {

	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;

	public Client(String nombre, Date fechaRegistro, boolean vip) {
		super(nombre);
		contadorCliente++;
		this.idCliente = contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
		// TODO Auto-generated constructor stub
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		StringJoiner builderObject = new StringJoiner(",",this.getClass().getSimpleName(),"\n");

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

		builderObject.add("\t");
		builderObject.add(Integer.toString(idCliente));
		builderObject.add(formatter.format(fechaRegistro));
		String esVip = vip ? "es Vip" : "no es Vip";
		builderObject.add(esVip);
		
		return super.toString() + builderObject.toString();
	}

}
