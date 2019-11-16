package com.company.Model;

  public abstract class Funcionario extends Pessoa {

      private String numeroCarteiraTrabalho;

      public String getNumeroCarteiraTrabalho() {
          return numeroCarteiraTrabalho;
      }

      public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
          this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
      }

      @Override
      public String getNome() {
          return super.getNome();
      }

      @Override
      public void setNome(String nome) {
          super.setNome(nome);
      }

      @Override
      public String getEmail() {
          return super.getEmail();
      }

      @Override
      public void setEmail(String email) {
          super.setEmail(email);
      }

      @Override
      public String getEndereco() {
          return super.getEndereco();
      }

      @Override
      public void setEndereco(String endereco) {
          super.setEndereco(endereco);
      }
  }
