package com.bitware.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bitware.entity.Cliente;

@Repository
public interface ICliente extends MongoRepository<Cliente, String>{
	
}
