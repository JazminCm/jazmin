package com.crud.customer_backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.customer_backend.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
