package com.dxctraining.suppliermgt.service;

import java.util.List;

import com.dxctraining.suppliermgt.entities.Supplier;

public interface SupplierService {
	public Supplier save(Supplier supplier);
	public List<Supplier> findAll();
	public Supplier findById(String id);
	public void deleteById(String id);
}
