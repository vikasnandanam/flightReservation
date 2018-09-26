package com.vikas.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
