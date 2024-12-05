//Christian Ramirez

import java.util.Scanner;

public class TimeClockDemo {
    public static void main(String[] args) {
        
    	
        TimeConverter t1 = new TimeConverter();
        TimeConverter t2 = new TimeConverter();
        
      
        Scanner key = new Scanner(System.in);
        
        //using a boolean to run the code again when it gives user option
        boolean runAgain = true;
        while (runAgain) 
        {
            try 
            {
            	
               // Getting the input for the first output
                System.out.println("Enter the hours on the military clock (24-hour format):");
                int hours = key.nextInt();
                System.out.println("Enter the minutes on the military clock:");
                int minutes = key.nextInt();
                System.out.println("Enter the seconds on the military clock:");
                int seconds = key.nextInt();
                
                // Set time for the first object
                t1.updateTime(hours, minutes, seconds);
                
                // Display the converted time
                System.out.println("12-hour clock time:");
                t1.displayTime(); 
                
                // user input for the second object
                System.out.println("Enter 24-hour clock time in the format (hours:minutes:seconds):");
                String timeString = key.next();
                
                t2.updateTime(timeString);
                
                // Display the converted time
                System.out.println("12 Hour clock time:");
                t2.displayTime(); 
                
                // Basicallt asking the user if they want to do it again
                System.out.println("Would you like to do this again? Enter \"Yes\" or \"No\":");
                String userResponse = key.next();
                if (userResponse.equalsIgnoreCase("No"))
                {
                    runAgain = false; 
                    System.out.println("Exiting the program!");
                    System.exit(0);
                }
            } 
            catch (TimeException t) 
            {
            	System.out.println(t.getMessage()); 
            }
            catch (Exception t) 
            {
                System.out.println("Invalid input format. Please enter valid values.");
                key.nextLine(); 
            }
        }
        
        key.close();
    }
}

