package bankSafe;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.LinkedHashMap;
import java.util.Map;

public class BankVaultTest {
    BankVault bankVault;
    Item item;
    Item item1;
    Item item2;
    @Before
    public void setup(){
    bankVault = new BankVault ();
    item = new Item ("Petko", "56");
    item1 = new Item ("Gosho", "67");
    item2 = new Item (null, "78");
    }
    @Test
    public void testGetValue() {
        Map<String, Item> map = new LinkedHashMap<> ();
        map = this.bankVault.getVaultCells ();
        Assert.assertEquals (map,this.bankVault.getVaultCells () );
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithNonExistent() throws OperationNotSupportedException {
        this.bankVault.addItem ("WWW", item);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithNonExistentCEll() throws OperationNotSupportedException {
        this.bankVault.addItem ("A1", item);
        this.bankVault.addItem ("A1", item1);
        this.bankVault.getVaultCells ().get ("A1");
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testWithNonExistentWhitAllraedyItem() throws OperationNotSupportedException {
        Item currewnt = item;
        this.bankVault.addItem ("A1", null);
        this.bankVault.addItem ("A1", item);
        boolean itemExist = this.bankVault.getVaultCells ().containsValue (currewnt);
        Assert.assertTrue (itemExist);
    }
    @Test
    public void testAddItem() throws OperationNotSupportedException {
       String result = this.bankVault.addItem ("A1", item);
        Assert.assertEquals (result, String.format ("Item:%s saved successfully!",item.getItemId ()));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithOutValidCell() throws OperationNotSupportedException {
        String ceil = "M1";
        this.bankVault.removeItem (ceil, null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithOutValidItem() throws OperationNotSupportedException {
        String ceil = "A1";
        Item currentitem = item;
        this.bankVault.addItem (ceil, currentitem);
        Item remove = this.bankVault.getVaultCells ().get ("A2");
        Assert.assertNotEquals (currentitem, remove);
        this.bankVault.removeItem (ceil, remove);
    }
    @Test
    public void testRemove() throws OperationNotSupportedException {
        String ceil = "A1";
        Item currentItem = item;
        this.bankVault.addItem ("A1",item);
       String output =  this.bankVault.removeItem (ceil, currentItem);
       Assert.assertNull (this.bankVault.getVaultCells ().get ("A1"));
       Assert.assertEquals (output, String.format ("Remove item:%s successfully!", currentItem.getItemId ()));
    }
    @Test
    public void testGetOwner() throws OperationNotSupportedException {
        this.bankVault.addItem ("A1", item);
        String owner = this.bankVault.getVaultCells ().get ("A1").getOwner ();
        Assert.assertEquals (owner, "Petko");
    }
}