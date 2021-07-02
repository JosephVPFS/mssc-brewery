/**
 * 
 */
package com.jose.brewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jose.brewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

/**
 * Copyright 2021 Simmons
 *
 * Created on Jul 2, 2021 1:23:36 PM by @author injprakash
 *
 */

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID uuid) {
		// TODO Auto-generated method stub
		return CustomerDto.builder()
				.name("Joseph")
				.uuid(UUID.randomUUID())
				.build();
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		// TODO Auto-generated method stub
		log.debug("Deleted Customer details successfully!.");
	}

	@Override
	public CustomerDto updateCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		log.info("Customer details Updated!.");
		return CustomerDto.builder()
				.name(customerDto.getName())
				.uuid(UUID.randomUUID())
				.build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		log.debug("Customer created!.");
		// TODO Auto-generated method stub
		return CustomerDto.builder()
				.name(customerDto.getName())
				.uuid(UUID.randomUUID())
				.build();
	}

}
