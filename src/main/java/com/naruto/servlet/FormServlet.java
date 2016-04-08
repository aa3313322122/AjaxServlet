package com.naruto.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		System.out.println("come in form get servlet");
		doPost(req, resp);
		
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		/*req.setAttribute("msg", "abc");
		req.getRequestDispatcher("/ask").forward(req, resp);*/
		String url = req.getContextPath() + "/ask?msg=abc";
		resp.sendRedirect(url);
	}

}
