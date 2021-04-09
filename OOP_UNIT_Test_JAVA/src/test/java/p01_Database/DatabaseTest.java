package p01_Database;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    @Test(expected =  OperationNotSupportedException.class)
    public void testConstructorWhitNullElement() throws OperationNotSupportedException {
        Database database = new Database ();
    }
    @Test(expected =  OperationNotSupportedException.class)
    public void testConstructorWhitMoreElement() throws OperationNotSupportedException {
        Integer[] arrway = new Integer[17];
        Database database = new Database (arrway);
    }
    @Test
    public void testValidConstructor() throws OperationNotSupportedException{
        Database database = new Database (1,2,3);
        Assert.assertEquals (3, database.getElements ().length);
    }
    @Test(expected =  OperationNotSupportedException.class)
    public void testAddWhitNull() throws OperationNotSupportedException {
        Database database = new Database (1,2,3);
        int lang = database.getElements ().length;
        database.add (null);
        Assert.assertEquals (lang, database.getElements ().length);

    }
    @Test
    public void testAdd() throws OperationNotSupportedException {
        Database database = new Database (1,2,3);
        int lang = database.getElements ().length;
        database.add (5);
        Assert.assertEquals (lang + 1, database.getElements ().length);
        Assert.assertEquals (Integer.valueOf (5), database.getElements ()[3]);

    }
    @Test
    public void testRemove() throws OperationNotSupportedException {
        Database database = new Database (1,2,3);
        int lang = database.getElements()[2];
        database.remove ();
        Assert.assertEquals (3, lang);

    }
    @Test(expected =  OperationNotSupportedException.class)
    public void testRemoveWhitEmptyDatabase() throws OperationNotSupportedException {
        Database database = new Database ();
        database.remove ();
    }


}
