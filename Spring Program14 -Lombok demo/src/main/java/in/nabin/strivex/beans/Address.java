package in.nabin.strivex.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address
{
    private int houseno;
    private String city;
    private int pincode;

    @Override
    public String toString() {
        return "#"+houseno+","+city + "-"+pincode;
    }
}
