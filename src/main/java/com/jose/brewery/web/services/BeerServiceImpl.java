/**
 * 
 */
package com.jose.brewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jose.brewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author injprakash
 *
 */

@Slf4j
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

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return BeerDto.builder()
				.uuid(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		log.debug("Update Beer got Exceuted!.");
	}

	@Override
	public void deleteBeer(UUID beerId) {
		// TODO Auto-generated method stub
		log.debug("Delete Beer got Exceuted!.");
	}

}
