package com.UF6.comerciales.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UF6.comerciales.modelo.entitybeans.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Integer> {

}
