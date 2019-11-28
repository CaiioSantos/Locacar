package com.company.Repository;


import com.company.Model.VeiculoTrabalho;

import java.util.ArrayList;
import java.util.List;

public class RepositoryVeiculoTrabalho implements IRepositoryVeiculoTrabalho {
    private ArrayList <VeiculoTrabalho> VeiculoTrabalhoArrayList;
    private static RepositoryVeiculoTrabalho instancia;

    public static RepositoryVeiculoTrabalho getInstance()  {
        if (instancia == null){
            instancia =  new RepositoryVeiculoTrabalho();
        }
        return instancia;
    }

    @Override
    public void inserirVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {

    }

    @Override
    public void deletarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {

    }

    @Override
    public List<VeiculoTrabalho> listarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {
        return null;
    }

    @Override
    public void updateVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {

    }
}
