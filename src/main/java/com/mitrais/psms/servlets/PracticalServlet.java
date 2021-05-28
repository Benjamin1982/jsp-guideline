package com.mitrais.psms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.mitrais.psms.model.DaoStuff;
import com.mitrais.psms.model.Stuff;

public class PracticalServlet extends HttpServlet
{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 123L;
    private DaoStuff stuffDao = DaoStuff.getInstance();
    //look at me
    private static final Logger LOGGER = Logger.getLogger(PracticalServlet.class.getName());
    
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException  
    {
    	doGet(req,resp);
    }
    
    
	// Leave the Printer where it is ..
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{/*
			res.setContentType("text/html");//setting the content type  
			PrintWriter pw=res.getWriter();//get the stream to write the data  
			  
			//writing html in the stream  
			pw.println("<html><body>");  
			pw.println("Welcome to servlet");  
			pw.println("</body></html>");  
			  
			pw.close();//closing the stream  
			*/
		
		    String action = req.getServletPath();
		    // real actions
			try
			{
				switch(action)
				{
				case "/new":
					break;
				case "/insert":
					break;
				case "/delete":
					break;
				case "/edit":
					break;
				case "/update":
					break;
				default:
					LOGGER.log(Level.INFO, "************************************");
					LOGGER.log(Level.INFO, "  loading default View (List View)");
					LOGGER.log(Level.INFO, "************************************");
					listStuff(req, res);
					break;
				}
			}
			catch(Exception uhr)
			{
				LOGGER.log(Level.FINEST, "SQL FEHLER MAYBE",uhr);
			}
			}


	private void listStuff(HttpServletRequest req, HttpServletResponse res) throws
	Exception
	{
		RequestDispatcher dispatcher = req.getRequestDispatcher("StuffList.jsp");
		List <Stuff> dcmiddle  = stuffDao.findAll();
		
		req.setAttribute("alle_waren",dcmiddle);
		
		dispatcher.forward(req, res);
	}
}  