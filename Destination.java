import java.util.Comparator;

public class Destination implements Comparator<Destination>
{
    private String cityName;
    private int normalMiles;
    private int frequentFlyerMiles;
    private int additionalMilesForUpgrading;
    private int frequentFlyerProgramStartMonth;
    private int frequentFlyerProgramEndMonth;


    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getCityName()
    {
        return this.cityName;
    }
    

    public void setNormalMiles(int normalMiles)
    {
        this.normalMiles = normalMiles;
    }

    public int getNormalMiles()
    {
        return this.normalMiles;
    }


    public void setFrequentFlyerMiles(int frequentFlyerMiles)
    {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public int getFrequentFlyerMiles()
    {
        return this.frequentFlyerMiles;
    }


    public void setAdditionalMilesForUpgrading(int additionalMilesForUpgrading)
    {
        this.additionalMilesForUpgrading = additionalMilesForUpgrading;
    }

    public int getAdditionalMilesForUpgrading()
    {
        return this.additionalMilesForUpgrading;
    }


    public void setFrequentFlyerProgramStartMonth(int frequentFlyerProgramStartMonth)
    {
        this.frequentFlyerProgramStartMonth = frequentFlyerProgramStartMonth;
    }

    public int getFrequentFlyerProgramStartMonth()
    {
        return this.frequentFlyerProgramStartMonth;
    }


    public void setFrequentFlyerProgramEndMonth(int frequentFlyerProgramEndMonth)
    {
        this.frequentFlyerProgramEndMonth = frequentFlyerProgramEndMonth;
    }

    public int getFrequentFlyerProgramEndMonth()
    {
        return this.frequentFlyerProgramEndMonth;
    }
    
	public int compare(Destination d1, Destination d2)
	{
		return (d2.normalMiles = d1.normalMiles);
	}
}
