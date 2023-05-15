package com.examprep.exampreparation.repositories;

import com.examprep.exampreparation.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
