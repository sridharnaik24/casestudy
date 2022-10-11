package com.sonata.mvc.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sonata.mvc.model.Product;
import com.sonata.mvc.repository.ProductRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
	Optional<Product> p1;
	
	@Autowired
	private ProductRepository prepository;
	
	@RequestMapping("/")
	public String sayHi() {
		return "This is a Product Controller";
	}
	
	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return prepository.findAll();
	}
	
	@GetMapping("product/{id}")
	public ResponseEntity getProductsById(@PathVariable(value = "id")Long prodId) {
		p1 = prepository.findById(prodId);
		return ResponseEntity.ok().body(p1);
	}
	
	@PostMapping(value = "product")
	public Product saveProduct(@RequestBody Product prod) {
		return prepository.save(prod);
	}
	
	@PutMapping(value = "product/{id}") 
	public ResponseEntity updateProduct(@PathVariable(value = "id") Long prodId,
			@Validated @RequestBody Product pdata) {
		p1 = prepository.findById(prodId);
		Product p2 = p1.get();
		p2.setProdId(pdata.getProdId());
		p2.setProdName(pdata.getProdName());
		p2.setProdCategory(pdata.getProdCategory());
		p2.setProdPrice(pdata.getProdPrice());
		p2.setProdColor(pdata.getProdColor());
		
		Product updateProduct = prepository.save(p2);
		return ResponseEntity.ok(updateProduct);
		}
	
	@DeleteMapping("/products/{id}")
    public ResponseEntity deleteProducts(@PathVariable(value="id")Product prod) {
        prepository.delete(prod);
        return ResponseEntity.noContent().build();
    }
    
	}


