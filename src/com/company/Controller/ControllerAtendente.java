package com.company.Controller;

import com.company.Model.Atendente;
import com.company.Repository.RepositoryAtendente;

import java.util.List;

public class ControllerAtendente implements IControllerAtendente {
    private static ControllerAtendente instancia;
    private RepositoryAtendente repositoryAtendente = RepositoryAtendente.getInstance();

    public ControllerAtendente(){
    }

    public static ControllerAtendente getInstance() {
        if (instancia == null){
            instancia = new ControllerAtendente();
        }
        return instancia;
    }

    @Override
    public void inserirAtendente(Atendente atendente) {
            this.repositoryAtendente.inserir(atendente);
    }

    @Override
    public void deletarAtendente(Atendente atendente) {
        this.repositoryAtendente.deletar(atendente);
    }

    @Override
    public List<Atendente> listarAtendente(Atendente atendente) {
        return this.repositoryAtendente.listar(atendente);
    }

    @Override
    public void atualizarAtendente(Atendente atendente) {
        this.repositoryAtendente.update(atendente);
    }
}
