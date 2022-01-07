package com.github.leandroalcantara1997.api_agenda_salao.entitty;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString

//@Entity
public class Login implements Serializable {
    private String email;
    private String token;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
