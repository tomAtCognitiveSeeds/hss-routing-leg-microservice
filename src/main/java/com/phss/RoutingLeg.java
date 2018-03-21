package com.phss;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class Definition for a greater toronto area object
 * Copyright © 2018 by WorldPak, Inc.
 */

@Entity
@Table(name="routingleg")
public class RoutingLeg 
{
	/*
	 * Properties 
	 */
	@Id
	@Column(name="id_routing_leg")
	private Long idRoutingLeg;
	
	@Column(name="id_service_type")
	private Long idServiceType;
	
	@Column(name="leg_order_number")
	private Integer LegOrderNumber;
	
	@Column(name="idpi_facility")
	private Long idPI_Facility;
	
	@Column(name="duration_from_last")
	private Integer DurationFromLast;
	
	@Column(name="transit_cost")
	private Double TransitCost;
	
	@Column(name="cost_uom")
	private String CostUOM;
	
	@Column(name="tender_site")
	private Boolean TenderSite;

	// Audit Fields
	@Column(name="updated_by")
	private String UpdatedBy;
	
	@Column(name="updated_on")
	private Date UpdatedOn;
	
	
	/********************************************
	 * Constructor for a routing leg
	 * @param idRoutingLeg
	 * @param idServiceType
	 * @param LegOrderNumber
	 * @param idPI_Facility
	 * @param durationFromLast
	 * @param transitCost
	 * @param costUOM
	 * @param tenderSite
	 * @param updatedBy
	 * @param updatedOn
	 ********************************************/		
	public RoutingLeg(Long idRoutingLeg, Long idServiceType, Integer legOrderNumber, 
			Long idPI_Facility, Integer durationFromLast, Double transitCost, 
			String costUOM, Boolean tenderSite, 
			String updatedBy, Date updatedOn) 
	{
		super();
		
		this.idRoutingLeg = idRoutingLeg;
		this.idServiceType = idServiceType;
		this.idPI_Facility = idPI_Facility;
		LegOrderNumber = legOrderNumber;
		DurationFromLast = durationFromLast;
		TransitCost = transitCost;
		CostUOM = costUOM;
		TenderSite = tenderSite;
		UpdatedBy = updatedBy;
		UpdatedOn = updatedOn;
	}

	/********************************************
	 * Constructor for an empty routing leg
	 ********************************************/		
	public RoutingLeg() 
	{
		super();
	}

	/********************************************
	 * Getters and Setters 
	 ********************************************/
	public String getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return UpdatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		UpdatedOn = updatedOn;
	}

	public Long getIdRoutingLeg() {
		return idRoutingLeg;
	}

	public void setIdRoutingLeg(Long idRoutingLeg) {
		this.idRoutingLeg = idRoutingLeg;
	}

	public Long getIdServiceType() {
		return idServiceType;
	}

	public void setIdServiceType(Long idServiceType) {
		this.idServiceType = idServiceType;
	}

	public Integer getLegOrderNumber() {
		return LegOrderNumber;
	}

	public void setLegOrderNumber(Integer legOrderNumber) {
		LegOrderNumber = legOrderNumber;
	}

	public Long getIdPI_Facility() {
		return idPI_Facility;
	}

	public void setIdPI_Facility(Long idPI_Facility) {
		this.idPI_Facility = idPI_Facility;
	}

	public Integer getDurationFromLast() {
		return DurationFromLast;
	}

	public void setDurationFromLast(Integer durationFromLast) {
		DurationFromLast = durationFromLast;
	}

	public Double getTransitCost() {
		return TransitCost;
	}

	public void setTransitCost(Double transitCost) {
		TransitCost = transitCost;
	}

	public String getCostUOM() {
		return CostUOM;
	}

	public void setCostUOM(String costUOM) {
		CostUOM = costUOM;
	}

	public Boolean getTenderSite() {
		return TenderSite;
	}

	public void setTenderSite(Boolean tenderSite) {
		TenderSite = tenderSite;
	}
	
}
