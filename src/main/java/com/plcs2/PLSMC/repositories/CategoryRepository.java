package com.plcs2.PLSMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plcs2.PLSMC.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
