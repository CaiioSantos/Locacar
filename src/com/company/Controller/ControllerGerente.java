package com.company.Controller;

import com.company.Exception.GerenteException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.Gerente;
import com.company.Repository.RepositoryGerente;

import java.util.List;

public class ControllerGerente implements IControllerGerente {

    private static ControllerGerente instancia;
    private RepositoryGerente repositoryGerente = RepositoryGerente.getInstance();

    public ControllerGerente() throws GerenteException, RepositoryClientePFException {
    }

    public static ControllerGerente getInstance() throws GerenteException, RepositoryClientePFException {
        if (instancia == null){
            instancia = new ControllerGerente();
        }
        return instancia;
    }

    @Override
    public void inserirGerente(Gerente gerente) {
        this.repositoryGerente.inserir(gerente);
    }

    @Override
    public void deletarGerente(Gerente gerente) {
        this.repositoryGerente.deletar(gerente);
    }

    @Override
    public List<Gerente> listarGerente(Gerente gerente) {
        return repositoryGerente.listar(gerente);
    }

    @Override
    public List<Gerente> atualizarGerente(Gerente gerente) {
        this.repositoryGerente.atualizarGerente(gerente);
        return null;
    }
}
