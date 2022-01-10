package com.github.leandroalcantara1997.api_agenda_salao.entitty;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Entity
public class Salao implements Serializable {
    private Long Id;
    private String nome_fantasia;
    private String cnpj;
    private Agenda agenda;
    private Login login;
    private Endereco endereco;
    private Contato contato;
    
    public Salao(String nome_fantasia, String cnpj, Agenda agenda, Login login, Endereco endereco, Contato contato) {

    }

    public Long getId() {
        return Id;
    }
    public String getNome_fantasia() {
        return nome_fantasia;
    }
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Agenda getAgenda() {
        return agenda;
    }
    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }

}
