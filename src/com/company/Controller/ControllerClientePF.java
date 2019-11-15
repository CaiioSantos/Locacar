package com.company.Controller;


import com.company.Exception.ClienteException.ClientePfException;
import com.company.Exception.RepositoryClienteException;
import com.company.Model.ClientePf;
import com.company.Repository.IRepositoryClientePF;


import java.util.List;

public class ControllerClientePF implements IControllerClientePF {
      private IRepositoryClientePF repositoryClientePF;
    @Override
    public void inserirClientePF(ClientePf clientePf) throws ClientePfException, RepositoryClienteException {
          this.repositoryClientePF.inserirClientePF(clientePf);
    }

    @Override
    public void deletarClientePF(ClientePf clientePf) {

    }

    @Override
    public List<ClientePf> listarCLientePF(ClientePf clientePf) {
        return this.repositoryClientePF.listarCLientePF(clientePf);

    }

    @Override
    public void updateClientePF(ClientePf clientePf) {

    }
}
