package com.programmingtechie.oederservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdeLineItemsDto {
	private String skuCode ;
	private BigDecimal price ;
	private Integer quantity;
}
