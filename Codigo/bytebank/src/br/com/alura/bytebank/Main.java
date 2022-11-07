package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Bytebank");

        Funcionario klayton = new Funcionario();

        klayton.setNome("Klayton");
        klayton.setMatricula(1);
        klayton.setDataNacimento(LocalDate.of(1997,5,9));

        System.out.println(klayton);
    }
}
