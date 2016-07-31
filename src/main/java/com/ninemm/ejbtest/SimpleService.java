package com.ninemm.ejbtest;



public class SimpleService {		
	
   public void doService() {
	   int a = 0;
	   for(int i=0;i<10000000;i++) {
		   a +=i;
	   }
   }
}
