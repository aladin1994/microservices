package com.programmingtechie.oederservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
	private List<OrdeLineItemsDto> ordeLineItemsDtos ;
}
