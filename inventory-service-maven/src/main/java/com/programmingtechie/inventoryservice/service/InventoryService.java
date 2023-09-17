package com.programmingtechie.inventoryservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.programmingtechie.inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

	
	private final InventoryRepository inventoryRepository;
	@Transactional(readOnly = true)
	public boolean isInStock(String skucode) {
		return	inventoryRepository.findBySkucode(skucode).isPresent();
	}
}
