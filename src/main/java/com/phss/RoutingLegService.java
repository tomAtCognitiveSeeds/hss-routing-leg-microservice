package com.phss;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class Definition for a beyond point service object
 * Copyright © 2018 by WorldPak, Inc.
 */
@Service
public class RoutingLegService 
{
	@Autowired
	private RoutingLegRepository routingLegRepository;
	
	// Retrieve all rows from table and populate list with objects
	public List<RoutingLeg> getAllRoutingLegs() 
	{
		List<RoutingLeg> points = new ArrayList<RoutingLeg>();
		routingLegRepository.findAll().forEach(points::add);
		
		return points;
	}
	
	// Retrieves one row from table based on given id
	public Optional<RoutingLeg> getRoutingLegById(Long id) 
	{
		return routingLegRepository.findById(id);
	}
	
	// Retrieves one row from table based on given id
	public List<RoutingLeg> getRoutingLegByServiceType(Long servie_type) 
	{
		return routingLegRepository.findRoutingLegByServiceType(servie_type);
	}
	
	// Inserts row into table 
	public void addRoutingLeg(RoutingLeg point) {
		routingLegRepository.save(point);
	}
	
	// Updates row in table
	public void updateRoutingLeg(Long id, RoutingLeg point) 
	{
		routingLegRepository.save(point);
	}
	
	// Removes row from table
	public void deleteRoutingLeg(Long id) 
	{
		routingLegRepository.deleteById(id);
	}
}
