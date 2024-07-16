package com.UF6.comerciales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.UF6.comerciales.modelo.entitybeans.Pedido;
import com.UF6.comerciales.repository.PedidoRepository;


@Service
public class PedidoServiceImpl implements PedidoService {


    @Autowired
    private PedidoRepository pedrepo;


    @Override
    public List<Pedido> pedidosXIdComercial( int idComercial ) {

        try {
            return this.pedrepo.pedidosXIdComercial( idComercial );
        } catch ( Exception e ){
            e.printStackTrace();
            return null;
        }

    }
    }

