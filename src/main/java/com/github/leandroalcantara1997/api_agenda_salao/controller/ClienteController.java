package com.github.leandroalcantara1997.api_agenda_salao.controller;

import java.util.Date;

import com.github.leandroalcantara1997.api_agenda_salao.entitty.Cliente;
import com.github.leandroalcantara1997.api_agenda_salao.service.ServiceCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ServiceCliente service;

    @GetMapping
    public ResponseEntity<Cliente> helloWorld() {
        Cliente cl = new Cliente();
        // cl.setNome("Leandro");
        return ResponseEntity.ok().body(cl);
    }

    @RequestMapping(value = "/cadastro")
    @PostMapping
    public ResponseEntity<String> cadastroCliente(@RequestParam String nome) {
        try {
            Cliente cliente = new Cliente("Leonardo", "Silva", "42372249155", "535649880", "22/12/1997");
            service.cadastroCliente(cliente);
            System.out.println(cliente);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body("Cliente salvo com sucesso!");
    }
}
