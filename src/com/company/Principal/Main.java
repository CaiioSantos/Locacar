package com.company.Principal;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Facade.Facade;
import com.company.Model.ClientePf;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws ClientePFException.ClientePfException, RepositoryClientePFException {

        ClientePf clientePf = new ClientePf();



        Scanner input = new Scanner(System.in);
        int sair = 0;
        int opcao =0;
        do {
            System.out.println("Digite 1 para cadastrar cliente");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCLiente(clientePf);
            }
        }while (opcao !=0);
    }

    private static void cadastrarCLiente(ClientePf clientePf) throws ClientePFException.ClientePfException, RepositoryClientePFException {
        Facade facade = new Facade();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 para adicionar veiculo \n Digite 2 para lista veiculo\n Digite 3 para deletar veiculo");
        int opcao;
        do {
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente a ser adicionado");
                    clientePf.setNome(input.next());
                    facade.inserirClientePF(clientePf);
                    break;
                case 2:
                    facade.listarCLientePF(clientePf);
            }
        }while (opcao !=0);


    }

    private static void listarClientes(ArrayList<ClientePf> clientePfArrayList) {
        if (clientePfArrayList != null){
            for (int i =0; i< clientePfArrayList.size(); i++){
                System.out.println("Nome : " + clientePfArrayList.get(i).getNome());
            }
        }
    }



}

