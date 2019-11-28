package com.company.Repository;


import com.company.Model.VeiculoPasseio;

import java.util.List;

public interface IRepositoryVeiculoPasseio {

    void inserirVeiculoPasseio(VeiculoPasseio veiculoPasseio);
    void deletarVeiculoPasseio(VeiculoPasseio veiculoPasseio);
    List<VeiculoPasseio> listarVeiculoPasseio(VeiculoPasseio veiculoPasseio);
    void updateVeiculoPasseio(VeiculoPasseio veiculoPasseio);

}
