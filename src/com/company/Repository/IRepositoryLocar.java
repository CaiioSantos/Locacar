package com.company.Repository;


import com.company.Model.Locar;

import java.util.List;

public interface IRepositoryLocar {

    void inserir(Locar locar);
    void deletar(Locar locar);
    List<Locar> listar(Locar locar);
    void update(Locar locar);
}
