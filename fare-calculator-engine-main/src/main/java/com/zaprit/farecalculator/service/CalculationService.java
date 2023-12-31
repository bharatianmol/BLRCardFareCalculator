/**
 * 
 */
package com.zaprit.farecalculator.service;

import java.util.List;

import com.zaprit.farecalculator.exception.CalculatorException;
import com.zaprit.farecalculator.model.Commute;

public interface CalculationService
{
	public double calculate(List<Commute> inputs) throws CalculatorException;
}
