package com.company.Controller;


import com.company.Model.VeiculoTrabalho;

import java.util.List;

public interface IControllerVeiculoTrabalho {

    void inserirVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);
    void deletarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);
    List<VeiculoTrabalho> listarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);
    void updateVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho);
}
