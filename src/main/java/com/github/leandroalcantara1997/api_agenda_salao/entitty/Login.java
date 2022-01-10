package com.github.leandroalcantara1997.api_agenda_salao.entitty;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;

import org.hibernate.annotations.GeneratorType;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString

//@Entity
public class Login implements Serializable {
    @OneToOne(mappedBy = "fk_cliente")
    private Cliente cliente;

    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @Email
    private String email;
    private String token;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
