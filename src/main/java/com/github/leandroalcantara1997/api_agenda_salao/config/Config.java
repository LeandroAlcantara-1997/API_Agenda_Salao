package com.github.leandroalcantara1997.api_agenda_salao.config;

import java.util.Date;

import com.github.leandroalcantara1997.api_agenda_salao.entitty.Cliente;
import com.github.leandroalcantara1997.api_agenda_salao.service.ClienteService;

import org.springframework.boot.CommandLineRunner;

public class Config implements CommandLineRunner{
    private ClienteService serviceCliente;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Cliente cliente = new Cliente("Leandro", "Alcantara", "46372249855", "537149880", "24/12/1997");
        serviceCliente.cadastroCliente(cliente);
        
    }
    
}
