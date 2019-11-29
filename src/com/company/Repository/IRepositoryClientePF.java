package com.company.Repository;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePF;

import java.util.List;

public interface IRepositoryClientePF {

    void inserirClientePF(ClientePF clientePf) throws ClientePFException, RepositoryClientePFException;
    void deletarClientePF(ClientePF clientePf) throws ClientePFException, RepositoryClientePFException;
    List<ClientePF> listarCLientePF(ClientePF clientePf);
    void updateClientePF(ClientePF clientePf) throws ClientePFException;

}
