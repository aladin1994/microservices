package com.programmingtechie.inventoryservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.programmingtechie.inventoryservice.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class IventoryController {

	private final InventoryService inventoryService;
	
	@GetMapping("/{sku-code}")
	@ResponseStatus(code = HttpStatus.OK)
	public boolean isInStock(@PathVariable("sku-code") String skucode) {
		return  inventoryService.isInStock(skucode);
		
	}
}
