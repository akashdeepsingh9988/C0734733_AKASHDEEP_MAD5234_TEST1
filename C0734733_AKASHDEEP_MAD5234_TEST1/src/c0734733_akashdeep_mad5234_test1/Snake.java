/*
    STUDENT NAME :  AKASHDEEP SINGH
    STUDENT ID : C0734733
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0734733_akashdeep_mad5234_test1;

/**
 *
 * @author Akashdeep Singh
 */
public class Snake {
	private String name;
	private int length; // the length of the boa, in feet
	private String favoriteFood;

	
	/**
	 * Creates a new Snake object.
	 * @param name			the name of the snake
	 * @param length		length of the snake
	 * @param favoriteFood	what the snake likes to eat
	 */
	public Snake(String name, int length, String favoriteFood) {
		this.name = name;
		this.length = length;
		this.favoriteFood = favoriteFood;
	}

	
	/**
	 * Snakes are healthy if they love vegetables
	 * @return true if snake is healthy
	 */
	public boolean isHealthy() {
		return this.favoriteFood.equals("vegetables");
	}

	
	/**
	 * Checks if snake will fit in a cage 
	 * @return true if snake length < cage length
	 */
	// returns true if the length of this snake is
	// less than the given cage length
	public boolean fitsInCage(int cageLength) {
		return this.length < cageLength;
	}
}