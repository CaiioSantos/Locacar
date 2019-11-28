package com.company.Repository;

import com.company.Exception.ClientePFException;
import com.company.Exception.ClientePJException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Exception.RepositoryClientePJException;
import com.company.Model.ClientePJ;
import com.company.Model.ClientePf;

import java.util.List;

public interface IRepositoryClientePJ {

    void inserirClientePJ(ClientePJ clientePJ) throws ClientePJException, RepositoryClientePJException, ClientePJException;
    void deletarClientePJ(ClientePJ clientePJ);
    List<ClientePJ> listarClientePJ(ClientePJ clientePJ);
    void updateClientePJ(ClientePJ clientePJ);
}
