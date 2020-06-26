package com.crud.customer_backend.entity;



import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CustomerMap {

	private Long id;
	private String name;
	private String lastName;
}
