package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class ListIteratorTest {
    private String name0;
    private String name1;
    private String name2;
    @Before
    public void setup(){
        name0 = null;
        name1 = "Strahil";
        name2 = "Pesho";
    }@Test(expected = OperationNotSupportedException.class)
    public void testConstructorWhitNull() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator (null);
    }
    @Test
    public void testConstructor() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator (name1, name2);
    }
    @Test
    public void testMoveTrue() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator (name1, name2);
        Assert.assertTrue (listIterator.move ());
    }
    @Test
    public void testMovefalse() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator ();
        Assert.assertFalse (listIterator.move ());
    }
    @Test
    public void testHasNextTrue() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator (name1, name2);
        Assert.assertTrue (listIterator.hasNext ());
    }
    @Test
    public void testPrint() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator (name1, name2);
        listIterator.print ();
    }
    @Test(expected = IllegalStateException.class)
    public void testPrintWhitNull() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator ();
        listIterator.print ();
    }

}
