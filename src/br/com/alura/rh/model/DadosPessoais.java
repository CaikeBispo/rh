package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DadosPessoais {

    private String nome;
    private String cpf;
    Cargo cargo;
    BigDecimal salario;
    LocalDate dataUltimoReajuste;

    public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }
}
