package blueOrigin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

public class SpaceshipTests {
    Astronaut astronaut;
    Astronaut astronaut1;
    Astronaut astronaut2;
    Spaceship spaceship;
    Spaceship spaceship1;
    @Before
    public void setup(){
        spaceship = new Spaceship ("Space", 50);
        spaceship1 = new Spaceship ("Galaktic", 1);
        astronaut = new Astronaut ("Petko", 45);
        astronaut1 = new Astronaut ("Gosho", 67);
        astronaut2 = new Astronaut ("Gruio", 89);
    }@Test
    public void testGetCount(){
        spaceship.add (astronaut);
        int result = spaceship.getCount ();
        Assert.assertEquals (1, result);
    }@Test
    public void testGetName(){
        String name = spaceship.getName ();
        Assert.assertEquals ("Space", name);
    }@Test
    public void testGetCapacity(){
        int Capacity = spaceship.getCapacity ();
        Assert.assertEquals (50, Capacity);
    }@Test(expected = IllegalArgumentException.class)
    public void testAddAstronautWithEquals(){
        spaceship1.add (astronaut);
        int count = spaceship1.getCount ();
        int capacity = spaceship1.getCapacity ();
        spaceship1.add (astronaut1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddWithEqualsName(){
        spaceship.add (astronaut);
        spaceship.add (astronaut);
    }
    @Test()
    public void testRemove(){
        spaceship.add (astronaut);
        boolean yes = spaceship.remove ("Petko");
        Assert.assertTrue (yes);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacity(){
        spaceship = new Spaceship ("Petko", -1);
    }
    @Test(expected = NullPointerException.class)
    public void testSetName(){
        spaceship = new Spaceship ("", -1);
    }
    @Test(expected = NullPointerException.class)
    public void testSetName1(){
        spaceship = new Spaceship (null, -1);
    }
}
