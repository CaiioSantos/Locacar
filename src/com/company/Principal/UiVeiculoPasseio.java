package com.company.Principal;

import com.company.Exception.*;
import com.company.Facade.Facade;
import com.company.Model.VeiculoPasseio;

import java.util.Scanner;

public class UiVeiculoPasseio {
    Scanner scanner = new Scanner(System.in);


    public void showMenu() throws ClientePFException, RepositoryClientePFException, GerenteException, ClientePJException, RepositoryClientePJException {
        VeiculoPasseio veiculoPasseio = new VeiculoPasseio();
        Facade facade = new Facade();
        int opcao = 0;

        do {

            System.out.println("======Cadastro de veículos para passeio======");
            System.out.println("Escolha uma opção:\n1 - Inserir veículo\n2 - Listar veículo\n"
                    + "3 - Remover veículo\n4 - Atualizar veículo\n"
                    + "0 - Voltar ao menu principal");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    inserirVeiculoPasseio(veiculoPasseio);
                    break;
                case 2:
                    listarVeiculoPasseio(veiculoPasseio);
                    break;
                case 3:
                    deletarVeiculoPasseio(veiculoPasseio);
                    break;
                case 4:
                    atualizarVeiculoPasseio(veiculoPasseio);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 0);


    }

    private void atualizarVeiculoPasseio(VeiculoPasseio veiculoPasseio) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.updateVeiculoPasseio(veiculoPasseio);
    }

    private void deletarVeiculoPasseio(VeiculoPasseio veiculoPasseio) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.deletarVeiculoPasseio(veiculoPasseio);
    }

    private void listarVeiculoPasseio(VeiculoPasseio veiculoPasseio) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.listarVeiculoPasseio(veiculoPasseio);
    }

    private void inserirVeiculoPasseio(VeiculoPasseio veiculoPasseio) throws GerenteException, ClientePFException, ClientePJException, RepositoryClientePFException, RepositoryClientePJException {
        Facade facade = new Facade();
        facade.inserirVeiculoPasseio(veiculoPasseio);


        System.out.println("Digite o chassi");
        veiculoPasseio.setChassi(scanner.next());
        System.out.println("Digite a placa");
        veiculoPasseio.setPlaca(scanner.next());
        System.out.println("Digite a cor");
        veiculoPasseio.setCor(scanner.next());
        System.out.println("Digite a categoria");
        veiculoPasseio.setCategoria(scanner.next());


        try {
            facade.inserirVeiculoPasseio(veiculoPasseio);
            showMenu();
        } catch (RepositoryVeiculoPasseioException e) {
            System.out.println("Opa Deu merda");
        }
    }
}