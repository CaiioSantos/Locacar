package com.company.Facade;

import com.company.Controller.ControllerClientePF;
import com.company.Controller.IControllerClientePF;
import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePF;

import java.util.List;

public class Facade implements IControllerClientePF {
    private static  Facade instancia;
    private  IControllerClientePF iControllerClientePF = ControllerClientePF.getInstance();
    private  IControllerClientePF controllerClientePF;

    private static Facade getInstance() throws ClientePFException, RepositoryClientePFException{
        if(instancia == null){
            instancia = new Facade();
        }
        return instancia;
    }
    public Facade()throws ClientePFException, RepositoryClientePFException{
        controllerClientePF = ControllerClientePF.getInstance();
    }

    // Metodos referentes  Cliente Pessoa Fisica
    @Override
    public void inserirClientePF(ClientePF clientePf) throws RepositoryClientePFException, ClientePFException {
        this.iControllerClientePF.inserirClientePF(clientePf);
    }

    @Override
    public void deletarClientePF(ClientePF clientePf) throws ClientePFException, RepositoryClientePFException {
        this.iControllerClientePF.deletarClientePF(clientePf);
    }

    @Override
    public List<ClientePF> listarCLientePF(ClientePF clientePf) {
        return this.iControllerClientePF.listarCLientePF(clientePf);
    }

    @Override
    public void updateClientePF(ClientePF clientePf) throws ClientePFException {
        this.iControllerClientePF.updateClientePF(clientePf);
    }
}
