/*
* Domino.java
* Author: Shovik Shyamsundar
* Submission Date: 4/5/2012
*
* Purpose: Domino class, blueprint for domino objects.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on a programming project created by the Department of
* Computer Science at the University of Georgia. Any publishing
* of source code for this project is strictly prohibited without written
* consent from the Department of Computer Science.
*/


/**
 * 	 Domino.java
 *   This is code for a Domino class which represents a domino in a standard
 *   domino set.   Each domino has a major and a minor.
 */ 
 import java.util.Random; 
public class Domino {

	   
    // Declare the instance variables for the major and minor
    public int major, minor;
    public int[] domino = new int[2];

    /**
     *  Default constructor - it should initialize
     *  a domino object at random, i.e., it should assign random
     *  values to both the major and minor.  Make sure the
     *  random values make sense for a domino tile:
     *   . The major must be a number between 0 and 6
     *   . The minor must be a number between 0 and 6
     */
    //default constructor
    public Domino() {
    	
    	Random rand = new Random(); 
    	
    	minor = rand.nextInt(7);
    	major = rand.nextInt(7);
    	domino[0]=minor;
    	domino[1]=major;
    }

    /**
     *  Constructor that initializes a domino object with the two  
     *  parameters number1 and number2 properly. 
     *  If number1 or number2 are not between 0 and 6
     *  then assign 0 to both the major and the minor
     */
    //constructor with parameters
    public Domino(int number1, int number2) {
    	
    	if (number1>6||number1<0)
    		domino[0]=0;
    	else
    		domino[0]=number1;
    	if (number2>6||number2<0)
    		domino[1]=0;
    	else
    		domino[1]=number2;
		
    }

    /**
     *  Returns the major of a domino
     */ 
    public int getMajor() {

		return domino[1];
    }

    /**
     *  Returns the minor of a domino
     */ 
    public int getMinor() {

		return domino[0];
    }
    
    /**
     *  Returns the weight of a domino
     */ 
    public int getWeight() {

		return domino[0]+domino[1];
    }

    /**
     *  Returns true if this domino is a double
     */ 
    public boolean isDouble() {

		if (domino[0]==domino[1])
			return true;
		else
			return false;
    }

    /**
     *  Returns true if this domino is a blank (the minor is zero)
     */ 
    public boolean isBlank() {

		if (domino[0]==0)
			return true;
		else 
			return false;
    }
	
	/**
     *  Returns true if the major and minor of this domino
	 *  are equal to d's major and minor respectively.
	 *  Otherwise returns false.
     */
    public boolean equals(Domino d) {
    	
    	if (domino[0]==d.domino[0] && domino[1]==d.domino[1])
    		return true;
    	else
    		return false;

    }

    /**
     *  Returns:
     *	-1 if this domino has lower rank than the Domino d.  
     *   0 if this domino has the same rank as Domino d
     *	 1 if this domino has higher rank than the Domino d.  
     *
     *  For example, 0 - 6 has higher rank than 3 - 3, and
     *  3 - 5 has higher rank than 1 - 5    
     */
    public int compareTo(Domino d) {
    	
    	if (domino[1]<d.domino[1])
    		return -1;
    	else if (domino[1]==d.domino[1])
    	{
    		if (domino[0]<d.domino[0])
    			return -1;
    		else if (domino[0]==d.domino[0])
    			return 0;
    		else
    			return 1;
    	}
    	else
    		return 1;

    }
    
    
    /**
     *  Returns a String representation of this
     *  domino.  
     * @return 
     */
    public String toString() {
		
		return domino[0] + " - " + domino[1];
		
    }


}
