package com.company.Repository;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Model.ClientePF;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClientePF implements IRepositoryClientePF {
    private ArrayList <ClientePF> clientePfArrayList;
    private static RepositoryClientePF instancia;

    public static RepositoryClientePF getInstance() throws ClientePFException, RepositoryClientePFException {
        if (instancia == null){
            instancia =  new RepositoryClientePF();
        }
        return instancia;
    }

    public RepositoryClientePF() throws ClientePFException , RepositoryClientePFException{
        if (this.clientePfArrayList == null){
            this.clientePfArrayList = new ArrayList<>();
        }
    }


    @Override
    public void inserirClientePF(ClientePF clientePf) throws ClientePFException, RepositoryClientePFException {
        if (clientePf == null){
            throw new RepositoryClientePFException("Cliente Invalido");
        }if (!existeClientePF(clientePf.getCpf())){
            clientePfArrayList.add(clientePf);
        }else{
            throw new RepositoryClientePFException("Cliente já Cadastrado");
        }
    }

    private boolean existeClientePF(String cpf) {
        for (ClientePF clientePF: clientePfArrayList) {
            if (clientePF.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }


    @Override
    public void deletarClientePF(String clientePf) throws ClientePFException, RepositoryClientePFException {
        if (clientePf == null){
            throw new RepositoryClientePFException("Cliente Invalidado");
        }if (existeClientePF(clientePf.getCpf())){
            clientePfArrayList.remove(clientePf);
            System.out.println("CLiente Deletado com Sucesso");
        }else {
            throw new RepositoryClientePFException("Cliente Não Cadastrado");
        }
    }

    @Override
    public List<ClientePF> listarCLientePF(ClientePF clientePf) {
        return clientePfArrayList;
    }

    @Override
    public void updateClientePF(ClientePF clientePf) throws ClientePFException {
        for (int i = 0; i <clientePfArrayList.size() ; i++) {
            if (clientePfArrayList.get(i).getCpf().equals(clientePf)){
                this.clientePfArrayList.set(i, clientePf);
            }
        }   if (clientePf == null){

        }

    }

}
