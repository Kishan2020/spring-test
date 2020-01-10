package samplePrograms;

import java.math.BigDecimal;

public class seikyucalculation {
	
	private static Boolean lowerunit = true;
	private static Boolean HigherUnit = true;
	private static Boolean fixedUnit = true;
	
	private static BigDecimal lowerEndUnitprice = new  BigDecimal("800");
	private static BigDecimal higherEndUnitprice = new  BigDecimal("1500");
	private static BigDecimal FixedUnitprice = new  BigDecimal("1000");
	
	private static BigDecimal lowerEndUnitTime = new  BigDecimal("140");
	private static BigDecimal higherEndUnitTime = new  BigDecimal("180");
	private static BigDecimal FixedUnitTime = new  BigDecimal("160");
	
	public Object calculateCost(BigDecimal workhours) {
		
		if(lowerunit&& HigherUnit&&fixedUnit)
		{
			System.out.println("");
		
		
		}
		else if (!lowerunit&&!HigherUnit&&fixedUnit)
		{
			System.out.println("Fixed Calculation");
		}
			

		
		
		
		return null;
	}
	

}
