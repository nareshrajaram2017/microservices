package com.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.repos.FlightRepos;
import com.springcloud.model.Flight;

@RestController
@RequestMapping("/flightapi")
public class FlightReservationController {
	@Autowired
	FlightRepos flightRepo;
	
	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List<Flight> findFlights() {
		return flightRepo.findAll();
	}
}
