package starter.code;
/**File name:FitnessTracker.java
@author: Smriti Kohli , 041156272
Course : CST8132 - OOP
Assignment : Assignment 001
Date : February 9th, 2025
Professor: Amal Ibrahim 
Purpose :This class calculates the fitness level of patients using different methods and if-else statements. 
Class List : FitnessTracker, FitnessTrackerTest, FitnessTrackerTest2
*/

/**
* @author: Smriti Kohli
* @version: openjdk 21.0.4 2024-07-16 LTS
* @see: starter.code>object
* @since: javac 21.0.4
*/


/**
 * This class calculates the fitness level of patients using different methods and if-else statements. 
 */
public class FitnessTracker {
	
	/**
     * These are the variables which we declared as private so no one can access out of class.
     */
	private String firstName ;
	private String lastName;
	private String gender;
	private int stepsTaken ;
	private int caloriesBurned;
	private int activeMinutes;
	
	/***
	 * This is the default constructor
	 */
	public FitnessTracker() {
		
	}

	/**
	 * Constructs a FitnessTracker object with the specified first name, last name, gender, steps taken,
	 * calories burned, and active minutes.
	 * 
	 * @param firstName     The first name of the individual.
	 * @param lastName      The last name of the individual.
	 * @param gender        The gender of the individual ("male" or "female").
	 * @param stepsTaken    The number of steps taken by the individual.
	 * @param caloriesBurned The number of calories burned by the individual.
	 * @param activeMinutes  The number of active minutes for the individual.
	 */
	public FitnessTracker(String firstName, String lastName, String gender, int stepsTaken, int caloriesBurned, int activeMinutes) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.stepsTaken=stepsTaken;
		this.caloriesBurned=caloriesBurned;
		this.activeMinutes= activeMinutes;
		}
   
	/**
	 * This is the getter method for first name.
	 */
	public String getFirstName() {
        return firstName;
    }
	
	/**
	 * This is the setter method for first name.
	 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
	 * This is the getter method for last name.
	 */
    public String getLastName() {
        return lastName;
    }

    /**
	 * This is the setter method for last name.
	 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
	 * This is the getter method for Gender.
	 */
    public String getGender() {
        return gender;
    }

    /**
	 * This is the setter method for gender.
	 */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
	 * This is the getter method for steps taken daily.
	 */
    public int getStepsTaken() {
        return stepsTaken;
    }

    /**
	 * This is the setter method for steps taken daily.
	 */
    public void setStepsTaken(int stepsTaken) {
        this.stepsTaken = stepsTaken;
    }

    /**
	 * This is the getter method for calories burned daily.
	 */
    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    /**
	 * This is the setter method for calories burned daily.
	 */
    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    /**
	 * This is the getter method for active minutes.
	 */
    public int getActiveMinutes() {
        return activeMinutes;
    }

    /**
	 * This is the setter method for active minutes.
	 */
    public void setActiveMinutes(int activeMinutes) {
        this.activeMinutes = activeMinutes;
    }
    
    /**
     * This is the method to calculate total distance walked.
     */
	 public double calculateDistanceWalked() {
		 double stepLength = (gender.equalsIgnoreCase("male"))?0.8:0.7;
		 return stepsTaken * stepLength; 
	 }
	 
	 /**
	     * This is the method to calculate total weekly average minutes covered.
	     */
	 public double calculateWklyAvgMinutes() {
		 return activeMinutes * 7.0;
	 }
	 
	 /**
	   * This is the method to calculate total weekly calories Burned.
	   */
	 public double calculateWklyCalBurned() {
		 return caloriesBurned * 7.0;
	 }
	 
	 /**
	   * This is the method to determine the fitness level using if-else statement.
	   */
	 public String calculateFitnessLevel() {
		 if (activeMinutes * 7.0 > 150 && caloriesBurned * 7.0 > 2000) {
			 return "Active";
			 
		 }else if((activeMinutes * 7.0>=75 && activeMinutes * 7.0 <=150)|| (caloriesBurned * 7.0>=1000 && caloriesBurned * 7.0  <=2000)) {
			 return "Moderately Active";
		 }else {
			 return "Sendentary";
		 }
		 }
	 
	 /**
	   * This is the method to calculate how many calories are less or more
	   */
	 public int calculateCalorieDeficitOrSurplus(int maintenanceCalories) {
	        return maintenanceCalories - caloriesBurned;
	    }
	 
	 /**
	   * This is the method that prints all the data and information.
	   */
    public void displayFitnessData() {
    	System.out.printf("First Name: %s%n", firstName);
        System.out.printf("Last Name: %s%n", lastName);
        System.out.printf("Gender: %s%n", gender);
        System.out.printf("Daily Steps: %d%n", stepsTaken);
        System.out.printf("Distance Walked: %.2f meters%n", calculateDistanceWalked());
        System.out.printf("Weekly Active Minutes: %.2f%n", calculateWklyAvgMinutes());
        System.out.printf("Weekly Calories Burned: %.2f%n", calculateWklyCalBurned());
        System.out.printf("Fitness Level: %s%n", calculateFitnessLevel());
        
        
        System.out.println("Fitness Level Criteria:");
        System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
        System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
        System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
    }
} // end class FitnessTracker