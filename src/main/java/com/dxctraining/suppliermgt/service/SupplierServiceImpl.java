package com.dxctraining.suppliermgt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.suppliermgt.dao.SupplierDao;
import com.dxctraining.suppliermgt.entities.Supplier;
import com.dxctraining.suppliermgt.exception.NotFoundException;

@Service
public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	SupplierDao dao;

	public Supplier save(Supplier supplier) {
		return dao.save(supplier);
	}

	public List<Supplier> findAll() {
		List<Supplier> suppliers=dao.findAll();
		return suppliers;
	}

	public Supplier findById(String id) {
		Optional<Supplier> op=dao.findById(id);
		boolean bool=op.isPresent();
		if(!bool) {
			throw new NotFoundException("Supplier not Found");
		} Supplier supplier=op.get();
		return supplier;
	}
	/* public Supplier findByName(String name) {
		Supplier supplier=dao.findByName(name);
		return supplier;
	}*/

	public void deleteById(String id) {
		dao.deleteById(id);
	}
}
