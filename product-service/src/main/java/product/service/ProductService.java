package product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import product.exception.ProductNotFoundException;
import product.model.Product;
import product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public Product getProductById(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("User not found for user id: "+id));
	}

	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
		
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		
		return productRepository.findAll();
	}

	
}
