package com.carlosedolv.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosedolv.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
