package com.company.Controller;

import com.company.Model.Atendente;

import java.util.List;

public interface IControllerAtendente {

    void inserirAtendente(Atendente atendente) ;
    void deletarAtendente(Atendente atendente) ;
    List<Atendente> listarAtendente(Atendente atendente);
    void atualizarAtendente(Atendente atendente) ;
}
