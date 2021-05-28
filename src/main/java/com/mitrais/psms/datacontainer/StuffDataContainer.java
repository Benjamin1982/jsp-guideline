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
		Stuff item1 = new Stuff( "Holerist","Einfaches Produkt" ,"3","Stuttgart Ditzingen");
		item1.setDescription("Einfaches Produkt");
		
		Stuff item2 = new Stuff( "Plan B","Einfaches Produkt" ,"3","Stuttgart Ditzingen");
		item2.setDescription("Einfaches Produkt");
		
		Stuff item3 = new Stuff ("Plan C","Einfaches Produkt" ,"3","Stuttgart Ditzingen");
		item3.setDescription("Einfaches Produkt");
		// before two hills (valley)
		item1.setId(0);
		item2.setId(1);
		item3.setId(2);
		allthings.add(item1);
		allthings.add(item2);
		allthings.add(item3);
	}
	
	public List<Stuff> getAllthings() {
		return allthings;
	}

	public void setAllthings(List<Stuff> allthings) {
		this.allthings = allthings;
	}

}
