package com.company.Repository;

import com.company.Model.Atendente;


import java.util.List;

public interface IRepositoryAtendente {

    void inserir(Atendente atendente);
    void deletar(Atendente atendente);
    List<Atendente> listar(Atendente atendente);
    void update(Atendente atendente);
}
