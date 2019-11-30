package com.company.Repository;


import com.company.Model.VeiculoPasseio;

import java.util.ArrayList;
import java.util.List;

public class RepositoryVeiculoPasseio implements IRepositoryVeiculoPasseio {
    private ArrayList<VeiculoPasseio> veiculoPasseioArrayList;
    private static RepositoryVeiculoPasseio instancia;

    public static RepositoryVeiculoPasseio getInstance() {
        if (instancia == null) {
            instancia = new RepositoryVeiculoPasseio();
        }
        return instancia;
    }

    @Override
    public void inserirVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        this.veiculoPasseioArrayList.add(veiculoPasseio);
    }

    @Override
    public void deletarVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        this.veiculoPasseioArrayList.remove(veiculoPasseio);
    }

    @Override
    public List<VeiculoPasseio> listarVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        return veiculoPasseioArrayList;
    }

    @Override
    public void updateVeiculoPasseio(VeiculoPasseio veiculoPasseio) {

    }
}

