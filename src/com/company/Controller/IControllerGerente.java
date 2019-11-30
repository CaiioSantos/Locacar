package com.company.Controller;

import com.company.Model.Gerente;

import java.util.List;

public interface IControllerGerente {

    void inserirGerente(Gerente gerente) ;
    void deletarGerente(Gerente gerente) ;
    List<Gerente> listaGerente(Gerente gerente);
    void atualizarGerente(Gerente atendente) ;

}
