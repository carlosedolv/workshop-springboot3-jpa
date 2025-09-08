package com.carlosedolv.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosedolv.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
