/*
package com.company.Principal;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Facade.Facade;
import com.company.Model.ClientePF;

import java.util.Scanner;

public class UiClientePJ {
    Scanner scanner = new Scanner(System.in);


    public void showMenu() throws ClientePFException, RepositoryClientePFException {
        ClientePF clientePF = new ClientePF();
        Facade facade = new Facade();
        int opcao = 0;

        do{

            System.out.println("======Cadastro de clintes======");
            System.out.println("Escolha uma opção.\n1 - Inserir cliente\n2 - Lista CLientes\n"
                    + "3 - Remover cliente pelo nome\n4 - Pesquisar cliente pelo cpf\n5- Pesquisar cliente pelo bairro\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch(opcao){
                case 1:
                    inserirCliente();
                    break;
                case 2:
                    listarClientes(clientePF);
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (opcao != 0);



    }



    private void listarClientes(ClientePF clientePF) throws ClientePFException, RepositoryClientePFException {
        Facade facade = new Facade();
        facade.listarCLientePF(clientePF);
    }

    private void inserirCliente() throws ClientePFException, RepositoryClientePFException {
        Facade facade = new Facade();
        ClientePF clientePF = new ClientePF();


        System.out.println("Digite o nome");
        clientePF.setNome(scanner.next());
        System.out.println("Digite o cpf");
        clientePF.setCpf(scanner.next());
        System.out.println("Digite o email");
        clientePF.setEmail(scanner.next());
        System.out.println("Digite a idade");
        clientePF.setIdade(scanner.next());
        System.out.println("Numero da CNH");
        clientePF.setNumeroCNH(scanner.next());
        try {
            facade.inserirClientePF(clientePF);
            showMenu();
        }catch (RepositoryClientePFException e){
            System.out.println("Opa Deu merda");
        }
    }



}
*/
