package product.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import product.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    
    List<Product> findAllByOrderByIdAsc();
}
