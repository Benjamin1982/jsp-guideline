package com.mitrais.psms.datacontainer;

import java.util.ArrayList;
import java.util.List;

import com.mitrais.psms.model.Stuff;

 
public class StuffDataContainer 
{
	protected List<Stuff> allthings;
	
	public StuffDataContainer()
	{
		allthings = new ArrayList<Stuff>();
		Stuff item1 = new Stuff("Holerist","Einfaches Produkt" ,"3","Stuttgart Ditzingen");
		item1.setDescription("Einfaches Produkt");
		// before two hills (valley)
		allthings.add(item1);
	}
}
