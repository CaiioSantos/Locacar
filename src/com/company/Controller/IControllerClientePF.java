package com.company.Controller;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePf;

import java.util.List;

public interface IControllerClientePF {

    void inserirClientePF(ClientePf clientePf) throws ClientePFException.ClientePfException, RepositoryClientePFException;
    void deletarClientePF(ClientePf clientePf);
    List<ClientePf> listarCLientePF(ClientePf clientePf);
    void updateClientePF(ClientePf clientePf);
}
