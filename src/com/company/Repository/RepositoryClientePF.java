package com.company.Repository;

import com.company.Exception.ClienteException;
import com.company.Exception.RepositoryClienteException;
import com.company.Model.ClientePf;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClientePF implements IRepositoryClientePF {
    public ArrayList <ClientePf> clientePfArrayList;





    @Override
    public void inserirClientePF(ClientePf clientePf) throws ClienteException.ClientePfException, RepositoryClienteException {
        this.clientePfArrayList.add(clientePf);
    }

    @Override
    public void deletarClientePF(ClientePf clientePf) {
        this.clientePfArrayList.remove(clientePf);
    }

    @Override
    public List<ClientePf> listarCLientePF(ClientePf clientePf) {
        return clientePfArrayList;
    }

    @Override
    public void updateClientePF(ClientePf clientePf) {

    }
}
