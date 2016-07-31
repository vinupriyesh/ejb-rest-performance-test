package com.ninemm.ejbtest;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/functioncall")
@RequestScoped
public class FunctionCall{
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> SayHello() {		
		SimpleService ss = new SimpleService();
		ss.doService();
		ArrayList<String> list = new ArrayList<String>();		
		list.add("completed");
        return list;
    }
}
