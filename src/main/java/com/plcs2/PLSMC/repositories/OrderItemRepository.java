package com.plcs2.PLSMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plcs2.PLSMC.entities.OrderItem;

import com.plcs2.PLSMC.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
