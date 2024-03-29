package com.company.Controller;

import com.company.Exception.ClientePJException;
import com.company.Exception.RepositoryClientePJException;
import com.company.Model.ClientePJ;
import com.company.Repository.RepositoryClientePJ;

import java.util.List;

public class ControllerClientePJ implements IControllerClientePJ {
    private static ControllerClientePJ instancia;
        private RepositoryClientePJ repositoryClientePJ = RepositoryClientePJ.getInstance();

        public ControllerClientePJ() throws RepositoryClientePJException, ClientePJException {
        }
        public static ControllerClientePJ getInstance() throws ClientePJException, RepositoryClientePJException{
            if (instancia == null){
                instancia = new ControllerClientePJ();
            }
            return instancia;
        }

    @Override
    public void inserirClientePJ(ClientePJ clientePJ) throws ClientePJException, RepositoryClientePJException {
            this.repositoryClientePJ.inserirClientePJ(clientePJ);
    }

    @Override
    public void deletarClientePJ(ClientePJ clientePJ) {
        this.repositoryClientePJ.deletarClientePJ(clientePJ);
    }

    @Override
    public List<ClientePJ> listarCLientePJ(ClientePJ clientePJ) {
        return this.repositoryClientePJ.listarClientePJ(clientePJ);
    }

    @Override
    public void updateClientePJ(ClientePJ clientePJ) {
        this.repositoryClientePJ.updateClientePJ(clientePJ);
    }
}
