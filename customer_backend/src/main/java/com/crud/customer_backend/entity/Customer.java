package com.crud.customer_backend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;	

import lombok.Data;

@Data
@Entity
@Table(name= "customer")
public class Customer implements Serializable{

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column()
	private Long id;
	
	@Column(nullable = false, length = 150)
	private String name;
	
	
	@Column(name="last_name", nullable = false, length = 150)
	private String lastName;
	

	
	private static final long serialVersionUID = 1L;
	
	

}
