package com.ninemm.ejbtest;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/plain")
@RequestScoped
public class Plain {
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> SayHello() {		
		int a = 0;
		   for(int i=0;i<10000000;i++) {
			   a +=i;
		   }		
		ArrayList<String> list = new ArrayList<String>();		
		list.add("completed");
        return list;
    }
}
