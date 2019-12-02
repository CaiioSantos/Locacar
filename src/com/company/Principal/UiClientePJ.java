package com.company.Principal;

import com.company.Exception.*;
import com.company.Facade.Facade;
import com.company.Model.ClientePJ;

import java.util.Scanner;

public class UiClientePJ {
    Scanner scanner = new Scanner(System.in);


    public void showMenu() throws ClientePJException, RepositoryClientePJException, ClientePFException, RepositoryClientePFException, GerenteException {
        ClientePJ clientePJ = new ClientePJ();
        Facade facade = new Facade();
        int opcao = 0;

        do {

            System.out.println("======Cadastro de clientes Pessoa Jurídica======");
            System.out.println("Escolha uma opção:\n1 - Inserir cliente\n2 - Listar cliente\n"
                    + "3 - Remover cliente\n4 - Atualizar cliente\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    inserirCliente(clientePJ);
                    break;
                case 2:
                    listarCliente(clientePJ);
                    break;
                case 3:
                    deletarCliente(clientePJ);
                    break;
                case 4:
                    atualizarCliente(clientePJ);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 0);


    }

    private void deletarCliente(ClientePJ clientePJ) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.deletarClientePJ(clientePJ);

    }

    private void listarCliente(ClientePJ clientePJ) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.listarCLientePJ(clientePJ);

    }

    private void inserirCliente(ClientePJ clientePJ) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.inserirClientePJ(clientePJ);
    }

    private void atualizarCliente(ClientePJ clientePJ) throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.updateClientePJ(clientePJ);


        System.out.println("Digite o nome");
        clientePJ.setNome(scanner.next());
        System.out.println("Digite o cnpj");
        clientePJ.setCnpj(scanner.next());
        System.out.println("Digite o email");
        clientePJ.setEmail(scanner.next());
        System.out.println("Número da CNH");
        clientePJ.setNumeroCNH(scanner.next());
        try {
            facade.inserirClientePJ(clientePJ);
            showMenu();
        } catch (RepositoryClientePJException e) {
            System.out.println("Opa Deu merda");
        }
    }

}