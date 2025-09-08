package com.carlosedolv.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosedolv.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
