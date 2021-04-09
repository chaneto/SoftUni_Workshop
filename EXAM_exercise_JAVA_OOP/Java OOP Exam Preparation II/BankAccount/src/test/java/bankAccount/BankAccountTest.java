package bankAccount;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class BankAccountTest {
    BankAccount bankAccount;
    BigDecimal bigDecimal = new BigDecimal (500);
    BigDecimal bigDecimal1 = new BigDecimal (1000);
    BigDecimal bigDecimal2= new BigDecimal (-700);
    BigDecimal bigDecimal3= new BigDecimal (0);
    @Before
    public void setup(){
        bankAccount = new BankAccount ("Petko", bigDecimal);
    }@Test
    public void testget(){
        String name = "Petko";
        Assert.assertEquals (name, bankAccount.getName ());
        Assert.assertEquals (bankAccount.getBalance (), bigDecimal);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testSEtnameWithInvalitName(){
        bankAccount = new BankAccount ("g", bigDecimal);
    }@Test
    public void testSEtname(){
        bankAccount = new BankAccount ("Toshko", bigDecimal);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetBalanceWithInvalitBalance(){
        bankAccount = new BankAccount ("Gosho", bigDecimal2);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void testDepositWithInvalidSum(){
        bankAccount.deposit (bigDecimal2);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void testDepositWithNull(){
        bankAccount.deposit (bigDecimal3);
    }
    @Test
    public void testDeposit(){
        bankAccount.deposit (bigDecimal);
        Assert.assertEquals (bigDecimal1, bankAccount.getBalance ());
    }
    @Test(expected = UnsupportedOperationException.class)
    public void testDrawWithInvalidSum(){
        bankAccount.withdraw (bigDecimal2);
    }
    @Test
    public void testDraw(){
        bankAccount = new BankAccount ("Petko", bigDecimal1);
       BigDecimal bigDecimalCurrent =  bankAccount.withdraw (bigDecimal);
       Assert.assertEquals (bankAccount.getBalance (), bigDecimal);
        Assert.assertEquals (bigDecimalCurrent, bigDecimal);

    }
    @Test(expected = UnsupportedOperationException.class)
    public void testDrawInvalid1(){
        bankAccount = new BankAccount ("Petko", bigDecimal);
        bankAccount.withdraw (bigDecimal1);
        BigDecimal bigDecimalcurrent = new BigDecimal (-500);
        Assert.assertEquals (bankAccount.getBalance (), bigDecimalcurrent);
        bankAccount.withdraw (bigDecimal);

    }
}