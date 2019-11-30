package com.company.Repository;

import com.company.Model.Gerente;


import java.util.List;

public interface IRepositoryGerente {

    void inserir(Gerente gerente);
    void deletar(Gerente gerente);
    List<Gerente> listar(Gerente gerente);
    void atualizarGerente(Gerente gerente);
}
