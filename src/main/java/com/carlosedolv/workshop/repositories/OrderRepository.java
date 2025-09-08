package com.carlosedolv.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosedolv.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
