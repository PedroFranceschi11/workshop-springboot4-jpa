package com.plcs2.PLSMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plcs2.PLSMC.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
