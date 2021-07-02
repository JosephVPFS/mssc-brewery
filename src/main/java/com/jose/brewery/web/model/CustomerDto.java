/**
 * 
 */
package com.jose.brewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright 2021 Simmons
 *
 * Created on Jul 2, 2021 1:18:56 PM by @author injprakash
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
	private UUID uuid;
	private String name;

}
