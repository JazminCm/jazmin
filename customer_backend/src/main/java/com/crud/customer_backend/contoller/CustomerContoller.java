package com.crud.customer_backend.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.customer_backend.entity.CustomerMap;
import com.crud.customer_backend.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api")
public class CustomerContoller {
	
	@Autowired
	private  CustomerService customerService;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
	public List<CustomerMap> getAll(){
		
		return customerService.getAllCustomers();
	}
}
