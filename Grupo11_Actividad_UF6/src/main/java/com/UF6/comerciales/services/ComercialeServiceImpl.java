package com.UF6.comerciales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UF6.comerciales.modelo.entitybeans.Comerciale;
import com.UF6.comerciales.repository.ComercialeRepository;



@Service
public class ComercialeServiceImpl implements ComercialeService{
	@
	Autowired
    private ComercialeRepository comerrepo;

	@Override
	public Comerciale findById(int idComercial) {
		return comerrepo.findById(idComercial).orElse(null);
	}
	
	@Override
	public List<Comerciale> findAll() {
		 return this.comerrepo.findAll();
	    }
	
	@Override
	public boolean altaComercial(Comerciale comercial) {
		boolean alta = false;
        try {
            comerrepo.save(comercial); alta = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return alta;
	
	}

	@Override
    public boolean borrarComercial( int idComercial ) {

        try {
            this.comerrepo.deleteById( idComercial );
            return true;
        } catch ( Exception e ) {
            e.printStackTrace();
            return false;
        }

    }

	@Override
	public List<Comerciale> byCliente(int idCliente) {
		try {
            return this.comerrepo.byCliente(idCliente);
        } catch ( Exception e ) {
            e.printStackTrace();
            return null;
        }
		
	}

	@Override
	public List<Comerciale> conPedidos() {
		
		return comerrepo.conPedidos();
	}

}
