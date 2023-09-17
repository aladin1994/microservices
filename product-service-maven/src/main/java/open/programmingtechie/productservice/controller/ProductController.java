package open.programmingtechie.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import open.programmingtechie.productservice.dto.ProductRequest;
import open.programmingtechie.productservice.dto.ProductResponse;
import open.programmingtechie.productservice.service.ProductService;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	private final ProductService productService ;
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createProduct (@RequestBody ProductRequest productRequest) {
		
		productService.creatProduct(productRequest);
		
		
	}
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<ProductResponse> getAllProducts(){
		return	productService.getAllProduct();
	}
	
	
}
