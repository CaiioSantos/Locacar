package com.company.Repository;

import com.company.Model.Gerente;
import com.company.Model.Locar;

import java.util.ArrayList;
import java.util.List;

public class RepositoryGerente implements IRepositoryGerente {
    private ArrayList<Locar> gerenteArrayList;
    private static RepositoryGerente instancia;

    public static RepositoryGerente getInstance() {
        if (instancia == null) {
            instancia = new RepositoryGerente();
        }
        return instancia;
    }


    @Override
    public void inserir(Gerente gerente) {

    }

    @Override
    public void deletar(Gerente gerente) {

    }

    @Override
    public List<Gerente> listar(Gerente gerente) {
        return null;
    }

    @Override
    public void update(Gerente gerente) {

    }
}
