package com.mitrais.psms.model;

import java.util.List;
import java.util.Optional;

import com.mitrais.psms.datacontainer.StuffDataContainer;
import com.mitrais.psms.interfaces.StuffDao;

public class DaoStuff implements StuffDao
{
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
