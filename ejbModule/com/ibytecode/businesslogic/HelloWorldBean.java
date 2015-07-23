package com.ibytecode.businesslogic;

import com.ibytecode.business.HelloWorld;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class HelloWorldBean implements HelloWorld {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String sayHello() {
    	// TODO Auto-generated method stub
    	return "Hello World !!!";
    }

}
