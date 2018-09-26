package com.vikas.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
