package com.plcs2.PLSMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plcs2.PLSMC.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
