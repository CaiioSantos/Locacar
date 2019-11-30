package com.company.Principal;

import com.company.Exception.ClientePFException;
import com.company.Exception.RepositoryClientePFException;
import com.company.Facade.Facade;
import com.company.Model.ClientePF;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) throws ClientePFException.ClientePfException, RepositoryClientePFException, ClientePFException {

        int opcao;

        Scanner s = new Scanner(System.in);


        System.out.println("Escolha uma opção \n1 - Cadastro de CLiente Fisica \n2 - Cadastro Cliente Juridia ");
        opcao = s.nextInt();

        switch (opcao) {
            case 1:
                UiClientePF uiClientePF = new UiClientePF();
                uiClientePF.showMenu();
            case 2:
                UiClientePJ uiClientePJ = new UiClientePJ();
                uiClientePJ.showMenu();
            case 3:
                UiVeiculoPasseio uiVeiculoPasseio = new UiVeiculoPasseio();
                uiVeiculoPasseio.showMenu();
            case 4:
                UiVeiculoTrabalho uiVeiculoTrabalho = new UiVeiculoTrabalho() ;
                uiVeiculoTrabalho.showMenu();
            case 5:
                UiAtendente uiAtendente = new UiAtendente();
                uiAtendente.showMenu();
            case 6:
                UiGerente uiGerente =  new UiGerente();
                uiGerente.showMenu();
                break;


        }
        }

}


