package com.company.Repository;


import com.company.Model.Locar;

import java.util.ArrayList;
import java.util.List;

public class RepositoryLocar implements IRepositoryLocar {
    private ArrayList <Locar> locarArrayList;
    private static RepositoryLocar instancia;

    public static RepositoryLocar getInstance()  {
        if (instancia == null){
            instancia = new RepositoryLocar();
        }
        return instancia;
    }

    public RepositoryLocar() {
        if (this.locarArrayList == null){
            this.locarArrayList = new ArrayList<>();
        }
    }

    @Override
    public void inserir(Locar locar) {
        this.locarArrayList.add(locar);
    }

    @Override
    public void deletar(Locar locar) {
        this.locarArrayList.remove(locar);
    }

    @Override
    public List<Locar> listar(Locar locar) {
        return this.locarArrayList;
    }

    @Override
    public void update(Locar locar) {

    }
}
