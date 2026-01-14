package in.nabin;

import in.nabin.entity.Vehicle;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main()
    {
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.setId(1);
//        vehicle1.setVehiclenumber("26487");
//        vehicle1.setVehicletype("PetrolCar");
//        vehicle1.setParkingslot(2);

//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.setId(2);
//        vehicle2.setVehiclenumber("35647");
//        vehicle2.setVehicletype("Electric Car");
//        vehicle2.setParkingslot(5);

//        Vehicle vehicle3 = new Vehicle();
//        vehicle3.setId(3);
//        vehicle3.setVehiclenumber("DL-9876");
//        vehicle3.setVehicletype("Heavy Truck");
//        vehicle3.setParkingslot(12);

        Configuration configuration = new Configuration();
        configuration.configure("Hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


//        <----INSERT OR CREATE OPERATION----->
//    try
//    {
//        session.save(vehicle3);
//        transaction.commit();
//        System.out.println("VEHICLE SUCCESSFULLY ADDED!");
//    }
//    catch (Exception e)
//    {
//    transaction.rollback();
//     e.printStackTrace();
//     System.out.println("VEHICLE NOT ADDED DUE TO SOME ERROR!");
//    }

//        <------GET VALUE OF THE CAR FROM THE DATABASE

//        try
//        {
//            Vehicle vehicle = session.get(Vehicle.class,3L);
//            if(vehicle!=null)
//            {
//                System.out.println("--------------------------------");
//                System.out.println("Vehicle Details:- ");
//                System.out.println("Id: "+vehicle.getId());
//                System.out.println("Number: "+vehicle.getVehiclenumber());
//                System.out.println("Type: "+vehicle.getVehicletype());
//                System.out.println("Parking_Slot: "+vehicle.getParkingslot());
//            }
//            else
//            {
//                System.out.println("USER NOT FOUND DUE TO SOME ERROR");
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            System.out.println("Error: "+e.getMessage());
//        }


//    <--------UPDATE VEHICLE-------->
    try
    {
        Vehicle vehicle = session.get(Vehicle.class, 1L);

        if(vehicle != null) {

            vehicle.setHoursParked(45);


            double rate = 15.0;
            vehicle.setTotalfee(vehicle.getHoursParked() * rate);

            session.saveOrUpdate(vehicle);
            transaction.commit();
            System.out.println("VEHICLE UPDATED ");
        }
        else
        {
            System.out.println("Vehicle with PROVIDED ID not found!");
        }
    }

    catch (Exception e)
    {
            if (transaction != null)
            {
                transaction.rollback();
            }
            e.printStackTrace();
        }


//        <------------DELETE VEHICLE
//        try
//    {
//        Vehicle vehicle = session.get(Vehicle.class, 2L);
//        session.delete(vehicle);
//        transaction.commit();
//        System.out.println("VEHICLE DELETED SUCCESSFULLY !");
//    }
//
//    catch(Exception e)
//
//    {
//        transaction.rollback();
//        e.printStackTrace();
//        System.out.println("VEHICLE NOT DELETED DUE TO SOME ERROR!");
//    }

}
}

