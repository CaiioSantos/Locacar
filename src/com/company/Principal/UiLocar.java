package com.company.Principal;

import com.company.Exception.*;
import com.company.Facade.Facade;
import com.company.Model.Gerente;
import com.company.Model.Locar;
import com.company.Repository.RepositoryLocar;

import java.util.Scanner;

public class UiLocar {
    Scanner scanner = new Scanner(System.in);


    public void showMenu() throws ClientePFException, RepositoryClientePFException, GerenteException, ClientePJException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Locar locar = new Locar();
        Facade facade = new Facade();
        int opcao = 0;

        do{

            System.out.println("======Cadastro de locação======");
            System.out.println("Escolha uma opção:\n1 - Inserir locação\n2 - Listar locação\n"
                    + "3 - Remover locação\n4 - Atualizar locação\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch(opcao){
                case 1:
                    inserirLocar(locar);
                    break;
                case 2:
                    listarLocar(locar);
                    break;
                case 3:
                    deletarLocar(locar);
                    break;
                case 4:
                    atualizarLocar(locar);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (opcao != 0);



    }

    private void atualizarLocar(Locar locar) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.atualizarLocar(locar);
    }

    private void deletarLocar(Locar locar) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.deletarLocar(locar);
    }

    private void listarLocar(Locar locar) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.listarLocar(locar);
    }

    private void inserirLocar(Locar locar) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.inserirLocar(locar);





        System.out.println("Digite o cliente");
        locar.setCliente(scanner.next());
        System.out.println("Digite o veículo");
        locar.setVeiculo(scanner.next());
        System.out.println("Digite a data de início");
        locar.setDataInicio(scanner.next());
        System.out.println("Digite a data de entrega");
        locar.setDataEntrega(scanner.next());


        facade.inserirLocar(locar);
        showMenu();
    }



}
