package com.UF6.comerciales.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UF6.comerciales.modelo.entitybeans.Pedido;

import com.UF6.comerciales.services.PedidoService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pedidos")

public class PedidoRestController {
	
	@Autowired
	private PedidoService pedidoserve;
	
	
    @GetMapping("/{id}")
    public List<Pedido> pedidosXIdComercial(@PathVariable("id") int idComercial){
        return pedidoserve.pedidosXIdComercial(idComercial);
    }
    
	
}
