package com.transport.vehicle.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.transport.vehicle.entity.Vehicle;

public class VehicleTest {
public static void main(String[] arg)
{
	Configuration config=new Configuration().configure("com/transport/vehicle/test/hibernate.cfg.xml");
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Vehicle vehicle=new Vehicle();
	vehicle.setId(5);
	vehicle.setEngine_no("eg465347");
	vehicle.setChasis_no("ch346278");
	vehicle.setName("Mercedise Benz");
	vehicle.setFuel_type("petrol");
	vehicle.setVehicle_type("Automatic CAR");
	vehicle.setReg_no("KA 03 AB 1234");
	System.out.println(session.save(vehicle));
	tx.commit();
	

}

}
