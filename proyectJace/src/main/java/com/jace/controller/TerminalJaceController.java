package com.jace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jace.entity.Terminal;
import com.jace.service.TerminalService;


@CrossOrigin
@RestController
@RequestMapping("/apiJace")
public class TerminalJaceController {
	
	@Autowired
	private TerminalService terminalService;
	
	@GetMapping("/terminal")
	public List<Terminal> findAll(){
		return terminalService.findAll();
		
	}
		
	@GetMapping("/terminal/{terminalId}")
	public Optional<Terminal> getFactura(@PathVariable String terminalId){
		Optional<Terminal> terminal = this.terminalService.findById(terminalId);
		if(terminal == null) {
			throw new RuntimeException("No se encontro Terminal"+ terminalId);
		}
		
		return terminal;
	}
	
	@PostMapping("/TerminalAdd")
	public Terminal addFactura(@RequestBody Terminal terminal) {
		terminal.setId_terminal("0");
		terminalService.save(terminal);
		
		return terminal;
	}
	
     @DeleteMapping("/terminalDel/{terminalId}")
     public String deleteTerminal(@PathVariable String id_terminal) {
       Optional<Terminal> terminal = terminalService.findById(id_terminal);
       if(terminal == null) {
    	   throw new  RuntimeException("Terminal no encontrado"+ id_terminal);
       }
       terminalService.deleteById(id_terminal);
       return "Delete terminal"+ id_terminal;
     }
}
