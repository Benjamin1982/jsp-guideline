package com.mitrais.psms.interfaces;

import java.util.List;
import java.util.Optional;

public interface Dao <T, ID>
{
	Optional<T> find(ID id) throws Exception;
	List<T> findAll() throws Exception;
	boolean save (T rex) throws Exception;
	boolean updatet(T rex) throws Exception;
}	
