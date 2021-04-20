package aquarium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AquariumTests {
    Aquarium aquarium;
    Aquarium aquarium1;
    Fish fish;
    Fish fish1;
    Fish fish2;
    @Before
    public void setup(){
        aquarium = new Aquarium ("Aqua", 50);
        aquarium1 = new Aquarium ("Aqua", 1);
        fish = new Fish ("Sharan");
        fish1 = new Fish ("Som");
        fish2 = null;
    }
    @Test
    public void get(){
        String name = aquarium.getName ();
        int capacity = aquarium.getCapacity ();
        Assert.assertEquals (name, "Aqua");
        Assert.assertEquals (capacity, 50);
    }
    @Test(expected = NullPointerException.class)
    public void setName(){
        aquarium = new Aquarium ("", 50);
    }
    @Test(expected = NullPointerException.class)
    public void setName1(){
        aquarium = new Aquarium (null, 50);
    }
    @Test(expected = IllegalArgumentException.class)
    public void setCapacity(){
        aquarium = new Aquarium ("Aqua", -50);
    }
    @Test
    public void GetCount(){
        aquarium.add (fish);
        aquarium.add (fish1);
        int size = aquarium.getCount ();
        Assert.assertEquals (2,size);
    }
    @Test(expected = IllegalArgumentException.class)
    public void add(){
        aquarium1.add (fish);
        aquarium1.add (fish1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void removeWithNull(){
        aquarium.add (fish);
        aquarium.add (fish1);
        String name = "Akula";
        aquarium.remove (name);
        Assert.assertEquals (2, aquarium.getCount ());
    }
    @Test
    public void remove(){
        aquarium.add (fish);
        aquarium.add (fish1);
        String name = fish1.getName ();
        aquarium.remove (name);
        Assert.assertEquals (1, aquarium.getCount ());
    }
    @Test(expected = IllegalArgumentException.class)
    public void SellNull(){
        aquarium.add (fish);
        String name = "SSSS";
       Fish fishCurrent = aquarium.sellFish (name);

    }
    @Test
    public void Sell(){
        aquarium.add (fish);
        aquarium.add (fish1);
        String name = fish1.getName ();
        Fish fishCurrent = aquarium.sellFish (name);
        Assert.assertEquals (fishCurrent, fish1);
        Assert.assertEquals (fishCurrent.getName (), fish1.getName ());
        Assert.assertFalse (fishCurrent.isAvailable ());
    }
    @Test
    public void report(){
        aquarium.add (fish);
        String result = aquarium.report ();
        Assert.assertEquals (result, String.format("Fish available at %s: %s", aquarium.getName (), fish.getName ()));
    }
}

