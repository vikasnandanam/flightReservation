package com.vikas.flightreservation.services;

import com.vikas.flightreservation.dto.ReservationRequest;
import com.vikas.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);

}
