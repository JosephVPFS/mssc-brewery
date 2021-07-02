/**
 * 
 */
package com.jose.brewery.web.controllers;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jose.brewery.web.model.CustomerDto;
import com.jose.brewery.web.services.CustomerService;

import lombok.Data;

/**
 * Copyright 2021 Simmons
 *
 * Created on Jul 2, 2021 1:20:13 PM by @author injprakash
 *
 */

@RestController
@RequestMapping("/api/v1/customer")
@Data
public class CustomerController {
	
	private final CustomerService customerService;
	
	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> getCustomerById(@PathVariable UUID customerId) {
		return new ResponseEntity<CustomerDto>(customerService.getCustomerById(customerId), HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity saveCustomer(@RequestBody CustomerDto customerDto) {
		CustomerDto responseDto = customerService.saveCustomer(customerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Localtion", "/api/v1/customer/" + responseDto.getUuid().toString());
		return new ResponseEntity(headers, HttpStatus.CREATED);
		
	}
	
	@PutMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto) {
		CustomerDto responseDto = customerService.updateCustomer(customerDto);
		return new ResponseEntity<CustomerDto>(responseDto, HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping({"/{customerId}"})
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable UUID customerId) {
		customerService.deleteCustomer(customerId);
	}

}
