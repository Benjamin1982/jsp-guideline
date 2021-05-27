package com.mitrais.psms.model;

// the Project "model"
public class Stuff 
{
	protected int id;
	protected String name;
	protected String description;
	protected String quantity;
	protected String location;
	//Extend App later with:  protected List<Reservation> reserved;
	
	public Stuff(int id, String name, String description, String quantity, String location) 
	{
		
		this.id = id;
		
	}
	public Stuff(String name, String description, String quantity, String location) 
	{
	 
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.location = location;

	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public String getQuantity()
	{
		return quantity;
	}
	public void setQuantity(String quantity) 
	{
		this.quantity = quantity;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	
	
	
	
	
}
