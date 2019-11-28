package com.company.Controller;


import com.company.Model.VeiculoTrabalho;
import com.company.Repository.RepositoryVeiculoTrabalho;

import java.util.List;

public class ControllerVeiculoTrabalho implements IControllerVeiculoTrabalho {
    private static ControllerVeiculoTrabalho instancia;
        private RepositoryVeiculoTrabalho repositoryVeiculoTrabalho = RepositoryVeiculoTrabalho.getInstance();

        public ControllerVeiculoTrabalho()  {
        }
        public static ControllerVeiculoTrabalho getInstance() {
            if (instancia == null){
                instancia = new ControllerVeiculoTrabalho();
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
