package com.company.Controller;


import com.company.Exception.GerenteException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.Locar;
import com.company.Model.Locar;
import com.company.Repository.RepositoryLocar;

import java.util.List;

public class ControllerLocar implements IControllerLocar  {

    private static ControllerLocar instancia;
    private RepositoryLocar repositoryLocar = RepositoryLocar.getInstance();

    public ControllerLocar() throws GerenteException, RepositoryClientePFException {
    }

    public static ControllerLocar getInstance() throws GerenteException, RepositoryClientePFException {
        if (instancia == null){
            instancia = new ControllerLocar();
        }
        return instancia;
    }








    @Override
    public void inserirLocar(Locar locar) {
        this.repositoryLocar.inserir(locar);
    }

    @Override
    public void deletarLocar(Locar locar) {
        this.repositoryLocar.deletar(locar);
    }

    @Override
    public List<Locar> listaLocar(Locar locar) {
        return this.repositoryLocar.listar(locar);
    }

    @Override
    public void atualizarLocar(Locar locar) {

    }
}
