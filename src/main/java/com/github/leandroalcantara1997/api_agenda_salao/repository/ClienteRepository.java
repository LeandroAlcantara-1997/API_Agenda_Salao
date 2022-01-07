package com.github.leandroalcantara1997.api_agenda_salao.repository;

import com.github.leandroalcantara1997.api_agenda_salao.entitty.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
