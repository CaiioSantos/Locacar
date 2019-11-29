package com.company.Repository;


import com.company.Model.Locar;

import java.util.ArrayList;
import java.util.List;

public class RepositoryLocar implements IRepositoryLocar {
    private ArrayList<Locar> locarArrayList;
    private static RepositoryLocar instancia;

    public static RepositoryLocar getInstance() {
        if (instancia == null) {
            instancia = new RepositoryLocar();
        }
        return instancia;
    }


    @Override
    public void inserir(Locar locar) {

    }

    @Override
    public void deletar(Locar locar) {

    }

    @Override
    public List<Locar> listar(Locar locar) {
        return null;
    }

    @Override
    public void update(Locar locar) {

    }
}
