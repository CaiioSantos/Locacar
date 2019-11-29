package com.company.Controller;


import com.company.Exception.ClientePFException;
import com.company.Exception.ClientePFException.ClientePfException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePF;
import com.company.Repository.RepositoryClientePF;


import java.util.List;

public class ControllerClientePF implements IControllerClientePF {
    private static ControllerClientePF instancia;
      private RepositoryClientePF repositoryClientePF = RepositoryClientePF.getInstance();

    public ControllerClientePF() throws  RepositoryClientePFException, ClientePFException {
    }
    public static ControllerClientePF getInstance() throws ClientePFException, RepositoryClientePFException{
          if (instancia == null){
              instancia = new ControllerClientePF();
          }
        return instancia;
      }


    @Override
    public void inserirClientePF(ClientePF clientePf) throws RepositoryClientePFException, ClientePFException {
          this.repositoryClientePF.inserirClientePF(clientePf);
    }

    @Override
    public void deletarClientePF(ClientePF clientePf) throws ClientePFException, RepositoryClientePFException {
        this.repositoryClientePF.deletarClientePF(clientePf);
    }

    @Override
    public List<ClientePF> listarCLientePF(ClientePF clientePf) {
        return this.repositoryClientePF.listarCLientePF(clientePf);

    }

    @Override
    public void updateClientePF(ClientePF clientePf) throws ClientePFException {
    this.repositoryClientePF.updateClientePF(clientePf);
    }
}
