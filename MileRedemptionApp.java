/************************************************************
 *                                                          *
 *  CSCI 470-1   Assignmet 2                   Spring 2019  *
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

public class MileRedemptionApp
{
    
    public static void(main String[] args)
    {
        boolean again = true;

        while (again)
        {
            // Filename scanner
            Scanner fileScan = new Scanner(System.in);

            // Get input from user
            System.out.print("Please enter the name of the file: ");

            // The files destination records 
            Scanner destinationRecords = new Scanner(System.in);

            // Instantiate mile redeemer obj to process destinations
            MileRedeemer myMileRedeemer = new MileRedeemer();

            // Process the destination records
            myMileRedeemer.readDestinations(destinationRecords);

            // List city names 
            myMileRedeemer.getCityNames();

            // Prompt travel agent for client's frequent flyer miles balance
            Scanner flyerMileScan = new Scanner(System.in);

            // Get input from user
            System.out.print("Please enter your client's accumulated Frequent Flyer Miles:");

            // Prompt travel agent for client's frequent flyer miles balance
            Scanner departureMonthScan = new Scanner(System.in);

            // Get input from user
            System.out.print("Please enter your client's month of departure (1-12): ");

            // Redeem miles
            myMileRedeemer.redeemMiles(flyerMileScan.nextInt(), departureMonthScan.nextInt());

            // Present remaining miles
            myMileRedeemer.getRemainingMiles();

            // Continue scanner
            Scanner continueScan = new Scanner(System.in);

            // Continue?
            System.out.print("----------------------------------------------------------------\nDo you want to continue (y/n)? ");

            if (continueScan.nextLine().equalsIgnoreCase("y") || continueScan.nextLine().equalsIgnoreCase("yes"))
            {
                again = true;
            }
            else
            {

                System.out.print("-------------------------------------------------------------------------\nTHANK YOU FOR USING THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP\n-------------------------------------------------------------------------");
                again = false;
            }
        }

    }

}
