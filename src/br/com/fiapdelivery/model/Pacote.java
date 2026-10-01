package br.com.fiapdelivery.model;

public class Pacote {
	
	private String codigo;
	private double peso;
	private String status;
	
	public Pacote (String codigo, double peso, String status) {
		this.setCodigo(codigo);
		this.setStatus(status);
		this.setPeso(peso);
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	private void setPeso(double valor) {
		if(valor > 0) {
			this.peso = valor;
		}else {
			System.out.println("Erro: Insira um peso válido");
		}
		
	} 
	
	public String getCodigo() {
		return this.codigo;
	}
	
	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	private void setStatus(String status) {
		this.status = status;
	}
	
	public void atualizarStatus(String novoStatus) {
		this.status = novoStatus;
	}

}