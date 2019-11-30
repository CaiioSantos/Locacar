package com.company.Repository;

import com.company.Model.Atendente;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAtendente implements IRepositoryAtendente {
    private ArrayList<Atendente> atendenteArrayList;
    private static RepositoryAtendente instancia;

    public static RepositoryAtendente getInstance() {
        if (instancia == null) {
            instancia = new RepositoryAtendente();
        }
        return instancia;
    }


    @Override
    public void inserir(Atendente atendente) {
        this.atendenteArrayList.add(atendente);
    }

    @Override
    public void deletar(Atendente atendente) {
    this.atendenteArrayList.remove(atendente);
    }

    @Override
    public List<Atendente> listar(Atendente atendente) {
        return this.atendenteArrayList;
    }

    @Override
    public void update(Atendente atendente) {

    }
}
