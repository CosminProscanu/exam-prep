package com.examprep.exampreparation.repositories;

import com.examprep.exampreparation.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
