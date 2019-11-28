package com.company.Repository;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePf;

import java.util.List;

public interface IRepositoryClientePF {

    void inserirClientePF(ClientePf clientePf) throws ClientePFException, RepositoryClientePFException;
    void deletarClientePF(ClientePf clientePf) throws ClientePFException;
    List<ClientePf> listarCLientePF(ClientePf clientePf);
    void updateClientePF(ClientePf clientePf);

}
