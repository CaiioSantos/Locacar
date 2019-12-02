package com.company.Repository;

import com.company.Exception.GerenteException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.Gerente;


import java.util.ArrayList;
import java.util.List;

public class RepositoryGerente implements IRepositoryGerente {
    private ArrayList <Gerente> gerenteArrayList;
    private static RepositoryGerente instancia;

    public static RepositoryGerente getInstance() throws GerenteException, RepositoryClientePFException {
        if (instancia == null){
            instancia = new RepositoryGerente();
        }
        return instancia;
    }

    public RepositoryGerente() throws GerenteException , RepositoryClientePFException{
        if (this.gerenteArrayList == null){
            this.gerenteArrayList = new ArrayList<>();
        }
    }

    @Override
    public void inserir(Gerente gerente) {
        this.gerenteArrayList.add(gerente);
    }

    @Override
    public void deletar(Gerente gerente) {
    this.gerenteArrayList.remove(gerente);
    }

    @Override
    public List<Gerente> listar(Gerente gerente) {
        return this.gerenteArrayList;
    }

    @Override
    public void atualizarGerente(Gerente gerente) {
        for (int i = 0; i <gerenteArrayList.size() ; i++) {
            if (gerenteArrayList.get(i).getEmail().equals(gerente)){
                this.gerenteArrayList.set(i, gerente);
            }
        }   if (gerente == null){
            System.out.println("Deu Merda");
        }

    }
}
