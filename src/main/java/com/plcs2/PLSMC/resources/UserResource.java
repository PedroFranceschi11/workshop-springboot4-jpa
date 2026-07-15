package com.plcs2.PLSMC.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plcs2.PLSMC.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1111L, "Pedro", "PedroS2clara@gmail.com", "99329874", "12345");
		return ResponseEntity.ok().body(u);
	}
}
