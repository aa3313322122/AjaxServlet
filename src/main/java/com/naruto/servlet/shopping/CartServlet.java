package com.naruto.servlet.shopping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession ss = req.getSession(false);
		if(null == ss)
		{
			ss = req.getSession();
		}
		if(null == ss.getAttribute("shoppingCart"))
		{
			ss.setAttribute("shoppingCart", new ArrayList<String>());
		}
		
		String s = (String) req.getParameter("cart");
		List<String> list = new ArrayList<String>();
		list = (ArrayList<String>)ss.getAttribute("shoppingCart");
		list.add(s);
		ss.setAttribute("shoppingCart", list);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doPost(req, resp);
	}
	
}
