package com.UF6.comerciales.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.UF6.comerciales.modelo.entitybeans.Comerciale;



@Repository
public interface ComercialeRepository extends JpaRepository <Comerciale,Integer> {

	    
    @Query( nativeQuery = true, value = "select * from comerciales c inner join pedidos p where c.id_comercial=p.id_comercial and p.id_cliente=? group by c.id_comercial")
    		
				List<Comerciale> byCliente(int idCliente);

    @Query( nativeQuery = true,value = "select * from comerciales c inner join pedidos p where c.id_comercial=p.id_comercial group by c.id_comercial")
      
    			List<Comerciale> conPedidos();
}
