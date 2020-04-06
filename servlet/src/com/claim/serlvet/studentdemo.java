package com.claim.serlvet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class studentdemo
 */
@WebServlet("/studentdemo")
public class studentdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentdemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step 1 set content type 
		response.setContentType("text/html");
		
		//Step 2: get the printwriter
		PrintWriter out=response.getWriter();
		
		//Step 3: generate HTML
		out.println("<html><body>");
		
		out.println("The Student is Confirmed:"
				+ request.getParameter("firstName") + " "
				+ requestgetParameter("lastName"));
		out.println("</body><html>");
		
	}

	private String requestgetParameter(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
