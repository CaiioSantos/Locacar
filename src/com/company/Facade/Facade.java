package com.company.Facade;

import com.company.Controller.IControllerClientePF;
import com.company.Exception.ClienteException;
import com.company.Exception.RepositoryClienteException;
import com.company.Model.ClientePf;

import java.util.List;

public class Facade implements IControllerClientePF {

    private  IControllerClientePF iControllerClientePF;

    @Override
    public void inserirClientePF(ClientePf clientePf) throws ClienteException.ClientePfException, RepositoryClienteException {
        this.iControllerClientePF.inserirClientePF(clientePf);
    }

    @Override
    public void deletarClientePF(ClientePf clientePf) {
        this.iControllerClientePF.deletarClientePF(clientePf);
    }

    @Override
    public List<ClientePf> listarCLientePF(ClientePf clientePf) {
        return null;
    }

    @Override
    public void updateClientePF(ClientePf clientePf) {

    }
}
