package com.ninemm.ejbtest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ejbcall")
@RequestScoped
public class EjbCall {
	
	@EJB
	private EjbService ejb;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> SayHello() {
		ejb.doService();			
		ArrayList<String> list = new ArrayList<String>();		
		list.add("completed");
        return list;
    }
}
