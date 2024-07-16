package com.UF6.comerciales.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.UF6.comerciales.modelo.entitybeans.Pedido;


@Service
public interface PedidoService {

	 List<Pedido> pedidosXIdComercial ( int idComercial );
}
