package com.github.leandroalcantara1997.api_agenda_salao.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.leandroalcantara1997.api_agenda_salao.entitty.Cliente;
import com.github.leandroalcantara1997.api_agenda_salao.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/cadastro")
    @PostMapping
    public ResponseEntity<String> cadastroCliente(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam String cpf, @RequestParam String rg, @RequestParam String data_nascimento) {
        try {
            Cliente cliente = new Cliente(nome, sobrenome, cpf, rg, data_nascimento);
            service.cadastroCliente(cliente);
            System.out.println(cliente);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body("Cliente salvo com sucesso!");
    }

    @RequestMapping(value = "/atualiza")
    @PutMapping
    public ResponseEntity<String> atualizaCliente(@RequestParam Long id, @RequestParam String nome, @RequestParam String sobrenome, @RequestParam String cpf, @RequestParam String rg, @RequestParam String data_nascimento) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Cliente cliente = new Cliente(id, nome, sobrenome, cpf, rg, sdf.parse(data_nascimento));
            service.atualizaCadastro(cliente);
            System.out.println(cliente);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body("Cliente atualizado com sucesso!");
    }

    @RequestMapping(value = "/deleta")
    @DeleteMapping
    public ResponseEntity<String> deletaCadastro(@RequestParam Long id) {
        try {
            service.deletaCadastro(id);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Cadastro deletado com sucesso");
    }

}
