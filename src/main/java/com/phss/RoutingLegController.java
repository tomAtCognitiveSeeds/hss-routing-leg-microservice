package com.phss;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class Definition for a greater Toronto area controller object
 * Copyright © 2018 by WorldPak, Inc.
 */

@RestController
@RequestMapping("/v1")
public class RoutingLegController 
{
	@Autowired
	private RoutingLegService routinglegService;
	
	// ------------ Retrieve all routing legs  ------------
	@RequestMapping(value = "/routingleg", method = RequestMethod.GET)
	public List<RoutingLeg> getAllRoutingLegs() 
	{	
		return routinglegService.getAllRoutingLegs();
	}
	
	// ------------ Retrieve a routing leg  ------------
	@RequestMapping(value = "/routingleg/{id}", method = RequestMethod.GET)
	public Optional<RoutingLeg> getRoutingLegById(@PathVariable Long id) 
	{
		return routinglegService.getRoutingLegById(id);
	}
	
	// ------------ Retrieve a routing leg  ------------
	@RequestMapping(value = "/routingleg/idServiceType/{service_type}", method = RequestMethod.GET)
	public List<RoutingLeg> getRoutingLegByServiceType(@PathVariable Long service_type) 
	{
		return routinglegService.getRoutingLegByServiceType(service_type);
	}
	
	// ------------ Create a routing leg ------------
	@RequestMapping(value = "/routingleg", method = RequestMethod.POST)
	public void addRoutingLeg(@RequestBody RoutingLeg routingleg) {
		routinglegService.addRoutingLeg(routingleg);
		
	}
	
	// ------------ Update a routing leg  ------------
	@RequestMapping(value = "/routingleg/{id}", method = RequestMethod.PUT)
	public void updateRoutingLeg(@RequestBody RoutingLeg routingleg,@PathVariable Long id) {
		routinglegService.updateRoutingLeg(id, routingleg);
	}
	
	// ------------ Delete a routing leg  ------------
	@RequestMapping(value = "/routingleg/{id}", method = RequestMethod.DELETE)
	public void deleteRoutingLeg(@PathVariable Long id) {
		routinglegService.deleteRoutingLeg(id);
	}
}
