package com.company.Principal;

import com.company.Exception.*;
import com.company.Facade.Facade;
import com.company.Model.ClientePF;

import java.util.ArrayList;
import java.util.Scanner;

public class UiClientePF {
    Scanner scanner = new Scanner(System.in);


    public void showMenu(Facade facade) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        ClientePF clientePF = new ClientePF();
        int opcao = 0;
        String cpf = null;

        do{

            System.out.println("======Cadastro de clientes Pessoa Física======");
            System.out.println("Escolha uma opção:\n1 - Inserir cliente\n2 - Listar cliente\n"
                    + "3 - Remover cliente\n4 - Atualizar cliente\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch(opcao){
                case 1:
                    inserirCliente(clientePF);
                    break;
                case 2:
                    listarCliente(facade.listarCLientePF(clientePF));
                    break;
                case 3:
                    deletarCliente(cpf);
                    break;
                case 4:
                    atualizarCliente(clientePF);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (opcao != 0);



    }

    private void atualizarCliente(ClientePF clientePF) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();

        System.out.println("Digite o nome do cliente para atualizar cadastro");
        clientePF.setNome(scanner.next());
        System.out.println("Digite a atualização do tipo de CNH");
        clientePF.setNumeroCNH(scanner.next());
        try {
                facade.updateClientePF(clientePF);
        }catch (ClientePFException e){
            e.printStackTrace();
        }

    }

    private void deletarCliente(String cpf) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        System.out.println("Digite o CLiente a ser deletado");
        ClientePF clientePF = new ClientePF();
        clientePF.setCpf(scanner.next());


        try {
            facade.deletarClientePF(clientePF);
        }catch (ClientePFException | RepositoryClientePFException e){
            e.getMessage();
        }


    }


    private void listarCliente(ArrayList<ClientePF> clientePFArrayList) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        if (clientePFArrayList != null) {
            for (int i = 0; i <clientePFArrayList.size() ; i++) {
                System.out.println("Nome : " + clientePFArrayList.get(i).getNome() + "\nCPF: "+ clientePFArrayList.get(i).getCpf() +
                        "\n - Tipo CNH " + clientePFArrayList.get(i).getNumeroCNH());
            }

        }
    }

    private void inserirCliente(ClientePF clientePF) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.inserirClientePF(clientePF);



        System.out.println("Digite o nome");
        clientePF.setNome(scanner.next());
        System.out.println("Digite o cpf");
        clientePF.setCpf(scanner.next());
        System.out.println("Digite o número da identidade");
        clientePF.setIdentidade(scanner.next());
        System.out.println("Digite o email");
        clientePF.setEmail(scanner.next());
        System.out.println("Digite a idade");
        clientePF.setIdade(scanner.next());
        System.out.println("Número da CNH");
        clientePF.setNumeroCNH(scanner.next());
        try {
            facade.inserirClientePF(clientePF);
            showMenu(facade);
        }catch (RepositoryClientePFException e){
            e.getMessage();
            showMenu(facade);
        }
    }


}
