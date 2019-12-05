package com.company.Model;

public class Atendente extends Funcionario{
    private String comissaoVenda;

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

    @Override
    public int size() {
        return 0;
    }

    public Atendente() {
    }
    public String getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(String comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }
}
