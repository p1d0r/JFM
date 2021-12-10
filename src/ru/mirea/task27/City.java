package ru.mirea.task27;

public class City {
    String city,county;

    public City(String city, String county) {
        this.city = city;
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
