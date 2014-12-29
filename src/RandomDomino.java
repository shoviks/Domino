/*
* RandomDomino.java
* Author: Shovik Shyamsundar
* Submission Date: 4/5/2012
*
* Purpose: Generates 20 random dominos and displays certain data about the 20 dominos.  
* This data includes heaviest domino with highest rank, lightest domino with the lowest rank,
* number of doubles and number of blanks.
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
public class RandomDomino {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numOfDoubles = 0;
		int numOfBlanks = 0;
		Domino big = new Domino(0,0);
		Domino little = new Domino(6,6);
		//for loop runs 20 times to generate 20 dominos
		for (int n=1; n<=20; n++)
		{
			//Creates new domino
			Domino dom = new Domino();
			System.out.println(dom.toString());//displays minor and major of domino
			if ((dom.getMajor()>big.getMajor())&&(dom.getMinor()>big.getMinor())) //condition to get heaviest domino with highest rank
			{
				big = dom; 
			}
			if ((dom.getMajor()<little.getMajor())&&(dom.getMinor()<little.getMinor()))//condition to get lightest domino with lowest rank
			{
				little = dom;
			}
			if (dom.getMajor()==dom.getMinor())
				numOfDoubles++;//counts number of doubles
			if (dom.getMinor()==0)//counts number of blanks
				numOfBlanks++;				
		}
		System.out.println("Heaviest domino with highest rank: " + big.toString());//prints heaviest domino with highest rank
		System.out.println("Lightest domino with lowest rank: " + little.toString());//prints lightest domino with lowest rank
		System.out.println("Number of doubles: " + numOfDoubles);//prints number of doubles
		System.out.println("Number of blanks: " + numOfBlanks);//prints number of blanks
	}

}
