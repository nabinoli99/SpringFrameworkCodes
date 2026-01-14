package in.nabin.entity;
import javax.persistence.*;

@Entity
@Table
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long Id;

    @Column
    private String Vehiclenumber;

    @Column
    private String Vehicletype;

    @Column
    private long Parkingslot;

    @Column
    private Integer hoursParked;

    @Column
    private Double totalfee;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getVehiclenumber() {
        return Vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        Vehiclenumber = vehiclenumber;
    }

    public String getVehicletype() {
        return Vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        Vehicletype = vehicletype;
    }

    public long getParkingslot() {
        return Parkingslot;
    }

    public void setParkingslot(long parkingslot) {
        this.Parkingslot = parkingslot;
    }

    public Integer getHoursParked() {
        return hoursParked;
    }

    public void setHoursParked(Integer hoursParked) {
        this.hoursParked = hoursParked;
    }

    public Double getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(Double totalfee) {
        this.totalfee = totalfee;
    }
}
