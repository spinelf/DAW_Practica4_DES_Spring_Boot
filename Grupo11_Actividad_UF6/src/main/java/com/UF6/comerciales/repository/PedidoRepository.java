package com.UF6.comerciales.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.UF6.comerciales.modelo.entitybeans.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido,Integer>{
	
	@Query( value = "select * from pedidos where id_comercial = ?;", nativeQuery = true )
    List<Pedido> pedidosXIdComercial( int idComercial );


}
