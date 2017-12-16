package dk.kea.examples.logic;

class City
{
    String Country;

    String city;

    int latitude;

    int longitude;

    public City(String city, String country, int latitude, int longitude)
    {
        this.city = city;
        this.Country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCountry()
    {
        return Country;
    }

    public String getCity()
    {
        return city;
    }

    public int getLatitude()
    {
        return latitude;
    }

    public int getLongitude()
    {
        return longitude;
    }
}
