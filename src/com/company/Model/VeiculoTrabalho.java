package com.company.Model;

public class VeiculoTrabalho extends Veiculo{
    public String capacidadeCarga;
    public String perfilCarga;

    public VeiculoTrabalho() {

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



    public String getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(String capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPerfilCarga() {
        return perfilCarga;
    }

    public void setPerfilCarga(String perfilCarga) {
        this.perfilCarga = perfilCarga;
    }
}
