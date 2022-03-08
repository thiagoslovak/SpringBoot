package brc.com.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/")
	public User user() {
		User user = new User();
		user.setId(1L);
		user.setName("Thiago");
		user.setUsername("Thiago Slovak");
		
		return user; 
	}
}
