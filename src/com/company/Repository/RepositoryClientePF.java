package com.company.Repository;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePf;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClientePF implements IRepositoryClientePF {
    private ArrayList <ClientePf> clientePfArrayList;
    private static RepositoryClientePF instancia;

    public static RepositoryClientePF getInstance() throws ClientePFException, RepositoryClientePFException {
        if (instancia == null){
            instancia =  new RepositoryClientePF();
        }
        return instancia;
    }


    @Override
    public void inserirClientePF(ClientePf clientePf) throws ClientePFException, RepositoryClientePFException {
        if (clientePf == null){
            throw new ClientePFException("Cliente Invalido");
        }if (!existeClientePF(clientePf.getCpf())){
            clientePfArrayList.add(clientePf);
        }else{
            throw new ClientePFException("Cliente já Cadastrado");
        }
    }

    private boolean existeClientePF(String cpf) {
        for (ClientePf clientePF: clientePfArrayList) {
            if (clientePF.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }


    @Override
    public void deletarClientePF(ClientePf clientePf) throws ClientePFException {
        if (clientePf == null){
            throw new ClientePFException("Cliente Invalidado");
        }if (!existeClientePF(clientePf.getCpf())){

        }
    }

    @Override
    public List<ClientePf> listarCLientePF(ClientePf clientePf) {
        return clientePfArrayList;
    }

    @Override
    public void updateClientePF(ClientePf clientePf) {

    }
}
