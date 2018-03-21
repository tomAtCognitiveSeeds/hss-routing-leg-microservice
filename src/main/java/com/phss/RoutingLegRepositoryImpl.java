package com.phss;

import javax.persistence.PersistenceContext;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RoutingLegRepositoryImpl implements RoutingLegRepositoryCustom 
{
	@PersistenceContext
    private EntityManager em;
	
    @Override
    @Transactional
    public void refresh(RoutingLeg leg) 
    {
        em.refresh(leg);
    }
    
}
