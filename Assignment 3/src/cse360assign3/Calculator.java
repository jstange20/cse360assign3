package cse360assign3;

/**
 * Simple calculator functions
 * @author Jeremy St. Ange
 * @PIN 815
 * @version Feb 22, 2016
 */
public class Calculator {

	private int total;
	private String history;
	
	/** Calculator constructor */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		
		history = "0";
	}
	
	/** Get the total
	 * 
	 * @return total	The integer being worked on	
	 */
	public int getTotal () {
		
		return total;
	}
	
	/** Add value to the total
	 * 
	 * @param value		integer added to total
	 */
	public void add (int value) {
		
		total = total + value;
		history = history + " + " + value;
	}
	
	/** Subtract value from the total
	 * 
	 * @param value		integer to be subtracted
	 */
	public void subtract (int value) {
		
		total = total - value;
		history = history + " - " + value;
	}
	
	/** Multiply total by value
	 * 
	 * @param value		integer to be multiplied
	 */
	public void multiply (int value) {
		
		total = total * value;
		history = history + " * " + value;
	}
	
	/** Divide the total by value
	 * 
	 * @param value		integer to be divided by
	 */
	public void divide (int value) {
		if (value==0)
			total = 0;
		else
			total = total / value;
		
		history = history + " / " + value;
	}
	
	/** Displays the history
	 * 
	 * @return			The history of integers
	 */
	public String getHistory () {
		return history;
	}
}