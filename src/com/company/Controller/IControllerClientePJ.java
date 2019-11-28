package com.company.Controller;

import com.company.Exception.ClientePFException;
import com.company.Exception.ClientePJException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Exception.RepositoryClientePJException;
import com.company.Model.ClientePJ;
import com.company.Model.ClientePf;

import java.util.List;

public interface IControllerClientePJ {

    void inserirClientePJ(ClientePJ clientePJ) throws ClientePJException, RepositoryClientePJException;
    void deletarClientePJ(ClientePJ clientePJ);
    List<ClientePJ> listarCLientePJ(ClientePJ clientePJ);
    void updateClientePJ(ClientePJ clientePJ);
}
