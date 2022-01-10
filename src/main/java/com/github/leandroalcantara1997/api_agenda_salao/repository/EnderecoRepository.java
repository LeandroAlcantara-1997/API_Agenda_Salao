package com.github.leandroalcantara1997.api_agenda_salao.repository;

import com.github.leandroalcantara1997.api_agenda_salao.entitty.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    
}
