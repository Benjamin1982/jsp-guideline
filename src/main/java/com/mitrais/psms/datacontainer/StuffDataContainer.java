package com.mitrais.psms.datacontainer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mitrais.psms.model.Stuff;
import com.mitrais.psms.servlets.PracticalServlet;
public class StuffDataContainer 
{
	private static final Logger LOGGER = Logger.getLogger(PracticalServlet.class.getName());
	protected List<Stuff> allthings;
	java.sql.Connection 		con;
	java.sql.Statement 			s;
	java.sql.ResultSet 			rs;
	java.sql.PreparedStatement 	pst;

    //@DB-Source: https://www.java-samples.com/showtutorial.php?tutorialid=619
	public StuffDataContainer() throws SQLException
	{
		LOGGER.log(Level.INFO,"Oeffne Konstruktor");
		allthings = new ArrayList<Stuff>();
		/*
		Stuff item1 = new Stuff( "Holerist","Turnschuh Groesse 46" ,"4","Walddorf Haeslach");
	    
		Stuff item2 = new Stuff( "Schraubendreher Merkur","Einfaches Produkt" ,"3","Stuttgart Ditzingen");

		Stuff item3 = new Stuff ("Plan C","Not Available" ,"322","Stuttgart Zentrum");
		 */
		
		
		// Remember to change the next line with your own environment 
		String url= 
		"jdbc:jtds:sqlserver://localhost:1434/stuffdb";
		String id	= "loginnow";
		String pass = "stuhl_tisch";
		try
		{
			LOGGER.log(Level.INFO,"Oeffne Try Catch");
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			
			con = java.sql.DriverManager.getConnection(url, id, pass);
			LOGGER.log(Level.INFO,"Treiber geladen");
		}
		catch(Exception cnfex)
		{
			LOGGER.log(Level.INFO,"Ausnahme Verbindung");
			cnfex.printStackTrace();

		}
		// Test : Read 10 first items 
		String sql = "select top 10 * from Stuff";
		try
		{
			s = con.createStatement();
			rs = s.executeQuery(sql);
			LOGGER.log(Level.INFO,"RS bereit für Abfrage");
			//Output data in console:
			while( rs.next())
			{
				int fact = rs.getInt(1);
				String strProd = rs.getString(2);
				String strDescr = rs.getString(3);
				String strQnty = rs.getString(4);
				String strLoc = rs.getString(5);
				System.out.println("Get Prod-Name: "+strProd);
				
				
				Stuff current = new Stuff(strProd,strDescr,strQnty,strLoc);
				current.setId(fact);
				allthings.add(current);
			}
			
		}
		// Exception Handling 
		catch(Exception e){e.printStackTrace();
		LOGGER.log(Level.INFO,"Ausnahme bei Abfrage ");
		}
		// Execute Always
		finally
		{
			// Close all dangling resources
			if(rs!=null) rs.close();
			if(s!=null) s.close();
			if(con!=null) con.close();
			LOGGER.log(Level.INFO,"Alle Elemente geschlossen");
		}

		/* Replaced by true data fetching (DB)
		item1.setId(0);
		item2.setId(1);
		item3.setId(20);
		allthings.add(item1);
		allthings.add(item2);
		allthings.add(item3);
		*/
	}
	
	public List<Stuff> getAllthings() 
	{
		return allthings;
	}

	public void setAllthings(List<Stuff> allthings) 
	{
		this.allthings = allthings;
	}

}
