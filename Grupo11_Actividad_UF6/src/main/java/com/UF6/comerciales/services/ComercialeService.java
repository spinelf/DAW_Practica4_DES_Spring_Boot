package com.UF6.comerciales.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.UF6.comerciales.modelo.entitybeans.Comerciale;

@Service
public interface ComercialeService {
	
	boolean altaComercial(Comerciale comercial);
	boolean borrarComercial(int idComercial);
	Comerciale findById(int idComercial);
    List<Comerciale> byCliente(int idCliente);
    List<Comerciale> conPedidos();
    List<Comerciale> findAll();

}
