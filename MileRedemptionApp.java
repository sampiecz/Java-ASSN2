/************************************************************
 *                                                          *
 *  CSCI 470-1   Assignment 2                   Spring 2019 *
 *                                                          *
 *  Programmer:  Samuel Piecz                               *  
 *               z1732715                                   *
 *                                                          * 
 *                                                          *   
 *                                                          *
 *  Date Due:    2/20/19                                    *
 *                                                          *
 ************************************************************/ 
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class MileRedemptionApp
{
    
    public static void main(String[] args) throws IOException
    {
		boolean again = true;

        while (again)
        {
			// Filename scanner
			String fileName; 

			Scanner keyScan = new Scanner(System.in);

			// Get input from user
			System.out.print("Please enter the name of the file: ");
			fileName = keyScan.nextLine();

			Scanner fileScan = new Scanner(new File(fileName));

			// Instantiate mile redeemer obj to process destinations
			MileRedeemer myMileRedeemer = new MileRedeemer();

			// Process the destination records
			myMileRedeemer.readDestinations(fileScan);


			
			// Print bannner
			System.out.print(
				"\n---------------------------------------------------------------\n" + 
				"WELCOME TO THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP\n" + 
				"----------------------------------------------------------------\n" + 
				"\nList of destination cities your client can travel to:\n"
			);


			// List city names 
			for (String name : myMileRedeemer.getCityNames())
				System.out.println(name);

			System.out.println("\n---------------------------------------------------------------");

			// Prompt travel agent for client's frequent flyer miles balance
			// Get input from user
			int frequentFlyerMiles;
			Scanner flyerMileScan = new Scanner(System.in);
			System.out.print("\nPlease enter your client's accumulated Frequent Flyer Miles: ");
			frequentFlyerMiles = flyerMileScan.nextInt();
			

			// Prompt travel agent for client's frequent flyer miles balance
			// Get input from user
			int departure;
			Scanner departureMonthScan = new Scanner(System.in);
			System.out.print("\nPlease enter your client's month of departure (1-12): ");
			departure = departureMonthScan.nextInt();


			// Redeem miles
			System.out.println("\nYour client's Frequent Flyer Miles can be used to redeem the following tickets: \n\n");

			for( String goingTo : myMileRedeemer.redeemMiles(frequentFlyerMiles, departure))
				System.out.println(" * " + goingTo);

			// Present remaining miles
			System.out.print("Your client's remaining Frequent Flyer Miles: " + myMileRedeemer.getRemainingMiles());

			// Continue scanner
			Scanner continueScan = new Scanner(System.in);

			// Continue?
            System.out.print(
		  		"\n----------------------------------------------------------------\n" + 
		  		"Do you want to continue (y/n)? "
		  	);

			String continueString = continueScan.nextLine(); 

              if (continueString.equalsIgnoreCase("y") || continueString.equalsIgnoreCase("yes"))
              {
                  again = true;
              }
              else
              {

                  System.out.print(
			  		"-------------------------------------------------------------------------\n" +
			  		"THANK YOU FOR USING THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP\n" + 
			  		"-------------------------------------------------------------------------\n"
			  	);

                  again = false;
              }

			keyScan.close();
			fileScan.close();
			continueScan.close();

          }
			
    }

}
