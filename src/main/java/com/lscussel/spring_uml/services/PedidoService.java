package com.lscussel.spring_uml.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lscussel.spring_uml.domain.Pedido;
import com.lscussel.spring_uml.repositories.PedidoRepository;
import com.lscussel.spring_uml.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
