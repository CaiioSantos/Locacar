package com.company.Controller;


import com.company.Exception.RepositoryVeiculoPasseioException;
import com.company.Exception.VeiculoPasseioException;
import com.company.Model.VeiculoPasseio;


import java.util.List;

public interface IControllerVeiculoPasseio {

    void inserirVeiculoPasseio(VeiculoPasseio veiculoPasseio) throws VeiculoPasseioException, RepositoryVeiculoPasseioException;
    void deletarVeiculoPasseio(VeiculoPasseio veiculoPasseio);
    List<VeiculoPasseio> listarVeiculoPasseio(VeiculoPasseio veiculoPasseio);
    void updateVeiculoPasseio(VeiculoPasseio veiculoPasseio);
}
