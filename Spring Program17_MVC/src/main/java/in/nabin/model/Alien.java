package in.nabin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;

@AllArgsConstructor
@Getter
@Setter
public class Alien
{
    private int aid;
    private String aname;

    @Override
    public String toString() {
        return "Alien [aid = "+aid + ", aname = " + aname + "]";
    }
}
