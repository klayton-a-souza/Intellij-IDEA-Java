package br.com.alura.bytebank;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.visualizador.OpcoesPagamento;

import java.io.IOException;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
//        new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentoList = leitor.ler(1);

        pagamentoList.forEach(pagamento -> {

            double valorBruto = pagamento.getValor();

            if (valorBruto > 100) {
                double valorAcrecimo = valorBruto * 1.1;
                pagamento.setValor(valorAcrecimo);
            }
            System.out.println(pagamento.getValor());
        });
    }

}
