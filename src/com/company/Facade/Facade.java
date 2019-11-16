package com.company.Facade;

import com.company.Controller.ControllerClientePF;
import com.company.Controller.IControllerClientePF;
import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePf;

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
    private Facade()throws ClientePFException, RepositoryClientePFException{
        controllerClientePF = ControllerClientePF.getInstance();
    }

    // Metodos referentes  Cliente Pessoa Fisica
    @Override
    public void inserirClientePF(ClientePf clientePf) throws ClientePFException.ClientePfException, RepositoryClientePFException {
        this.iControllerClientePF.inserirClientePF(clientePf);
    }

    @Override
    public void deletarClientePF(ClientePf clientePf) {
        this.iControllerClientePF.deletarClientePF(clientePf);
    }

    @Override
    public List<ClientePf> listarCLientePF(ClientePf clientePf) {
        return null;
    }

    @Override
    public void updateClientePF(ClientePf clientePf) {

    }
}
