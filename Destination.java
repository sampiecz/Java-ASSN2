public class Destination
{
    private string cityName;
    private int normalMiles;
    private int frequentFlyerMiles;
    private int additionalMilesForUpgrading;
    private int frequentFlyerProgramStartMonth;
    private int frequentFlyerProgramEndMonth;


    public void setCityName(int cityName)
    {
        this.cityName = cityName;
    }

    public string getCityName()
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

}
