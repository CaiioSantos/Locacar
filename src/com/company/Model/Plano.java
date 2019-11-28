package com.company.Model;

public abstract class Plano {

    private String planoSemanal;
    private String planoMensal;
    private String planoAnual;

    public String getPlanoSemanal() {
        return planoSemanal;
    }

    public void setPlanoSemanal(String planoSemanal) {
        this.planoSemanal = planoSemanal;
    }

    public String getPlanoMensal() {
        return planoMensal;
    }

    public void setPlanoMensal(String planoMensal) {
        this.planoMensal = planoMensal;
    }

    public String getPlanoAnual() {
        return planoAnual;
    }

    public void setPlanoAnual(String planoAnual) {
        this.planoAnual = planoAnual;
    }
}
