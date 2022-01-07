package com.github.leandroalcantara1997.apiagenda_salao.repository;

import com.github.leandroalcantara1997.apiagenda_salao.entitty.Agenda;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    
}
