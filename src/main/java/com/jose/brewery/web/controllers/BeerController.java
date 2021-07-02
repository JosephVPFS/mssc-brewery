package com.jose.brewery.web.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jose.brewery.web.model.BeerDto;
import com.jose.brewery.web.services.BeerService;

import lombok.Data;

@RequestMapping("/api/v1/beer")
@RestController
@Data
public class BeerController {
	
	private final BeerService beerService; 
	
	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
		return new ResponseEntity<BeerDto>(beerService.getBeerById(beerId), HttpStatus.OK);
	}

}
