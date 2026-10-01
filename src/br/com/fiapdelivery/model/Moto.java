package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
	
	private boolean possuiBau;
	
	public Moto(String placa, String modelo, boolean possuiBau) {
		super(placa, modelo);
		this.possuiBau = possuiBau;
	}
	
	public boolean getBau() {
		return this.possuiBau;
	}
	
	private void setBau(boolean possuiBau) {
		this.possuiBau = possuiBau;
	}
}
