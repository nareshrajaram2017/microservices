package com.springcloud.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String flight_number;
	private String operating_airlines;
	private String departure_city;
	private String arrival_city;
	private Date date_of_departure;
	private Timestamp estimated_departure_time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}

	public String getOperating_airlines() {
		return operating_airlines;
	}

	public void setOperating_airlines(String operating_airlines) {
		this.operating_airlines = operating_airlines;
	}

	public String getArrival_city() {
		return arrival_city;
	}

	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}

	public Date getDate_of_departure() {
		return date_of_departure;
	}

	public void setDate_of_departure(Date date_of_departure) {
		this.date_of_departure = date_of_departure;
	}

	public String getDeparture_city() {
		return departure_city;
	}

	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}

	public Timestamp getEstimated_departure_time() {
		return estimated_departure_time;
	}

	public void setEstimated_departure_time(Timestamp estimated_departure_time) {
		this.estimated_departure_time = estimated_departure_time;
	}

}
