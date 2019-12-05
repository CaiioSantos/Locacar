package com.company.Principal;

import com.company.Exception.*;
import com.company.Facade.Facade;
import com.company.Model.VeiculoTrabalho;

import java.util.Scanner;

public class UiVeiculoTrabalho {
    Scanner scanner = new Scanner(System.in);


    public void showMenu() throws ClientePFException, RepositoryClientePFException, ClientePJException, GerenteException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        VeiculoTrabalho veiculoTrabalho = new VeiculoTrabalho();
        Facade facade = new Facade();
        int opcao = 0;

        do {

            System.out.println("======Cadastro de veículos para trabalho======");
            System.out.println("Escolha uma opção:\n1 - Inserir veículo\n2 - Listar veículo\n"
                    + "3 - Remover veículo\n4 - Atualizar veículo\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    inserirVeiculoTrabalho(veiculoTrabalho);
                    break;
                case 2:
                    listarVeiculoTrabalho(veiculoTrabalho);
                    break;
                case 3:
                    deletarVeiculoTrabalho(veiculoTrabalho);
                    break;
                case 4:
                    atualizarVeiculoTrabalho(veiculoTrabalho);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 0);


    }

    private void atualizarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.updateVeiculoTrabalho(veiculoTrabalho);
    }

    private void deletarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.deletarVeiculoTrabalho(veiculoTrabalho);
    }

    private void listarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.listarVeiculoTrabalho(veiculoTrabalho);
    }

    private void inserirVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException, RepositoryVeiculoPasseioException, VeiculoPasseioException {
        Facade facade = new Facade();
        facade.inserirVeiculoTrabalho(veiculoTrabalho);


        System.out.println("Digite o chassi");
        veiculoTrabalho.setChassi(scanner.next());
        System.out.println("Digite a placa");
        veiculoTrabalho.setPlaca(scanner.next());
        System.out.println("Digite a cor");
        veiculoTrabalho.setCor(scanner.next());
        System.out.println("Digite a capacidade da carga");
        veiculoTrabalho.setCapacidadeCarga(scanner.next());
        System.out.println("Digite o perfil da carga");
        veiculoTrabalho.setPerfilCarga(scanner.next());


        try {
            facade.inserirVeiculoTrabalho(veiculoTrabalho);
            showMenu();
        } catch (RepositoryClientePFException e) {
                e.getMessage();
        }
    }
}