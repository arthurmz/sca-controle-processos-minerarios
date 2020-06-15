package com.sca.controle_processos_minerarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.controle_processos_minerarios.model.OrdemDoDia;

@Repository
public interface OrdemDoDiaRepository extends JpaRepository<OrdemDoDia, Long>{

}
