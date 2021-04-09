package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTest {
    private Person person0;
    private Person person1;
    private Person person2;
    private Person person3;
    List<Person> people;
@Before
    public void setup(){
    person0 = null;
    person1 = new Person (236, "Stambe");
    person2 = new Person (235, "Strahil");
    person3 = new Person (236, "Stambe");
    people = new ArrayList<> ();
   }
   @Test
    public void testConstructor() throws OperationNotSupportedException {
       Database database = new Database (person1);
       Assert.assertEquals (1, database.getElements ().length);
       Assert.assertEquals (person1, database.getElements ()[0]);

   }@Test(expected = OperationNotSupportedException.class)
    public void testConstructorEmptyData() throws OperationNotSupportedException {
        Database database = new Database ();

    }@Test(expected = OperationNotSupportedException.class)
    public void testConstructorMoreData() throws OperationNotSupportedException {
    Person[] person = new Person[17];
        Database database = new Database (person);

    }
    @Test
    public void testAddValid() throws OperationNotSupportedException {
      Database database = new Database (person1);
      database.add (person2);
      database.add (person3);
      Assert.assertEquals (3 ,database.getElements ().length);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testAddInValid() throws OperationNotSupportedException {
        Database database = new Database (person1);
        database.add (person0);
    }
    @Test
    public void testRemove() throws OperationNotSupportedException {
    Database database = new Database (person1, person2);
    database.remove ();
    Assert.assertEquals (1, database.getElements ().length);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveWhitNullData() throws OperationNotSupportedException {
        Database database = new Database ();
        database.remove ();
        Assert.assertEquals (0, database.getElements ().length);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameUsernameNull() throws OperationNotSupportedException {
       String username = null;
       Database database = new Database (person1, person2, person3);
       database.findByUsername (username);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameWhithMorePeople() throws OperationNotSupportedException {
        String username = "Stambe";
        Database database = new Database (person1, person2, person3);
        database.findByUsername (username);
    }@Test
    public void testFindByUsername() throws OperationNotSupportedException {
        String username = "Strahil";
        Database database = new Database (person1, person2, person3);
        people.add (database.findByUsername (username));
        Assert.assertEquals (username, people.get (0).getUsername ());
    }@Test(expected = OperationNotSupportedException.class)
    public void testFindByIDWhithMorePeople() throws OperationNotSupportedException {
        int id = 236;
        Database database = new Database (person1, person2, person3);
        database.findById (236);
    }@Test
    public void testFindByID() throws OperationNotSupportedException {
        int id = 235;
        Database database = new Database (person1, person2, person3);
        people.add (database.findById (id));
        Assert.assertEquals (id, people.get (0).getId ());
    }
}
