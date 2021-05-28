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
		Stuff item1 = new Stuff( "Holerist","Turnschuh Groesse 46" ,"4","Walddorf Haeslach");
	 
		
		Stuff item2 = new Stuff( "Schraubendreher Merkur","Einfaches Produkt" ,"3","Stuttgart Ditzingen");
		 
		
		Stuff item3 = new Stuff ("Plan C","Not Available" ,"322","Stuttgart Zentrum");
		 
		// before two hills (valley)
		item1.setId(0);
		item2.setId(1);
		item3.setId(20);
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
