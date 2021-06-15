package com.bitware.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bitware.entity.Cliente;
import com.bitware.repositories.ICliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteApi {

	@Autowired
	private ICliente clienteRepo;
	
	@PostMapping("/NutriNET/Cliente/")
	public Cliente crearCliente(@RequestBody Cliente cliente) {
		String nombre = cliente.getNombre_Usuario();
		String email = cliente.getCorreo_Electronico();
		
		List<Cliente> clientes = clienteRepo.findAll();
		
		for (Cliente clientei : clientes) {
			if(Objects.equals(nombre, clientei.getNombre_Usuario()) || Objects.equals(email, clientei.getCorreo_Electronico())) {
				throw new ClienteExceptions("No puedes introducir Clientes con el mismo nombre o email");
			}
		}
		
		return clienteRepo.insert(cliente);	
		
		
		
	}
	
	@GetMapping("/NutriNET/Cliente/")
	public List<Cliente> leerClientes(){
		return clienteRepo.findAll();
	}
	
	
	@RequestMapping(value="/NutriNET/Cliente/{id}", method = RequestMethod.GET)
	public Optional<Cliente> getClientes(@PathVariable("id") String id) { 
	    return clienteRepo.findById(id);
	}
	
	
	@PutMapping("/NutriNET/Cliente/{id}")
	public Cliente modificaCliente(@PathVariable("id") String id,@RequestBody Cliente cliente) {
		return clienteRepo.save(cliente);
	}
	
	
}
