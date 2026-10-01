package br.com.fiapdelivery.model;

public class Veiculo {
	
	private String placa;
	private String modelo;
	
	public Veiculo(String placa, String modelo) {
		this.setPlaca(placa);
		this.modelo = modelo;
		System.out.println("Delivery será feito em um: " + this.modelo + "com a placa" + this.placa);
		
	}
		public String getPlaca(){
			return this.placa;
		}
		
		public String getModelo() {
			return this.modelo;
		}
		
		private void setPlaca(String novaPlaca) {
			if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
				this.placa = novaPlaca;
				System.out.println("A placa foi cadastrada com sucesso: " + this.placa);
			
			}else {
				System.out.println("Erro: A placa informada é inválida!");
			}
			
		}
	
}


































