package br.com.demo.gestaoalunos.Models;

import java.time.LocalDate;

public class Pessoa {
  private String nome;
  private LocalDate dataNascimento;



  public void setDataNascimento(LocalDate dt){
    this.dataNascimento = dt;
  }

  public LocalDate getDataNascimento(){
    return this.dataNascimento;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }



}
