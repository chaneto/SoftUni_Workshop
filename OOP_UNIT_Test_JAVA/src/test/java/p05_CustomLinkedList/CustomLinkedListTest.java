package p05_CustomLinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomLinkedListTest {
    private CustomLinkedList<String> customLinkedList;
    @Before
    public void setup(){
        customLinkedList = new CustomLinkedList<> ();
        customLinkedList.add ("Pesho");
        customLinkedList.add ("Gosho");
    }
    @Test
    public void testConstructorListNode()
    {
        CustomLinkedList customLinkedList = new CustomLinkedList ();
    }
    @Test
    public void testAdd(){

    }
    @Test
    public void testGet(){
        int index = 1;
        Assert.assertEquals ("Gosho", customLinkedList.get (index));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetInvalidIndex(){
        int index = 2;
        customLinkedList.get (index);
    }
    @Test
    public void testRemoveAt(){
        int index = 1;
        Assert.assertEquals ("Gosho", customLinkedList.removeAt (index));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtInvalidIndex(){
        int index = 2;
        customLinkedList.removeAt (index);
    }
    @Test
    public void testRemove(){
        String item = "Gosho";
        Assert.assertEquals (1, customLinkedList.remove (item));
    }
    @Test
    public void testRemoveWhitOutItem(){
        String item = "Gen4o";
        Assert.assertEquals (-1, customLinkedList.remove (item));
    }
    @Test
    public void testRemoveWhitEmptyLiat(){
        //proba
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<> ();
        customLinkedList.add ("K");
        customLinkedList.remove ("K");
        customLinkedList.add ("K");

    }
    @Test
    public void testSet(){
        String item = "Gen4o";
        int index = 1;
        customLinkedList.set (index, item);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetWhitInvalidIndex(){
        String item = "Gen4o";
        int index = 2;
        customLinkedList.set (index, item);
    }
    @Test
    public void testIndexOf(){
        String item = "Gosho";
        Assert.assertEquals (1, customLinkedList.indexOf (item));
    }
    @Test
    public void testIndexOfWhitInvalidItem(){
        String item = "Gencho";
        Assert.assertEquals (-1, customLinkedList.indexOf (item));
    }@Test
    public void testContains(){
        String item = "Gosho";
        Assert.assertTrue (customLinkedList.contains (item));
    }
}
