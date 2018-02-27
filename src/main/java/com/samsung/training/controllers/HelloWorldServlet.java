package com.samsung.training.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/hello"})
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 2218168052197231866L ;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	public void doGet (HttpServletRequest request , HttpServletResponse response){
		try {
			response.getWriter( ).write( "Hello World" ) ;
		} catch(IOException e) {
			e.printStackTrace( ) ;
		}
	}
}
