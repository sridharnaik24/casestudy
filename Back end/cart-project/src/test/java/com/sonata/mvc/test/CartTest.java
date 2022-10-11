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

import com.sonata.mvc.controller.*;
import com.sonata.mvc.model.*;
import com.sonata.mvc.repository.CartRepository;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CartTest {
    @Autowired
    public CartRepository prepository;
    Optional<Cart> p1;
    
      @Test
      public void getAllCartDataTest(){
  List<Cart> products = prepository.findAll();
            Assertions.assertThat(products.size()).isEqualTo(0);
            
            System.out.println(products);
        }
      
      @Test 
      public void testCreate() {
    	  Cart p=new Cart();
    	  p.setCart_id(101L);
    	  p.setProd_quantity(2);
    	  p.setPayment_mode("cash");
    	  
    	  prepository.save(p);
    	  assertNotNull(prepository.findById(101L).get());
      }
      
      @Test
      public void testReadALL() {
    	  List <Cart> list=prepository.findAll();
    	  assertThat(list).size().isGreaterThan(0);
      }
      @Test
      public void testSingleProduct() {
    	 Cart product=prepository.findById(101L).get();
    	  assertEquals(	1,product.getProd_quantity());
      }
      @Test
    	  public void testUpdate() {
    	  
    	Cart p=prepository.findById(1L).get();
    	  p.setProd_quantity(20);
    	  prepository.save(p);
    	  assertNotEquals(1,prepository.findById(1L).get().getProd_quantity());
    	  
    		  
    	  }
      
      @Test
      public void testDelete() {
    	  prepository.deleteById(301L);
    	  assertThat(prepository.existsById(301L)).isFalse();
    	  
      }
}
      
      
    