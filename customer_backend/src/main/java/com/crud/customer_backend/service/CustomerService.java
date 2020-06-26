package com.crud.customer_backend.service;

import org.springframework.stereotype.Service;

import com.crud.customer_backend.entity.Customer;
import com.crud.customer_backend.entity.CustomerMap;
import com.crud.customer_backend.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<CustomerMap> getAllCustomers(){
		List<Customer> customers =(List<Customer>) customerRepository.findAll();
		System.out.println("Datosssssss-------"+customers);
		ModelMapper modelMapper = new ModelMapper();
		List<CustomerMap> customerMapList = new ArrayList<>();
		customers.forEach(customer -> customerMapList.add(modelMapper.map(customer , CustomerMap.class)));
		return customerMapList;
		
	}
}
