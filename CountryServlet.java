package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountryServlet")
public class CountryServlet extends HttpServlet {
@Override
   	public void doGet(HttpServlet request, HttpServlet response) throws ServletException, IOException {
	String statesIndia[]={"AP","TS","MP","UP","MH"};
	String UsStates[]={"CA","LA","NY","CR","AZ"};
	String AusisStates[]={"TMS","BB","CBR"};
	String country=null;
	//read form dat
	country=request.getParameter("country");
	//general settings
	PrintWriter pw=res.getWriter();
	response.setContentType("text/html");
	//get states based country thatt is  selected 
	if(country.equals("india")){
		pw.println("states="+Arrays.toString(statesIndia));
			}
	else if(country.equals("us")){
		pw.println("states="+Arrays.toString(UsStates));
	}
	else{
		pw.println("states="+Arrays.toString(statesIndia));
	}
pw.close();
}
@Override
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
