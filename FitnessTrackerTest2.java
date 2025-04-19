package starter.code;
/**File name:FitnessTrackerTest2.java
@author: Smriti Kohli , 041156272
Course : CST8132 - OOP
Assignment : Assignment 001
Date : February 9th, 2025
Professor: Amal Ibrahim 
Purpose :This class tests the different methods using test cases which includes three successful and three unsuccessful.
Class List : FitnessTracker, FitnessTrackerTest, FitnessTrackerTest2
*/

/**
* @author: Smriti Kohli
* @version: openjdk 21.0.4 2024-07-16 LTS
* @see: starter.code>object
* @since: javac 21.0.4
*/
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * This class tests the different methods using test cases which includes three successful and three unsuccessful.
 */
public class FitnessTrackerTest2 {
	/**
	 * This is a successful test case for calculateFitnessLevel methods
	 */

	@Test
    public void testCalculateFitnessLevelActive() {
        FitnessTracker tracker = new FitnessTracker("John", "Doe", "male", 10000, 300, 45);
        String fitnessLevel = tracker.calculateFitnessLevel();
        assertEquals("Active", fitnessLevel);
    }
	/**
	 * This is a unsuccessful test case for calculateFitnessLevel methods
	 */
	@Test
    public void testCalculateFitnessLevelFailure() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Smith", "female", 2000, 100, 10);
        String fitnessLevel = tracker.calculateFitnessLevel();
        assertEquals("Active", fitnessLevel);
    }
	/**
	 * This is a successful test case for calculateDistanceWalkedd methods
	 */
	@Test
    public void testCalculateDistanceWalkedSuccess() {
        FitnessTracker tracker = new FitnessTracker("John", "Doe", "male", 10000, 500, 60);
        double expectedDistance = 10000 * 0.8;
        double actualDistance = tracker.calculateDistanceWalked();
        assertEquals(expectedDistance, actualDistance, 0.001);
    }
	/**
	 * This is a unsuccessful test case for calculateDistanceWalked methods
	 */
	@Test
    public void testCalculateDistanceWalkedFailure() {
        FitnessTracker tracker = new FitnessTracker("Jane", "Smith", "female", 2000, 500, 60);
        double expectedDistance = 2000 * 0.6;
        double actualDistance = tracker.calculateDistanceWalked();
        assertEquals(expectedDistance, actualDistance, 0.001);
    }
	/**
	 * This is a successful test case for calculateCalorieDeficitOrSurplus methods
	 */
	@Test
    public void testCalculateCalorieDeficitOrSurplusSuccess() {
        FitnessTracker tracker = new FitnessTracker("John", "Doe", "male", 10000, 500, 60);
        int maintenanceCalories = 2000;
        int expectedCalorieDeficit = maintenanceCalories-500;
        int actualCalorieDeficit = tracker.calculateCalorieDeficitOrSurplus(maintenanceCalories);
        assertEquals(expectedCalorieDeficit, actualCalorieDeficit);
    }
	/**
	 * This is a successful test case for calculateCalorieDeficitOrSurplus methods
	 */
	@Test
	public void testCalculateCalorieDeficitOrSurplusFailure() {
	    FitnessTracker tracker = new FitnessTracker("Jane", "Smith", "female", 10000, 500, 60);
	    int maintenanceCalories = 3000;
	    int expectedCalorieDeficit = 0; // Set this to the value you know will be returned by the method
	    int actualCalorieDeficit = tracker.calculateCalorieDeficitOrSurplus(maintenanceCalories);
	    assertEquals(expectedCalorieDeficit, actualCalorieDeficit); // This will fail because the values match
	}
}// end class FitnessTrackerTest2

