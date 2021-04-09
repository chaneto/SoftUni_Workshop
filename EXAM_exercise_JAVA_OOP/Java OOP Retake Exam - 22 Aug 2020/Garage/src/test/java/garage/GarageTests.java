package garage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GarageTests {
    Garage garage;
    Car car;
    Car car1;
    Car car2;
    Car car3;
    @Before
    public void setup(){
        garage = new Garage ();
        car = new Car ("Lada", 180, 1000.00 );
        car1 = new Car ("Lada", 140, 500.00 );
        car2 = new Car ("BMW", 220, 5000.00 );
        car3 = null;
    }@Test
    public void testGEtCars(){
        garage.addCar (car);
        garage.addCar (car1);
        garage.addCar (car2);
        List<Car> cars = garage.getCars ();
        Assert.assertEquals (3, cars.size ());
        Assert.assertEquals (3, garage.getCount ());
    }
    @Test
    public void testfindAllCarsWithMaxSpeedAbove(){
        garage.addCar (car);
        garage.addCar (car1);
        garage.addCar (car2);
        int maxSpeed = 150;
        List<Car> cars = garage.findAllCarsWithMaxSpeedAbove (maxSpeed);
        Assert.assertEquals (2, cars.size ());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddcarWithExeption(){
        garage.addCar (car3);
    }
    @Test
    public void testgetTheMostExpensiveCar(){
        garage.addCar (car);
        garage.addCar (car1);
        garage.addCar (car2);
        Car car = garage.getTheMostExpensiveCar ();
        Assert.assertEquals (car, car2);
    }
    @Test
    public void testfindAllCarsByBrand(){
        garage.addCar (car);
        garage.addCar (car1);
        garage.addCar (car2);
        String brand = "Lada";
        List<Car> cars = garage.findAllCarsByBrand (brand);
        Assert.assertEquals (2, cars.size ());
    }
}