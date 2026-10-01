package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- Inicializando o FiapDelivery ---");
        Pacote pacote1 = new Pacote(
                "BR999",
                10.5,
                "Pendente"
        );
        Caminhao caminhao = new Caminhao(
                "ABC1234",
                "Mercedes-Benz Accelo",
                2
        );
        Rota rotaCaminhao = new Rota(
                "Avenida Paulista, 1106",
                pacote1,
                caminhao
        );
        rotaCaminhao.exibirResumo();
        pacote1.atualizarStatus("Em transporte");
        System.out.println("\nNovo status do pacote: "
                + pacote1.getStatus());
        Pacote pacote2 = new Pacote(
                "BR1000",
                3.2,
                "Pendente"
        );
        Moto moto = new Moto(
                "XYZ5678",
                "Honda CG 160",
                true
        );
        Rota rotaMoto = new Rota(
                "Rua Augusta, 500",
                pacote2,
                moto
        );
        rotaMoto.exibirResumo();
    }
}