package in.hisabkitab.model.user;

import jakarta.persistence.*;

@Embeddable

public class Address
{

    @Column(name = "Houseno")
    private int houseno;

    @Column(name = "CityName")
    private String cityname;

    @Column(name = "ZipCode")
    private int zipcode;


    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString()
    {
        return houseno+ " "+cityname + ","+ zipcode;
    }
}
