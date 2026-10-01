package br.com.fiapdelivery.model;

public class Rota {

    private String destino;
    private Veiculo veiculoUtilizado;
    private Pacote pacote;

    public Rota(String destino, Pacote pacote, Veiculo veiculoUtilizado) {
        this.destino = destino;
        this.pacote = pacote;
        this.veiculoUtilizado = veiculoUtilizado;

        System.out.println("Novo Delivery solicitado para: " + this.destino);
    }

    public void exibirResumo() {
        System.out.println("\n------- Resumo da Rota -------");
        System.out.println("Destino: " + this.destino);
        System.out.println(
            "Veículo: " + this.veiculoUtilizado.getModelo()
            + " (Placa: " + this.veiculoUtilizado.getPlaca() + ")"
        );
        System.out.println("Pacote: " + this.pacote.getCodigo());
        System.out.println("Peso: " + this.pacote.getPeso() + " kg");
        System.out.println("Status: " + this.pacote.getStatus());
    }

    public String getDestino() {
        return this.destino;
    }

    public Pacote getPacote() {
        return this.pacote;
    }

    public Veiculo getVeiculoUtilizado() {
        return this.veiculoUtilizado;
    }
}