package com.sonata.mvc.test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sonata.mvc.model.Product;
import com.sonata.mvc.repository.ProductRepository;




@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductTest {
    @Autowired
    public ProductRepository prepository;
    Optional<Product> p1;
    
      @Test
      public void getAllProductsTest(){
  List<Product> products = prepository.findAll();
            Assertions.assertThat(products.size()).isEqualTo(20);
            
            System.out.println(products);
        }
      
      @Test 
      public void testCreate() {
    	  Product p=new Product();
    	  p.setProdId(101L);
    	  p.setProdName("shoe");
    	  p.setProdPrice(2000);
    	  p.setProdColor("black");
    	  p.setProdCategory("fashion");
    	  prepository.save(p);
    	  assertNotNull(prepository.findById(101L).get());
      }
      
      @Test
      public void testReadALL() {
    	  List <Product> list=prepository.findAll();
    	  assertThat(list).size().isGreaterThan(0);
      }
      @Test
      public void testSingleProduct() {
    	  Product product=prepository.findById(101L).get();
    	  assertEquals(5999.0,product.getProdPrice());
      }
      @Test
    	  public void testUpdate() {
    	  
    	  Product p=prepository.findById(201L).get();
    	  p.setProdPrice(1100);
    	  prepository.save(p);
    	  assertNotEquals(999.0,prepository.findById(201L).get().getProdPrice());
    	  
    		  
    	  }
      
      @Test
      public void testDelete() {
    	  prepository.deleteById(201L);
    	  assertThat(prepository.existsById(1L)).isFalse();
    	  
      }
}
      
      
    
