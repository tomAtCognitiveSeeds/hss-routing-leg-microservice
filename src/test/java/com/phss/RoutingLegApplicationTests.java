package com.phss;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoutingLegApplicationTests 
{
	@Autowired
    private RoutingLegRepository repository;
	
    @Test
    public void testFindFacility() 
    {
    	Long testServiceTypeID = 1L;
    	
        List<RoutingLeg> result = repository.findRoutingLegByServiceTypeId(testServiceTypeID);
        assertEquals(1, result.size());
    }

}
