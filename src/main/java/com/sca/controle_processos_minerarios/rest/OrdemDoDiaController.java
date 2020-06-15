package com.sca.controle_processos_minerarios.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.controle_processos_minerarios.model.OrdemDoDia;
import com.sca.controle_processos_minerarios.repository.OrdemDoDiaRepository;
import com.sca.controle_processos_minerarios.service.OrdemDoDiaService;

@RestController
@RequestMapping("/ordensDoDia")
public class OrdemDoDiaController {
	
	@Autowired
	private OrdemDoDiaService OrdemDoDiaService;
	
	@Autowired
	private OrdemDoDiaRepository ordemDoDiaRepository;
	
	@GetMapping
	public List<OrdemDoDia> getAllOrdemDoDias(){
		return OrdemDoDiaService.findAll();
	}
	
	@GetMapping("{id}")
	public OrdemDoDia getOrdemDoDia(@PathVariable Long id) {
		return ordemDoDiaRepository.getOne(id);
	}
	
	@PostMapping()
	public OrdemDoDia saveOrdemDoDia(@RequestBody OrdemDoDia OrdemDoDia) throws Exception {
		return OrdemDoDiaService.saveOrdemDoDia(OrdemDoDia);
	}
	
	@PutMapping()
	public OrdemDoDia alteraOrdemDoDia(@RequestBody OrdemDoDia OrdemDoDia) throws Exception {
		return OrdemDoDiaService.saveOrdemDoDia(OrdemDoDia);
	}

}
