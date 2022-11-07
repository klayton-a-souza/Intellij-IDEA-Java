package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private int matricula;
    private LocalDate dataNacimento;

    public Funcionario(String nome, int matricula, LocalDate dataNacimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNacimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    @Override
    public String toString() {
        return "Funcionario:" +
                " Nome = '" + nome + '\'' +
                ", Matricula = " + matricula +
                ", Data de Nacimento = " + dataNacimento +
                '}';
    }
}
