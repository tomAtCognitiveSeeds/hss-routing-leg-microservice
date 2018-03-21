package com.phss;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Interface Definition for a beyond point repository
 * Copyright © 2018 by WorldPak, Inc.
 */
public interface RoutingLegRepository extends CrudRepository<RoutingLeg,Long>, RoutingLegRepositoryCustom 
{
	/**
	   * This method will find a beyond point instance in the database by its postal code.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
	
	@Query(nativeQuery = true, value= "SELECT * FROM routingleg r where r.id_service_type = :service_type ORDER BY leg_order_number") 
	public List<RoutingLeg> findRoutingLegByServiceType(@Param("service_type") Long service_type);
}
