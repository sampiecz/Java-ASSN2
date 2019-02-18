import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MileRedeemer
{
	private int miles;
	private String destinationRecord;
	private Destination destination;
	private ArrayList<Destination> destinationList = NewArrayList<Destination>();

	// Fixed length array, won't be used until you do the copy to method
	private Destination[] destinationArray;

	public void readDestinations(Scanner fileName) throws IOException
	{
		String destinationRecord;

		String [] subStrings;

		while (fileName.hasNext())
		{
			destinationRecord = fileName.nextLine();
			subStrings = destinationRecord.split(";", 5);
			destination = new Destination();

			destination.setCityName(subStrings[0]);
			destination.setNormalMiles(Integer.parseInt(subStrings[1]));
			destination.setSaverMiles(Integer.parseInt(subStrings[2]));
			destination.setUpgradeMiles(Integer.parseInt(subStrings[3]));

			subStrings = subStrings[4].split("-", 2);

			destination.setBeginMonth(Integer.parseInt(subStrings[0]));
			destination.setEndMonth(Integer.parseInt(subStrings[1]));
		}

        // Need to sort array in descending order by normal mileage
	}


    public String[] getCityNames()
    {

    }

    public String[] redeemMiles(int miles, int month)
    {
    }

    public int getRemainingMiles()
    {
    }
}
