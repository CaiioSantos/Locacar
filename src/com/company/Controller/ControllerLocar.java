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

    }

    @Override
    public void deletarLOcar(Locar locar) {

    }

    @Override
    public void deletarLocar(Locar locar) {

    }

    @Override
    public List<Locar> listaLocar(Locar locar) {
        return null;
    }

    @Override
    public void atualizarLocar(Locar locar) {

    }
}
