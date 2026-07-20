package com.plcs2.PLSMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plcs2.PLSMC.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}