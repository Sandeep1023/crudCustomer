package com.cg.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.cs.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer> {

}
