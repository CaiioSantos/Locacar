package com.company.Controller;

import com.company.Model.Gerente;

import java.util.List;

public interface IControllerGerente {

    void inserirGerente(Gerente gerente) ;
    void deletarGerente(Gerente gerente) ;
    List<Gerente> listarGerente(Gerente gerente);
    void atualizarGerente(Gerente atendente) ;

}
