package com.company.Controller;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePF;

import java.util.List;

public interface IControllerClientePF {

    void inserirClientePF(ClientePF clientePf) throws  RepositoryClientePFException, ClientePFException;
    void deletarClientePF(ClientePF cpf) throws ClientePFException, RepositoryClientePFException;
    List<ClientePF> listarCLientePF(ClientePF clientePf);
    void updateClientePF(ClientePF clientePf) throws ClientePFException;
}
