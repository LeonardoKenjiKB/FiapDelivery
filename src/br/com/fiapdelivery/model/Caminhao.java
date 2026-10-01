package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
	private int quantidadeEixos;
	
	public Caminhao(String placa, String modelo, int quantidadeEixos) {
		super(placa, modelo);
		
		this.setQuantidadeEixos(quantidadeEixos);
		
	}
	
	public int getQuantidadeEixos() {
		return this.quantidadeEixos;
	}
	
	private void setQuantidadeEixos(int quantidadeEixos) {
		if (quantidadeEixos > 0) {
			this.quantidadeEixos = quantidadeEixos;
		} else {
			System.out.println("Erro: Quantidade de eixos inválida!");
		}
		
	}
}