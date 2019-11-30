package com.company.Repository;

import com.company.Exception.ClientePFException;
import com.company.Exception.ClientePJException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Exception.RepositoryClientePJException;
import com.company.Model.ClientePJ;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClientePJ implements IRepositoryClientePJ {
    private ArrayList <ClientePJ> clientePjArrayList;
    private static RepositoryClientePJ instancia;

    public static RepositoryClientePJ getInstance() throws ClientePJException, RepositoryClientePJException {
        if (instancia == null) {
            instancia = new RepositoryClientePJ();
        }
        return instancia;
    }


    @Override
    public void inserirClientePJ(ClientePJ clientePJ) throws ClientePJException, RepositoryClientePJException {
        clientePjArrayList.add(clientePJ);
    }

    @Override
    public void deletarClientePJ(ClientePJ clientePJ) {
        this.clientePjArrayList.remove(clientePJ);
    }

    @Override
    public List<ClientePJ> listarClientePJ(ClientePJ clientePJ) {
        return clientePjArrayList;
    }

    @Override
    public void updateClientePJ(ClientePJ clientePJ) {

    }


}