package starter.code;
/**File name:FitnessTrackerTest.java
@author: Smriti Kohli , 041156272
Course : CST8132 - OOP
Assignment : Assignment 001
Date : February 9th, 2025
Professor: Amal Ibrahim 
Purpose :This class asks for the inputs from the patient and calls the different methods using an object. 
Class List : FitnessTracker, FitnessTrackerTest, FitnessTrackerTest2
*/

/**
* @author: Smriti Kohli
* @version: openjdk 21.0.4 2024-07-16 LTS
* @see: starter.code>object
* @since: javac 21.0.4
*/

import java.util.Scanner;
/**
 * This class asks for the inputs from the patient and calls the different methods using an object. 
 */
public class FitnessTrackerTest {
	/**
	 *This is the main method.
	 */

	public static void main(String[] args) {
	  /**
	   * This is the Scanner class which takes the input.
	   */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Here we asked the user for first name.
		 */
		System.out.print("Enter first name:");
		String firstName = input.nextLine();
		
		/**
		 * Here we asked the user for last name.
		 */
		System.out.print("Enter last name:");
		String lastName = input.nextLine();
		
		/**
		 * Here we asked the user for Gender.
		 */
		System.out.print("Enter gender (male/female):");
		String gender = input.nextLine();
		
		/**
		 * Here we asked the user for steps taken daily.
		 */
		System.out.print("Enter steps taken daily:");
		int stepsTaken = input.nextInt();
		
		/**
		 * Here we asked the user for calories burned daily.
		 */
		System.out.print("Enter calories burned daily:");
		int caloriesBurned = input.nextInt();
		
		/**
		 * Here we asked the user for active minutes daily.
		 */
		System.out.print("Enter active minutes daily:");
		int activeMinutes =  input.nextInt();
		
		/**
	     * This is the object we're using to call from FitnessTracker class.
	     */
		FitnessTracker tracker = new FitnessTracker(firstName, lastName, gender, stepsTaken, caloriesBurned, activeMinutes);
		
		/**
	     * Here we're calling methods from FitnessTracker class using the tracker object.
	     */
		double distanceWalked = tracker.calculateDistanceWalked();
        double weeklyActiveMinutes = tracker.calculateWklyAvgMinutes();
        double weeklyCaloriesBurned = tracker.calculateWklyCalBurned();
        String fitnessLevel = tracker.calculateFitnessLevel();

        /**
		 * Here we are asking user for maintenance calorie level.
		 */
        System.out.print("Enter maintenance calorie level: ");
        int maintenanceCalories = input.nextInt();
        /**
		 * Here we are calling calculateCalorieDeficitOrSurplus method using our tracker object.
		 */
        int calorieDeficitOrSurplus = tracker.calculateCalorieDeficitOrSurplus(maintenanceCalories);

        /**
         * Here we did the method call for displayFitnessData which contains print statements using tracker object.
         */
        tracker.displayFitnessData();
        
        /**
         *By this method we close the input stream
         */
        input.close();
       }
}// end class FitnessTrackerTest
