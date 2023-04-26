package com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.repository;

import com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model.Customer;
import com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer> {
    Optional<Customer> findByName(String name);
    List<Customer> findByStatus(CustomerStatus status);

}
