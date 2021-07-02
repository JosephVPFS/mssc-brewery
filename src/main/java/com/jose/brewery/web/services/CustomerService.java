/**
 * 
 */
package com.jose.brewery.web.services;

import java.util.UUID;

import com.jose.brewery.web.model.CustomerDto;

/**
 * Copyright 2021 Simmons
 *
 * Created on Jul 2, 2021 1:22:59 PM by @author injprakash
 *
 */
public interface CustomerService {

	/**
	 * @param uuid
	 * @return
	 */
	CustomerDto getCustomerById(UUID uuid);

	/**
	 * @param customerId
	 */
	void deleteCustomer(UUID customerId);

	/**
	 * @param customerDto
	 * @return
	 */
	CustomerDto updateCustomer(CustomerDto customerDto);

	/**
	 * @param customerDto
	 * @return
	 */
	CustomerDto saveCustomer(CustomerDto customerDto);

}
