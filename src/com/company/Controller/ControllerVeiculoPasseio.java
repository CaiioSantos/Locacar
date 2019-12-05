package com.company.Controller;


import com.company.Exception.RepositoryVeiculoPasseioException;
import com.company.Exception.VeiculoPasseioException;
import com.company.Model.VeiculoPasseio;
import com.company.Repository.RepositoryVeiculoPasseio;

import java.util.List;

public class ControllerVeiculoPasseio implements IControllerVeiculoPasseio {
    private static ControllerVeiculoPasseio instancia;
        private RepositoryVeiculoPasseio repositoryVeiculoPasseio = RepositoryVeiculoPasseio.getInstance();

        public ControllerVeiculoPasseio() throws RepositoryVeiculoPasseioException, VeiculoPasseioException {
        }
        public static ControllerVeiculoPasseio getInstance() throws RepositoryVeiculoPasseioException, VeiculoPasseioException {
            if (instancia == null){
                instancia = new ControllerVeiculoPasseio();
            }
            return instancia;
        }


    @Override
    public void inserirVeiculoPasseio(VeiculoPasseio veiculoPasseio) {

    }

    @Override
    public void deletarVeiculoPasseio(VeiculoPasseio veiculoPasseio) {

    }

    @Override
    public List<VeiculoPasseio> listarVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        return null;
    }

    @Override
    public void updateVeiculoPasseio(VeiculoPasseio veiculoPasseio) {

    }
}
