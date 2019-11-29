package com.company.Controller;

import com.company.Exception.ClientePJException;
import com.company.Exception.RepositoryClientePJException;
import com.company.Model.ClientePJ;

import java.util.List;

public interface IControllerClientePJ {

    void inserirClientePJ(ClientePJ clientePJ) throws ClientePJException, RepositoryClientePJException;
    void deletarClientePJ(ClientePJ clientePJ);
    List<ClientePJ> listarCLientePJ(ClientePJ clientePJ);
    void updateClientePJ(ClientePJ clientePJ);
}
