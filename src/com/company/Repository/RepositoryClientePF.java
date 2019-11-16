package com.company.Repository;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePf;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClientePF implements IRepositoryClientePF {
    private ArrayList <ClientePf> clientePfArrayList;
    private static RepositoryClientePF instancia;

    public static RepositoryClientePF getInstance() throws ClientePFException, RepositoryClientePFException {
        if (instancia == null){
            instancia =  new RepositoryClientePF();
        }
        return instancia;
    }


    @Override
    public void inserirClientePF(ClientePf clientePf) throws ClientePFException.ClientePfException, RepositoryClientePFException {
        clientePfArrayList.add(clientePf);
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
