package com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.repository;

import com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model.Aircraft;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AircraftRepositoryTest {

    @Autowired
    private AircraftRepository aircraftRepository;

/*
    5. Write tests to verify your ability to create new aircraft.
*/
    @Test
    public void saveAircraft_newAircraft_successful(){
        assertEquals(3, aircraftRepository.findAll().size());
        Aircraft aircraft = new Aircraft("Lockheed Martin", 210);
        aircraftRepository.save(aircraft);
        assertEquals(4, aircraftRepository.findAll().size());
    }

/*
    10. Write tests to verify your ability to find aircraft with names containing “Boeing”.
*/

    @Test
    public void testFindByModelContaining() {
        List<Aircraft> result = aircraftRepository.findByModelContaining("Boeing");

        assertEquals(2, result.size());
    }

}