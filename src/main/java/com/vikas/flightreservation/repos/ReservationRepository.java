package com.vikas.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
