package com.github.leandroalcantara1997.api_agenda_salao.entitty;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@ToString

@Entity
public class Agenda implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCliente;

    private Date hora_marcada;

    public Long getId() {
        return id;
    }

    public Date GetHora_marcada(){
        return hora_marcada;
    }

    public void SetHora_marcada(Date hora_marcada){
        this.hora_marcada = hora_marcada;
    }
}
