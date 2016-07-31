package com.ninemm.ejbtest;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class EjbService {	
	@PostConstruct
	public void postConstruct(){
	    System.out.println("Your ejb is created");
	}
	
   public void doService() {
	   int a = 0;
	   for(int i=0;i<10000000;i++) {
		   a +=i;
	   }
   }
}
