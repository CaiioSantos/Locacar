package com.company.Repository;

import com.company.Exception.ClienteException;
import com.company.Exception.RepositoryClienteException;
import com.company.Model.ClientePf;

import java.util.List;

public interface IRepositoryClientePF {

    void inserirClientePF(ClientePf clientePf) throws ClienteException.ClientePfException, RepositoryClienteException;
    void deletarClientePF(ClientePf clientePf);
    List<ClientePf> listarCLientePF(ClientePf clientePf);
    void updateClientePF(ClientePf clientePf);

}