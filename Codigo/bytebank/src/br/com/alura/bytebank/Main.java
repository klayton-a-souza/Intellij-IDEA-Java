package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Bytebank");
        Funcionario klayton = new Funcionario("Klayton",1,LocalDate.of(1997,5,9));
        Funcionario jose = new Funcionario("Jose",2,LocalDate.of(1991,5,15));

        System.out.println(klayton);
        System.out.println(jose);
    }
}
