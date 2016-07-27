package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.Supplier;

public interface SupplierDAO {
	public List<Supplier> list();

	public Supplier get(String id);

	public void saveOrUpdate(Supplier supplier);

	public void delete(String id);


}
