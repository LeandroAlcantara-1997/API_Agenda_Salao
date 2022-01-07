package com.github.leandroalcantara1997.api_agenda_salao.service;

import com.github.leandroalcantara1997.api_agenda_salao.entitty.Cliente;
import com.github.leandroalcantara1997.api_agenda_salao.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServiceCliente {

    @Autowired
    private ClienteRepository cli;

    public void cadastroCliente(Cliente cliente) throws Exception {
        System.out.println(cli);
        cli.save(cliente);
    }
}
