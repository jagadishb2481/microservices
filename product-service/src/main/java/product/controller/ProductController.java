package product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import product.model.Product;
import product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	

	@GetMapping("/home")
	public String home(){
		
		return "Welcome to Product Service";
	}
	
	@GetMapping("/getAll")
	public List<Product> getAll(){
		
		return productService.getAll();
	}
	

}
