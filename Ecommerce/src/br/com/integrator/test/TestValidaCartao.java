package br.com.integrator.test;

import java.util.regex.Pattern;

import org.junit.Test;

import junit.framework.TestCase;

public class TestValidaCartao  extends TestCase{

	@Test
	public void testRegex() {
		
	     Pattern p = 
				Pattern.compile("((\\d{16}|\\d{4}((-|\\s)\\d{4}){3}))"); 

	     String[] cartaoN = {"1234123412341234",
	    		 				"1234-1234-1234-1234",
	    		 				"1234 1234 1234 1234"};
	     
	     for (int i = 0; i < cartaoN.length; i++) {
	    	 assertTrue( p.matcher(cartaoN[i]).matches());
	     }
	}
	
}
