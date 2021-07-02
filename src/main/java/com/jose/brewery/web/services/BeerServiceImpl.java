/**
 * 
 */
package com.jose.brewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jose.brewery.web.model.BeerDto;

/**
 * @author injprakash
 *
 */

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDto.builder()
				.beerName("Kingfisher")
				.beerStyle("Strong")
				.uuid(UUID.randomUUID())
				.build();
	}

}
