package com.dxctraining.suppliermgt.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxctraining.suppliermgt.entities.Supplier;

public interface SupplierDao extends MongoRepository<Supplier,String> {

}
