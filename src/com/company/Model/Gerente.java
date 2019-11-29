package com.company.Model;

public class Gerente extends  Funcionario {
    private String salario;
    private String situacao;
    private String comissaoDaLoja;

    public String getComissaoDaLoja() {
        return comissaoDaLoja;
    }

    public void setComissaoDaLoja(String comissaoDaLoja) {
        this.comissaoDaLoja = comissaoDaLoja;
    }

    @Override
    public String getNumeroCarteiraTrabalho() {
        return super.getNumeroCarteiraTrabalho();
    }

    @Override
    public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
        super.setNumeroCarteiraTrabalho(numeroCarteiraTrabalho);
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
