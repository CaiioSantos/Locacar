package com.company.Principal;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Facade.Facade;
import com.company.Model.ClientePF;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws ClientePFException.ClientePfException, RepositoryClientePFException, ClientePFException {




        Scanner input = new Scanner(System.in);
        int sair = 0;
        int opcao =0;
        do {
            System.out.println("Digite 1 para cadastrar cliente");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCLiente();
                case 2:
        }
        }while (opcao !=0);
    }

    private static void cadastrarCLiente( ) throws ClientePFException.ClientePfException, RepositoryClientePFException, ClientePFException {
        Facade facade = new Facade();
        ClientePF clientePF = new ClientePF();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 para Cadastrar CLiente\n Digite 2 para lista Cliente\n Digite 3 para deletar veiculo");
        int opcao;
        do {
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente a ser adicionado");
                    clientePF.setNome(input.next());
                    System.out.println("Digite o CPF do cliente a ser adicionado");
                    clientePF.setCpf(input.next());
                    System.out.println("Digite o CPF do cliente a ser adicionado");
                    clientePF.setEmail(input.next());
                    try {
                        facade.inserirClientePF(clientePF);
                    }catch ( RepositoryClientePFException e){
                        System.out.println("alguma coisa");
                    }
                    break;
                case 2:
                    facade.listarCLientePF(clientePF);
                    break;
                case 3:
                    facade.deletarClientePF(clientePF);
            }
        }while (opcao !=0);


    }

    /*private static void listarClientes(ClientePF clientePfArrayList) {
        if (clientePfArrayList != null){
            for (int i =0; i< clientePfArrayList.size(); i++){
                System.out.println("Nome : " + clientePfArrayList.get(i).getNome());
            }
        }
    }*/



}

