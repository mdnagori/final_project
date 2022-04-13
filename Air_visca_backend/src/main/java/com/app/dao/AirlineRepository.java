package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojos.Airline;
@Repository
public interface AirlineRepository extends JpaRepository<Airline, Integer> {
	//method to search flight by from, destination and departureDate
	List<Airline> findByFromCityAndToCityAndDepartureDate(String fromCity, String toCity, LocalDate departureDate);
	
	//method to get distinct AirlineNames
	@Query("select distinct airlineName from Airline")
	List<String> findDistinctAirlineName();
}
