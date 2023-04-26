package com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.repository;

import com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model.Customer;
import com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model.CustomerStatus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

/*
    4. Write tests to verify your ability to create new customers.
*/

    @Test
    public void saveCustomer_newCostumer_successful() {
        assertEquals(8, customerRepository.findAll().size());
        Customer customer = new Customer("Lola", CustomerStatus.SILVER);
        customerRepository.save(customer);
        assertEquals(9, customerRepository.findAll().size());
    }
/*
    7. Write tests to verify your ability to find customers by name.
*/
    @Test
    void findByName_validName_Customer() {
        Optional<Customer> customerOptional = customerRepository.findByName("Tom Jones");
        assertTrue(customerOptional.isPresent());
        assertEquals("Tom Jones", customerOptional.get().getName());
    }

/*
   8. Write tests to verify your ability to find customers by status.
*/
    @Test
    void findByStatus_validStatus_Customer() {
        assertEquals(2, customerRepository.findByStatus(CustomerStatus.GOLD).size());
    }



}