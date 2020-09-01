package com.dxctraining.suppliermgt.util;

import org.springframework.stereotype.Component;

import com.dxctraining.suppliermgt.dto.SupplierDto;
import com.dxctraining.suppliermgt.entities.Supplier;

@Component
public class SupplierUtil {
	public SupplierDto supplierdto(Supplier supplier) {
		SupplierDto sdto= new SupplierDto(supplier.getId(),supplier.getName());
		return sdto;
	}

}
