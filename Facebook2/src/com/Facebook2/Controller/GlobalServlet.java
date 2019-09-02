package com.Facebook2.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Facebook2.Entity.FacebookEmployee;
import com.Facebook2.Service.FacebookService;
import com.Facebook2.Service.FacebookServiceInterface;


public class GlobalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		
		String option=request.getParameter("ac");
	
	if(option.equals("register")) {
		//here name, pass, email nd address are the name of html boxes
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	//now servlet want to transfer above data to service , 
	//so it should transfer in form of object bcoz of DTO(Data Transfer Object) Design Pattern
	//object of what?-> entity 
	//Now, create entity FacebookEmployee nd set all value
	FacebookEmployee fe= new FacebookEmployee();
	fe.setName(name);
	fe.setPass(pass);
	fe.setEmail(email);
	fe.setAddress(address);
	//Now, pass fe object to service layer 
	//How? via a object of service layer 
	//So, create object using factory design pattern and maintain low coupling via interface
	FacebookServiceInterface fs= FacebookService.createServiceObject();
	//createServiceObject() is a factory method
	int i=fs.createProfile(fe);
	if(i>0) {
		out.println("profile created");
	}
	else {
		out.println("could not create profile");
	}
	
	}   
    out.println("</body></html>");
	}
}

