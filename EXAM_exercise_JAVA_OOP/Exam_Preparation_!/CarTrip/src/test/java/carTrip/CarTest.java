package carTrip;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car car;
    @Before
    public void  setup(){
        car = new Car ("Lada", 40, 20, 8);
    }
    @Test
    public void testGet(){
        String model = car.getModel ();
        Assert.assertEquals ("Lada", model);
        double tankCapacity = car.getTankCapacity ();
        Assert.assertEquals (40, tankCapacity, 0.0);
        double fuelAmount = car.getFuelAmount ();
        Assert.assertEquals (20, fuelAmount, 0.0);
        double fuelConsumation = car.getFuelConsumptionPerKm ();
        Assert.assertEquals (8, fuelConsumation, 0.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetModelWhitNull(){
        String model = null;
        car.setModel (model);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetModelWhitEmpty(){
        String model = "";
        car.setModel (model);
    }
    @Test
    public void testSetModel(){
        String model = "Moskvich";
        car.setModel (model);
        Assert.assertEquals (model, car.getModel ());
    }
    @Test
    public void testsetTankCapacity(){
        double tankCapacity = 50;
        car.setTankCapacity (tankCapacity);
        Assert.assertEquals (tankCapacity, car.getTankCapacity (), 0.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetAmountWhitMoreAmount(){
        double tankCapacity = car.getTankCapacity ();
        double amount = 50;
        car.setFuelAmount (amount);
        Assert.assertEquals (tankCapacity, car.getTankCapacity (), 0.0);
    }
    @Test
    public void testSetAmount(){
        double amount = 30;
        car.setFuelAmount (amount);
        Assert.assertEquals (car.getFuelAmount (), amount, 0.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSAetFuelConsumptionPerKmWhitInvalid(){
        double consumation = -1;
        car.setFuelConsumptionPerKm (consumation);
    }
    @Test
    public void testSAetFuelConsumptionPerKm(){
        double consumation = 11;
        car.setFuelConsumptionPerKm (consumation);
        Assert.assertEquals (11, car.getFuelConsumptionPerKm (), 0.0);
    }
    @Test(expected = IllegalStateException.class)
    public void testDrivedriveWhitInvalidDistance(){
        double distance = 100;
        double fuelAmount = car.getFuelAmount ();
        car.drive (distance);
        Assert.assertEquals (fuelAmount, car.getFuelAmount (), 0.0);
    }
    @Test
    public void testDrivedrive(){
        double distance = 2;
        double consumer = car.getFuelConsumptionPerKm () * distance;
        double amaount = car.getFuelAmount ();
       String text =  car.drive (distance);
        Assert.assertEquals (amaount - consumer, car.getFuelAmount (), 0.0);
        Assert.assertEquals (text, "Have a nice trip");
    }
    @Test(expected = IllegalStateException.class)
    public void testRefuelWhirMoreFuel(){
        double reFuelAmount = 30;
        double fuelAmount = car.getFuelAmount ();
        car.refuel (reFuelAmount);
        Assert.assertEquals (fuelAmount, car.getFuelAmount (), 0.0);
    }
    @Test
    public void testRefuel(){
        double refuelAmount = 10;
        car.refuel (refuelAmount);
        Assert.assertEquals (30, car.getFuelAmount (), 0.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCounstructor(){
        car = new Car ("", 1.0, 1.0, 1.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCounstructor1(){
        car = new Car (null, 1.0, 1.0, 1.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCounstructor2(){
        car = new Car ("jjj", 1.0, 2.0, 1.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCounstructor3(){
        car = new Car ("jjj", 1.0, 1.0, -1.0);

    }

}