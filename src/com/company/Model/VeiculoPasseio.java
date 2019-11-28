package com.company.Model;

public class VeiculoPasseio extends Veiculo {
    public String categoria;

    public VeiculoPasseio() {

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getChassi() {
        return super.getChassi();
    }

    @Override
    public void setChassi(String chassi) {
        super.setChassi(chassi);
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }
}
