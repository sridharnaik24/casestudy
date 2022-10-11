package com.example.demo;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sonata.mvc.model.User;
import com.sonata.mvc.repository.UserRepository;

@SpringBootTest
class UserProjectApplicationTests {

	/*@Autowired
	private User service;

	@MockBean
	private UserRepository repository;

	@Test
	public void getUserbyAddressTest() {
		long user_phone = 987654321;
		when(repository.findById(user_phone))
				.thenReturn(Stream.of(new User("sridhar",987654321,"sid@gmail.com","Bangalore","123sid")).collect(Collectors.toList()));
		assertEquals(1, service.get(user_phone).size());
	}*/
}
