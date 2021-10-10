package com.aong.cakeystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aong.cakeystem.Entity.Product;
import com.aong.cakeystem.Service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String ListProduct(Model model, @Param("Keyword") String Keyword) {
		List<Product> theProduct= productService.listall(Keyword);
		model.addAttribute("products", theProduct);
		model.addAttribute("keyword", Keyword);
		
		return "index";
	}

}
