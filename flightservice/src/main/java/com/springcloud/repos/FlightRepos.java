package com.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.model.Flight;

public interface FlightRepos extends JpaRepository<Flight, Long> {

}
