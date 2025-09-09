package com.carlosedolv.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosedolv.workshop.entities.OrderItem;
import com.carlosedolv.workshop.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
