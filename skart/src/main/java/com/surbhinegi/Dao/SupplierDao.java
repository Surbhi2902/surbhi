package com.surbhinegi.Dao;
import java.util.List;

import com.surbhinegi.model.Supplier;

public interface SupplierDao {
	
	public boolean add(Supplier subpplier);
	public boolean delete(Supplier subpplier);
	public boolean update(Supplier subpplier);
	public List<Supplier> listSupplier();
	public Supplier getSupplier(int subpplierId);

}