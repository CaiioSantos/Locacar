package com.company.Principal;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Facade.Facade;
import com.company.Model.Gerente;

import java.util.Scanner;

public class UiGerente {
    Scanner scanner = new Scanner(System.in);


    public void showMenu() throws ClientePFException, RepositoryClientePFException {
        Gerente gerente = new Gerente();
        Facade facade = new Facade();
        int opcao = 0;

        do{

            System.out.println("======Cadastro de gerente======");
            System.out.println("Escolha uma opção:\n1 - Inserir gerente\n2 - Listar gerente\n"
                    + "3 - Remover gerente\n4 - Atualizar gerente\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch(opcao){
                case 1:
                    inserirGerente(gerente);
                    break;
                case 2:
                    listarGerente(gerente);
                    break;
                case 3:
                    deletarGerente(gerente);
                    break;
                case 4:
                    atualizarGerente(gerente);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (opcao != 0);



    }

    private void atualizarGerente(Gerente gerente) {
        Facade facade = new Facade();
        facade.updateGerente(gerente);
    }

    private void deletarGerente(Gerente gerente) {
        Facade facade = new Facade();
        facade.deletarGerente(gerente);
    }

    private void listarGerente(Gerente gerente) {
        Facade facade = new Facade();
        facade.listarGerente(gerente);
    }

    private void inserirGerente(Gerente gerente) {
        Facade facade = new Facade();
        facade.inserirGerente(gerente);





        System.out.println("Digite o nome");
        gerente.setNome(scanner.next());
        System.out.println("Digite o email");
        gerente.setEmail(scanner.next());
        System.out.println("Digite o endereço");
        gerente.setEndereco(scanner.next());
        System.out.println("Digite o salário");
        gerente.setSalario(scanner.next());
        System.out.println("Digite a situação");
        gerente.setSituacao(scanner.next());
        System.out.println("Digite a comissão");
        gerente.setComissaoDaLoja(scanner.next());



        try {
            facade.inserirGerente(gerente);
            showMenu();
        }catch (RepositoryGerenteException e){
            System.out.println("Opa Deu merda");
        }
    }



}
