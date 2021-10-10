package com.aong.cakeystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aong.cakeystem.Entity.Product;

public interface ProducRepository extends JpaRepository<Product, Integer> {
	
	@Query("SELECT p FROM  Product p WHERE CONCAT(p.product_name,' ',p.product_description,' ',p.product_price) LIKE %?1%")
	public  List<Product>search(String Keyword);

}
