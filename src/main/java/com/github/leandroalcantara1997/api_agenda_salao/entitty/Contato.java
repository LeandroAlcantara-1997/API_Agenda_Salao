package com.github.leandroalcantara1997.api_agenda_salao.entitty;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString

//@Entity
public class Contato implements Serializable {
    private Long id;
    private String telefone;
    private String celular;

    @Email
    private String email;

    public Long getId() {
        return id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelulat() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
