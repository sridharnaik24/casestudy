package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonata.mvc.model.Cart;


public interface CartRepository extends JpaRepository<Cart, Long>{


}
