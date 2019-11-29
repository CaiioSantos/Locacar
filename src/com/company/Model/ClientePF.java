package com.company.Model;

public class ClientePF extends Pessoa {

    private String cpf;
    private String identidade;
    private String idade;
    private String numeroCNH;

    public ClientePF() {
    }

    public ClientePF(String cpf, String identidade, String idade, String numeroCNH) {
        this.cpf = cpf;
        this.identidade = identidade;
        this.idade = idade;
        this.numeroCNH = numeroCNH;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }
}
