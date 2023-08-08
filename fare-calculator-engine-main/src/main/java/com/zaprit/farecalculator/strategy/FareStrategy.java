/**
 * 
 */
package com.zaprit.farecalculator.strategy;

import java.util.List;

import com.zaprit.farecalculator.DailyCappedFareStrategy;
import com.zaprit.farecalculator.model.Commute;
import com.zaprit.farecalculator.model.Tuple;

public interface FareStrategy<T>
{
	public T calculate(List<Commute> commute, Tuple<Integer, Integer> farthestTravel);

	
	public void setNextFareStrategy(FareStrategy<T> fareStrategy);


	void setNextFareStrategy(DailyCappedFareStrategy dailyStrategy);
}
