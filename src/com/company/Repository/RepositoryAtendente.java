package com.company.Repository;

import com.company.Model.Atendente;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAtendente implements IRepositoryAtendente {
    private ArrayList<Atendente> gerenteArrayList;
    private static RepositoryAtendente instancia;

    public static RepositoryAtendente getInstance() {
        if (instancia == null) {
            instancia = new RepositoryAtendente();
        }
        return instancia;
    }


    @Override
    public void inserir(Atendente atendente) {

    }

    @Override
    public void deletar(Atendente atendente) {

    }

    @Override
    public List<Atendente> listar(Atendente atendente) {
        return null;
    }

    @Override
    public void update(Atendente atendente) {

    }
}
