package com.company.Facade;

import com.company.Controller.*;
import com.company.Exception.*;
import com.company.Model.*;

import java.util.List;

public class Facade implements IControllerClientePF, IControllerClientePJ, IControllerGerente, IControllerAtendente,IControllerVeiculoPasseio , IControllerVeiculoTrabalho{
    private static  Facade instancia;
    private  IControllerClientePF iControllerClientePF = ControllerClientePF.getInstance();
    private  IControllerClientePF controllerClientePF;
    private IControllerClientePJ iControllerClientePJ = ControllerClientePJ.getInstance();
    private IControllerClientePJ controllerClientePJ;
    private IControllerGerente iControllerGerente = ControllerGerente.getInstance();
    private IControllerGerente controllerGerente;
    private IControllerAtendente iControllerAtendente = ControllerAtendente.getInstance();
    private  IControllerAtendente controllerAtendente;
    private IControllerVeiculoPasseio iControllerVeiculoPasseio = ControllerVeiculoPasseio.getInstance();
    private  IControllerVeiculoPasseio controllerVeiculoPasseio;
    private IControllerVeiculoTrabalho iControllerVeiculoTrabalho = ControllerVeiculoTrabalho.getInstance();
    private IControllerVeiculoTrabalho controllerVeiculoTrabalho;
    private IControllerLocar iControllerLocar = ControllerLocar.getInstance();

    private static Facade getInstance() throws ClientePFException, RepositoryClientePFException, ClientePJException, RepositoryClientePJException, GerenteException {
        if(instancia == null){
            instancia = new Facade();
        }
        return instancia;
    }
    public Facade() throws ClientePFException, RepositoryClientePFException, RepositoryClientePJException, ClientePJException, GerenteException {
        controllerClientePF = ControllerClientePF.getInstance();
        controllerClientePJ = ControllerClientePJ.getInstance();
        controllerGerente = ControllerGerente.getInstance();
        controllerAtendente = ControllerAtendente.getInstance();
        controllerVeiculoPasseio = ControllerVeiculoPasseio.getInstance();
        controllerVeiculoTrabalho = ControllerVeiculoTrabalho.getInstance();
    }

    // Metodos referentes  Cliente Pessoa Fisica
    @Override
    public void inserirClientePF(ClientePF clientePf) throws RepositoryClientePFException, ClientePFException {
        this.controllerClientePF.inserirClientePF(clientePf);
    }

    @Override
    public void deletarClientePF(ClientePF clientePf) throws ClientePFException, RepositoryClientePFException {
        this.controllerClientePF.deletarClientePF(clientePf);
    }

    @Override
    public List<ClientePF> listarCLientePF(ClientePF clientePf) {
        return this.controllerClientePF.listarCLientePF(clientePf);
    }

    @Override
    public void updateClientePF(ClientePF clientePf) throws ClientePFException {
        this.controllerClientePF.updateClientePF(clientePf);
    }



    //metodos referentes a Cliente Pessoa Juridica
    @Override
    public void inserirClientePJ(ClientePJ clientePJ) throws ClientePJException, RepositoryClientePJException {
        this.controllerClientePJ.inserirClientePJ(clientePJ);
    }

    @Override
    public void deletarClientePJ(ClientePJ clientePJ) {
        this.controllerClientePJ.deletarClientePJ(clientePJ);
    }

    @Override
    public List<ClientePJ> listarCLientePJ(ClientePJ clientePJ) {
        return this.controllerClientePJ.listarCLientePJ(clientePJ);
    }

    @Override
    public void updateClientePJ(ClientePJ clientePJ) {
        this.controllerClientePJ.updateClientePJ(clientePJ);
    }

    // metodos referentes a Gerente
    @Override
    public void inserirGerente(Gerente gerente) {
        this.controllerGerente.inserirGerente(gerente);
    }

    @Override
    public void deletarGerente(Gerente gerente) {
        this.controllerGerente.deletarGerente(gerente);
    }

    @Override
    public List<Gerente> listaGerente(Gerente gerente) {
        return this.controllerGerente.listaGerente(gerente);
    }

    @Override
    public void atualizarGerente(Gerente gerente) {

    }
    // metodos relacionados a Atendentes
    @Override
    public void inserirAtendente(Atendente atendente) {
        this.controllerAtendente.inserirAtendente(atendente);
    }

    @Override
    public void deletarAtendente(Atendente atendente) {
        this.controllerAtendente.deletarAtendente(atendente);
    }

    @Override
    public List<Atendente> listarAtendente(Atendente atendente) {
        return controllerAtendente.listarAtendente(atendente);
    }

    @Override
    public void atualizarAtendente(Atendente atendente) {
        this.controllerAtendente.atualizarAtendente(atendente);
    }


    //Metodos referentes ao veiculo passeio
    @Override
    public void inserirVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        this.controllerVeiculoPasseio.inserirVeiculoPasseio(veiculoPasseio);
    }

    @Override
    public void deletarVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        this.controllerVeiculoPasseio.deletarVeiculoPasseio(veiculoPasseio);
    }

    @Override
    public List<VeiculoPasseio> listarVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        return controllerVeiculoPasseio.listarVeiculoPasseio(veiculoPasseio);
    }

    @Override
    public void updateVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        this.controllerVeiculoPasseio.updateVeiculoPasseio(veiculoPasseio);
    }
    //metodos referentes a Veiculo trabalho
    @Override
    public void inserirVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {
            this.controllerVeiculoTrabalho.inserirVeiculoTrabalho(veiculoTrabalho);
    }

    @Override
    public void deletarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {
        this.controllerVeiculoTrabalho.deletarVeiculoTrabalho(veiculoTrabalho);
    }

    @Override
    public List<VeiculoTrabalho> listarVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {
        return this.controllerVeiculoTrabalho.listarVeiculoTrabalho(veiculoTrabalho);
    }

    @Override
    public void updateVeiculoTrabalho(VeiculoTrabalho veiculoTrabalho) {
        this.controllerVeiculoTrabalho.updateVeiculoTrabalho(veiculoTrabalho);
    }


}
