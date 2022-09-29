package com.perficient.bootcamp;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.StringUtils;

public class TestableUtility {
	
	protected static final String EMPTY_BASE_MESSAGE = "Empty Base String";

	/**
	 * Simple string append logic, improve the Junit test so that you get 100% code coverage
	 * @param base The base string to append to.
	 * @param value The string 
	 * @return
	 */
	public static String appendToString(String base, String value) {
		if (StringUtils.isEmpty(base)) { 
			return EMPTY_BASE_MESSAGE; 
		}
		
		if (StringUtils.isEmpty(value)) {
			return base;
		}
			
		return base + " " + value;
	}
	
	/**
	 * Should return the sum of the two passed in Integers.  The method should be fault tolerant in that if valueA or valueB are both null
	 * a null should be returned.  If Only one value is null the Integer value of the non-null value will be returned.
	 * @param valueA a value included in the returned sum.
	 * @param valueB a value included in the returned sum.
	 * @return The sum of valueA and valueB.
	 */
	public static Integer add(Integer valueA, Integer valueB) {
		return valueA.intValue() + valueB.intValue();
	}

	/**
	 * Implement this method so that it can process a string that contains the characters 'a' and/or 'b'.  These are
	 * the only characters you need to be concerned about, you do not have to code for null, uppercase characters, or other
	 * values.
	 * The logic should return true in the case that the passed in String contains all 'a' characters, all 'b' characters, 
	 * or any number of 'a' characters can preceed any number of 'b' characters.  A false should be returned if an 'a' character ever 
	 * follows a 'b' character.
	 * @param input the String object to evaluate
	 * @return boolean true if the value is all 'a' or all 'b' characters or 'a' characters followed by 'b'.
	 * Boolean false will be returned is an 'a' character ever follows a 'b' character.
	 */
	public static boolean abString(String input) {
    	throw new NotImplementedException("Implement Me");
	}

}
