package com.company.Principal;

import com.company.Exception.*;
import com.company.Facade.Facade;
import com.company.Model.Atendente;

import java.util.Scanner;

public class UiAtendente {
    Scanner scanner = new Scanner(System.in);


    public void showMenu() throws ClientePFException, RepositoryClientePFException, GerenteException, ClientePJException, RepositoryClientePJException {
        Atendente atendente = new Atendente();
        Facade facade = new Facade();
        int opcao = 0;

        do{

            System.out.println("======Cadastro de atentendes======");
            System.out.println("Escolha uma opção:\n1 - Inserir atendente\n2 - Listar atendente\n"
                    + "3 - Remover atendente\n4 - Atualizar atendente\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch(opcao){
                case 1:
                    inserirAtendente(atendente);
                    break;
                case 2:
                    listarAtendente(atendente);
                    break;
                case 3:
                    deletarAtendente(atendente);
                    break;
                case 4:
                    atualizarAtendente(atendente);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (opcao != 0);



    }

    private void atualizarAtendente(Atendente atendente) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.atualizarAtendente(atendente);
    }

    private void deletarAtendente(Atendente atendente) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.deletarAtendente(atendente);
    }

    private void listarAtendente(Atendente atendente) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.listarAtendente(atendente);
    }

    private void inserirAtendente(Atendente atendente) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.inserirAtendente(atendente);



        System.out.println("Digite o nome");
        atendente.setNome(scanner.next());
        System.out.println("Digite o email");
        atendente.setEmail(scanner.next());
        System.out.println("Digite o endereço");
        atendente.setEndereco(scanner.next());
        System.out.println("Digite o número da ctps");
        atendente.setNumeroCarteiraTrabalho(scanner.next());
        System.out.println("Digite a comissão");
        atendente.setComissaoVenda(scanner.next());



        try {
            facade.inserirAtendente(atendente);
            showMenu();
        }catch(Exception e){
            System.out.println("Opa Deu merda");
        }
    }



}
