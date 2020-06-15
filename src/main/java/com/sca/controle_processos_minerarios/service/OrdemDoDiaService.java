package com.sca.controle_processos_minerarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.controle_processos_minerarios.model.OrdemDoDia;
import com.sca.controle_processos_minerarios.repository.OrdemDoDiaRepository;

@Service
public class OrdemDoDiaService {
	
	@Autowired
	private OrdemDoDiaRepository OrdemDoDiaRepository;
	
	@Transactional
	public OrdemDoDia saveOrdemDoDia(OrdemDoDia OrdemDoDia) {
		 OrdemDoDia b = OrdemDoDiaRepository.save(OrdemDoDia);
		 return b;
	}
	
	public List<OrdemDoDia> findAll() {
		return OrdemDoDiaRepository.findAll();
	}

}
