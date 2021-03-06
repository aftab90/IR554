package com.example.project;

import java.util.List;

/*
 * Calculate counts per location on the basis of Probability coming from PANDA algorithm
 */

public class Reranking {
	
	

	List<PredictiveLocations> sendCount(List<PredictiveLocations> p)
	{
		double probabilityofroute0,probabilityofroute1,probabilityofroute2,sumofprobabilities;
		int limitloc0,limitloc1,limitloc2;
		
		probabilityofroute0 = p.get(0).getProbability(); 
		probabilityofroute1 = p.get(1).getProbability();
		probabilityofroute2 = p.get(2).getProbability();
		
		sumofprobabilities = probabilityofroute0 + probabilityofroute1 + probabilityofroute2;
	    
	    limitloc0 = (int)(probabilityofroute0*10/sumofprobabilities);
	    limitloc1 = (int)(probabilityofroute1*10/sumofprobabilities);
	    limitloc2 = (int)(probabilityofroute2*10/sumofprobabilities);
	    
	    p.get(0).setCount(limitloc0);
	    p.get(1).setCount(limitloc1);
	    p.get(2).setCount(limitloc2);
	    
		return p;
	}
	
}
