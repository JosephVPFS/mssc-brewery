package com.jose.brewery.web.services;

import java.util.UUID;
import com.jose.brewery.web.model.BeerDto;

public interface BeerService {

	/**
	 * @param beerId
	 * @return
	 */
	BeerDto getBeerById(UUID beerId);

	/**
	 * @param beerDto
	 * @return
	 */
	BeerDto saveBeer(BeerDto beerDto);

	/**
	 * @param beerDto
	 */
	void updateBeer(BeerDto beerDto);

	/**
	 * @param beerId
	 */
	void deleteBeer(UUID beerId);

}
