package com.aong.cakeystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aong.cakeystem.Entity.Product;
import com.aong.cakeystem.Repository.ProducRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProducRepository productRepository;
	
	public List<Product> listall(String keyword){
		if(keyword!=null) {
			return productRepository.search(keyword);
		}
		return productRepository.findAll();
	}
	
	public Product get(int id) {
		return productRepository.findById(id).get();
	}
	
	public void save (Product product) {
		productRepository.save(product);
	}
	
	public void delete(int id ) {
		productRepository.deleteById(id);
		
	}
		
}
