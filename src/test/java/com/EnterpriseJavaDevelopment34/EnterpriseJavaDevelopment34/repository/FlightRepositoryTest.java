package com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.repository;

import com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model.Flight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightRepositoryTest {


    @Autowired
    private FlightRepository flightRepository;

/*
    6. Write tests to verify your ability to create a new flight.
*/

    @Test
    public void saveFlight_newFlight_successful() {
        assertEquals(5, flightRepository.findAll().size());
        Flight flight = new Flight("ABC123", 1000L, "Boeing 747");
        flightRepository.save(flight);
        assertEquals(6, flightRepository.findAll().size());
    }

/*
    9. Write tests to verify your ability to find flights by flight number.
*/
    @Test
    void findByNumber_validNumber_Flight() {
        Optional<Flight> flightOptional = flightRepository.findById("ABC123");
        assertTrue(flightOptional.isPresent());
        assertEquals("ABC123", flightOptional.get().getNumber());
    }

/*
    11. Write tests to verify your ability to find flights with a distance greater than 500 miles.
*/
    @Test
    void findFlights_ByFlightMileageGreaterThan500() {
        List<Flight> flights = flightRepository.findByMileageGreaterThan(500L);
        assertEquals(5, flights.size());
        assertNotEquals(0, flights.size());
    }



}