package computers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ComputerManagerTests {
    ComputerManager computerManager;
    Computer computer;
    Computer computer1;
    Computer computer2;
    Computer computer3;
    @Before
    public void setup(){
        computerManager = new ComputerManager ();
        computer = new Computer ("Toshiba", "Satelite", 500);
        computer1 = new Computer ("Asus", "Rog", 600);
        computer2 = new Computer ("Lenovo", "Yoga", 700);
    }
    @Test
    public void getComputers(){
        computerManager.addComputer (computer);
        Assert.assertEquals (1, computerManager.getCount ());
        List<Computer> list = computerManager.getComputers ();
        Assert.assertEquals (list.size (), computerManager.getCount ());

    }
    @Test(expected = IllegalArgumentException.class)
    public void getComputersWhitInvalid(){
        computerManager.addComputer (computer);
        computerManager.addComputer (computer);
        Assert.assertEquals (1, computerManager.getCount ());
    }
    @Test
    public void testRemove(){
        computerManager.addComputer (computer);
        computerManager.addComputer (computer1);
        String manifacture = computer.getManufacturer ();
        String model = computer.getModel ();
        Computer computerCurrent = computerManager.removeComputer (manifacture,model);
        Assert.assertEquals (computerCurrent.getManufacturer (),manifacture);
        Assert.assertEquals (computerCurrent.getModel (),model);

    }
    @Test(expected = IllegalArgumentException.class)
    public void getComp(){
        computerManager.addComputer (computer);
        computerManager.addComputer (computer1);
        String manifacture = computer2.getManufacturer ();
        String model = computer2.getModel ();
        computerManager.getComputer (manifacture, model);
    }
    @Test
    public void getComputersByManufacturer(){
        computerManager.addComputer (computer);
        computerManager.addComputer (computer1);
        String manifacture = computer.getManufacturer ();
        List<Computer> list = computerManager.getComputersByManufacturer (manifacture);
        Assert.assertEquals (list.size (), 1);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testValidate(){
        computerManager.addComputer (computer3);
    }
}