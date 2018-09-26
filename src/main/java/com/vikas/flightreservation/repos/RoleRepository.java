package com.vikas.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
