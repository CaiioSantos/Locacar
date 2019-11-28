package com.company.Repository;


import com.company.Model.VeiculoTrabalho;

import java.util.List;

public interface IRepositoryVeiculoTrabalho {

    void inserirVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);
    void deletarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);
    List<VeiculoTrabalho> listarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);
    void updateVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);

}
