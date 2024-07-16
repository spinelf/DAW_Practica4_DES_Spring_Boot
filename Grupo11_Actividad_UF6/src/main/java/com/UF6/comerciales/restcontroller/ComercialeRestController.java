package com.UF6.comerciales.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UF6.comerciales.modelo.entitybeans.Comerciale;
import com.UF6.comerciales.services.ComercialeService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/comercial")


public class ComercialeRestController {
		
	@Autowired
		private ComercialeService comerserve;
		
	
	  @GetMapping ("/uno/{id}")
		
	  public Comerciale findById( @PathVariable( "id" ) int idComercial ) {
	        return comerserve.findById(idComercial);
	    }
	
	  @PostMapping ("/alta")
  	  public String altaComercial (@RequestBody Comerciale comercial) {
  		  return (comerserve.altaComercial(comercial) == true) ? "Alta realizada" : "Alta no realizada";
  	  }
	  
	  
	  @DeleteMapping("/eliminar/{id}")
	    public String borrarComercial( @PathVariable( "id" ) int idComercial ) {

	        if ( this.comerserve.borrarComercial(idComercial) ) {
	            return "Se ha eliminado el comercial correctamemte";
	        } else {
	            return "Error al eliminar el comercial";
	        }
	  }
	   @GetMapping( "/byCliente/{id}" )
	    
	   	public List<Comerciale> porComercial( @PathVariable( "id" ) int idCliente ) {

	            return this.comerserve.byCliente( idCliente );

	        } 
	        
	   @GetMapping( "/conpedidos" )
	    
	   	public List<Comerciale> conPedidos () {

	            return this.comerserve.conPedidos();

	        } 
	      
	    }


