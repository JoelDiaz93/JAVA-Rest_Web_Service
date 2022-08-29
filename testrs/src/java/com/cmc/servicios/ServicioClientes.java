package com.cmc.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cmc.entidad.Cliente;

@Path("/clientes")
public class ServicioClientes {

	@Path("/m1")
	@GET
	public String metodo1() {
		return "Saludando desde el rest web service!!";
	}

	@Path("/consulta")
	@GET
	@Produces(MediaType.APPLICATION_JSON)//application/json
	public Cliente consultar() {
		Cliente c = new Cliente("1234567890", "Carlos", 23, true);
		return c;
	}
	
	@Path("/guardar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)//application/json
	public void guardar(Cliente cliente){
		System.out.println("Nombre: "+cliente.getNombre());
		System.out.println("Cedula: "+cliente.getCedula());
	}
}
