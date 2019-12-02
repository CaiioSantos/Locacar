package com.company.Controller;

import java.util.List;

import com.company.Model.Gerente;
import com.company.Model.Locar;


public interface IControllerLocar {

    void inserirLocar(Locar locar) ;
    void deletarLOcar(Locar locar) ;
    void deletarLocar(Locar locar);
    List<Locar> listaLocar(Locar locar);
    void atualizarLocar(Locar locar) ;
}
