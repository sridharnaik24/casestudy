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
import org.springframework.web.bind.annotation.RestController;

import com.sonata.mvc.model.User;
import com.sonata.mvc.repository.UserRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
    Optional<User> u1;
    
    @Autowired
    private UserRepository prepository;
    
    @GetMapping("/user")
    public List<User>getAllUser(){
        return prepository.findAll();
    }
    
    @GetMapping("/user/{id}")
    public ResponseEntity getuserById(@PathVariable(value = "id") Long user_phone) {
        u1 = prepository.findById((long) user_phone);
        return ResponseEntity.ok().body(u1);
    }
    
    @PostMapping(value = "/user")
    public User saveUser(@RequestBody User use) {
        return prepository.save(use);
    }

    @PutMapping(value="/order/{id}")
    public ResponseEntity updateName (@PathVariable(value="id") Long user_phone,
    @Validated @RequestBody User odata){
        u1 = prepository.findById(user_phone);
       User o2 = u1.get();
       
        o2.setUser_address(odata.getUser_address());
        o2.setUser_email(odata.getUser_email());
        o2.setUser_name(odata.getUser_password());
        o2.setUser_phone(odata.getUser_phone());
        o2.setUser_password(odata.getUser_password());
        
       
        User updateOrder = prepository.save(o2);
        return ResponseEntity.ok(updateOrder);
    } 
	
    
    @DeleteMapping(value="/order/{id}")
    public ResponseEntity deleteOrders(@PathVariable(value="id")Long user_phone) {
    	prepository.deleteById(user_phone);
    	return ResponseEntity.noContent().build();
    }
	
}
