package halfLife;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PlayerTests {
    Player player;
    Player player1;
    Player player2;
    Gun gun;
    Gun gun1;
    Gun gun2;
    @Before
    public void setup(){
        player = new Player ("Ivancho", 100);
        gun = new Gun ("Pistol", 20);
        gun1 = new Gun ("Shmaizer", 30);
    }
    @Test
    public void testSetUsernameAndHealth(){
        String usermane = "Petko";
        int health = 20;
        player1 = new Player (usermane, health);
        Assert.assertEquals (player1.getUsername (), usermane);
        Assert.assertEquals (player1.getHealth (), health);
    }
    @Test(expected = NullPointerException.class)
    public void testSetUsernameInvalid(){
        String usermane = "";
        int health = 20;
        player1 = new Player (usermane, health);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetHealthInvalid(){
        String usermane = "Gosho";
        int health = -1;
        player1 = new Player (usermane, health);
    }
    @Test
    public void testGetGuns(){
        player.addGun (gun);
        player.addGun (gun1);
        List<Gun> guns = player.getGuns ();
        Assert.assertEquals (guns, player.getGuns ());
        Assert.assertEquals (2, guns.size ());
    }
    @Test(expected = NullPointerException.class)
    public void testAddGun(){
        player.addGun (gun2);
    }
    @Test
    public void testRemoveGuns(){
        player.addGun (gun);
        player.addGun (gun1);
        player.removeGun (gun);
        List<Gun> guns = player.getGuns ();
        Assert.assertEquals (guns, player.getGuns ());
        Assert.assertEquals (1, guns.size ());
    }
    @Test
    public void testGetGun(){
        String name = "Pistol";
        player.addGun (gun);
        player.addGun (gun1);
        Gun gun = player.getGun (name);
        Assert.assertEquals (gun.getName (), name);
    }
    @Test
    public void testTakeDamage(){
        int damage = 10;
        player.takeDamage (damage);
        Assert.assertEquals (90, player.getHealth ());
    }
    @Test(expected = IllegalStateException.class)
    public void testTakeDamagehitMinusHealth(){
        int damage = 110;
        player.takeDamage (damage);
        int damage1 = 10;
        player.takeDamage (damage1);

    }
}
