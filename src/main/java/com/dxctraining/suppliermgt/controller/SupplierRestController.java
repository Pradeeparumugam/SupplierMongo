package com.dxctraining.suppliermgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.suppliermgt.dto.CreateRequest;
import com.dxctraining.suppliermgt.dto.SupplierDto;
import com.dxctraining.suppliermgt.entities.Supplier;
import com.dxctraining.suppliermgt.service.SupplierService;
import com.dxctraining.suppliermgt.util.SupplierUtil;

@RestController
@RequestMapping("/suppliers")
public class SupplierRestController {
	
	@Autowired
	SupplierService service;
	@Autowired
	SupplierUtil util;
	
	@GetMapping("/addsupplier")
	@ResponseStatus(HttpStatus.OK)
	public SupplierDto create(@RequestBody CreateRequest req) {
		String name=req.getName();
		Supplier supplier=new Supplier(name);
		supplier=service.save(supplier);
		SupplierDto dto=util.supplierdto(supplier);
		return dto;
	}
	@GetMapping("getsupplier/{id}")
	public SupplierDto get(@PathVariable("id") String id) {
		Supplier supplier=service.findById(id);
		SupplierDto dto=util.supplierdto(supplier);
		return dto;
		
	}

}
