package com.github.leandroalcantara1997.api_agenda_salao.service;

import com.github.leandroalcantara1997.api_agenda_salao.entitty.Cliente;
import com.github.leandroalcantara1997.api_agenda_salao.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {

    @Autowired
    private ClienteRepository cli;

    public void cadastroCliente(Cliente cliente) throws Exception {
        cli.save(cliente);
    }

    public void atualizaCadastro(Cliente cliente) throws Exception {
        cli.save(cliente);
    }

    public void deletaCadastro(Long id) throws Exception {
        cli.deleteById(id);
    }

}
