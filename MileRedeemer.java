import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MileRedeemer
{
	private int miles;
	private String destinationRecord;
	private Destination destination;
	private ArrayList<Destination> destinationList = new ArrayList<Destination>();

	// Fixed length array, won't be used until you do the copy to method
	private Destination[] destinationArray;

	public void readDestinations(Scanner fileName) throws IOException
	{
		String destinationRecord;

		String[] subStrings;

        // create all the destinations in the file and append them to
        // list of destinations
		while (fileName.hasNext())
		{
            // get next line
			destinationRecord = fileName.nextLine();
            
            // Split into list
			subStrings = destinationRecord.split(";", 5);

            // Create destination obj
			destination = new Destination();

            // Set all attrs of destination obj
			destination.setCityName(subStrings[0]);
			destination.setNormalMiles(Integer.parseInt(subStrings[1]));
			destination.setFrequentFlyerMiles(Integer.parseInt(subStrings[2]));
			destination.setAdditionalMilesForUpgrading(Integer.parseInt(subStrings[3]));
			subStrings = subStrings[4].split("-", 2);
			destination.setFrequentFlyerProgramStartMonth(Integer.parseInt(subStrings[0]));
			destination.setFrequentFlyerProgramEndMonth(Integer.parseInt(subStrings[1]));

            // add destionation to list of destinations
            destinationList.add(destination);
		}

        // Need to sort array in descending order by normal mileage
        Collections.sort(destinationList, new MileageComparator()); 
	}

    public String[] getCityNames()
    { ArrayList<String> names = new ArrayList<String>();

        for (Destination destination : this.destinationList)
        {
            names.add(destination.getCityName());
        }

        return Arrays.sort(names);
    }

    // miles is total available miles
    // month is the desired month of departure
    // returns array of string objects containing descriptions of redemeed tickets
    // it should also save the miles remaining after the tickets have been redeemed
    public String[] redeemMiles(int miles, int month)
    {
        ArrayList<String> descriptions = new ArrayList<String>();

        for (Destination destination : this.destinationList)
        {
            if (miles - destination.getNormalMiles() > 0 && month <= destination.getFrequentFlyerProgramEndMonth() && month >= destination.getFrequentFlyerProgramStartMonth())
            {
				descriptions.add(destination.getCityName());
				miles = miles - destination.getNormalMiles();
            }

        }

        Collections.copy(this.destinationArray, descriptions);    

        return this.destinationArray;
    }

    public int getRemainingMiles()
    {
        return miles;
    }


}

