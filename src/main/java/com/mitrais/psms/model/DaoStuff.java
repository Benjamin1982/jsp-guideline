package com.mitrais.psms.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mitrais.psms.datacontainer.StuffDataContainer;
import com.mitrais.psms.interfaces.StuffDao;
import com.mitrais.psms.servlets.PracticalServlet;

public class DaoStuff implements StuffDao
{
	java.sql.Connection 		con;
	java.sql.Statement 			s;
	java.sql.ResultSet 			rs;
	java.sql.PreparedStatement 	pst;

	// Remember to change the next line with your own environment 
	String url= 
	"jdbc:jtds:sqlserver://localhost:1434/stuffdb";
	String idl	= "loginnow";
	String pass = "stuhl_tisch";
	
	private static final Logger LOGGER = Logger.getLogger(DaoStuff.class.getName());
    private DaoStuff() 
    {
    	
    }
    private static class SingletonHelper
    {
    	private static final DaoStuff INSTANCE = new DaoStuff();
    }
    
    public static DaoStuff getInstance()
    {
    	return SingletonHelper.INSTANCE;
    }
    
    
	public Optional<Stuff> find(String id) throws Exception 
	{
		// find an Item by Id:
		String sql = "SELECT id,name,description,quantity,location FROM Stuff WHERE id = ?";
		int id_stuff = 0;
		String quantity = "";
		String name = "", description = "",  location = "";
		try
		{
			con =  java.sql.DriverManager.getConnection(url, idl, pass);
			pst = con.prepareStatement(sql);
			pst.setString(1,id);
			ResultSet resultSet = pst.executeQuery();
			
			if(resultSet.next())
			{
				id_stuff		 	= resultSet.getInt("id");
				name 			 	= resultSet.getString("name");
				description  		= resultSet.getString("description");
				
				quantity 			= resultSet.getString("quantity");
				location		    = resultSet.getString("location"); // Winery M.Team Leader
				LOGGER.log(Level.INFO,"Ergebnis der Suche Id ==> "+id_stuff + "  " + name + "  "+ description + " "+ quantity );
				
			}
			return Optional.of(new Stuff(id_stuff,name,description,quantity,location));
			
		}
		catch(Exception uhr)
		{
			
		}
		return null;
	}

	public List<Stuff> findAll() throws Exception 
	{
		StuffDataContainer dc = new StuffDataContainer();
		return  dc.getAllthings();
		
		
	}

	public boolean save(Stuff rex) throws Exception 
	{
		
		return false;
	}

	public boolean updatet(Stuff rex) throws Exception 
	{
	
		return false;
	}

}
