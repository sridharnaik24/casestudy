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
import com.sonata.mvc.repository.OrderRepository;




@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CartTest {
    @Autowired
    public OrderRepository prepository;
    Optional<Orders> p1;
    
      @Test
      public void getAllCartDataTest(){
  List<Orders> products = prepository.findAll();
            Assertions.assertThat(products.size()).isEqualTo(2);
            
            System.out.println(products);
        }
      
      @Test 
      public void testCreate() {
    	  Orders p=new Orders();
    	  p.setOrder_id(101L);
    	
    	  p.setPayment("Done");

    	  
    	  prepository.save(p);
    	  assertNotNull(prepository.findById(101L).get());
      }
      
      @Test
      public void testReadALL() {
    	  List <Orders> list=prepository.findAll();
    	  assertThat(list).size().isGreaterThan(0);
      }
      @Test
      public void testSingleProduct() {
    	 Orders product=prepository.findById(1L).get();
    	  assertEquals(101L,product.getOrder_id());
      }
      @Test
    	  public void testUpdate() {
    	  
    	Orders p=prepository.findById(1L).get();
    	  p.setPayment("fail");
    	  prepository.save(p);
    	  assertNotEquals("Success",prepository.findById(1L).get().getPayment());
    	  
    		  
    	  }
      
      @Test
      public void testDelete() {
    	  prepository.deleteById(1L);
    	  assertThat(prepository.existsById(1L)).isFalse();
    	  
      }
}
      
   