import org.junit.Before;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class ChainblockImplTest {
    private Chainblock transactions;
    private Chainblock transactionsFull;
    private Transaction transaction;
    private Transaction transaction1;
    private Transaction transaction2;
    @Before
    public void setup(){
        transactions = new ChainblockImpl ();
        transaction = new TransactionImpl (345, TransactionStatus.FAILED, "Petko", "Pesho", 50.00);
        transaction1 = new TransactionImpl (789, TransactionStatus.FAILED, "Gosho", "Pesho", 50.00);
        transaction2 = new TransactionImpl (123, TransactionStatus.SUCCESSFUL, "Gosho", "Pencho", 150.00);
    }
    public  Chainblock setTransactionsFull(Chainblock chainblock){
        chainblock.add (transaction);
        chainblock.add (transaction1);
        chainblock.add (transaction2);
        return chainblock;
    }
    @Test
    public void testAddTransaction(){
        if(!transactions.contains (transaction.getId ())){
        transactions.add (transaction);
        }
        assertEquals (1, transactions.getCount ());
    }
    @Test
    public void testAddTransactionFalse(){
        if(!transactions.contains (transaction.getId ())){
            transactions.add (transaction);
            transactions.add (transaction);
        }
        assertEquals (1, transactions.getCount ());
    }
    @Test
    public void testConteinsTransactionTrue(){
        transactions.add (transaction);
        assertTrue (transactions.contains (transaction));
    }
    @Test
    public void testContainsIdTrue(){
        transactions.add (transaction);
        int id = transaction.getId ();
        assertTrue (transactions.contains (id));
    }
    @Test
    public void testGetCount(){
        setTransactionsFull (transactions);
        assertEquals (3, transactions.getCount ());
    }
    @Test
    public void testchangeTransactionStatusWhitValidId(){
        transactions.add (transaction);
        transactions.add (transaction1);
        int id = transaction.getId ();
        TransactionStatus transactionStatus = TransactionStatus.SUCCESSFUL;
        assertTrue (transactions.contains (id));
        transactions.changeTransactionStatus (id, transactionStatus);
        assertEquals (transactionStatus, transaction.getStatus ());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testchangeTransactionStatusWhitInValidId(){
        transactions.add (transaction);
        int id = transaction1.getId ();
        TransactionStatus transactionStatus = TransactionStatus.SUCCESSFUL;
        transactions.changeTransactionStatus (id, transactionStatus);
        assertEquals (transactionStatus, transaction.getStatus ());
    }
    @Test
    public void testRemoveTransactionByValidId(){
    setTransactionsFull (transactions);
    int id = transaction.getId ();
    assertTrue (transactions.contains (id));
    transactions.removeTransactionById (id);
    assertEquals (2, transactions.getCount ());
    assertFalse (transactions.contains (id));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveTransactionByInValidId(){
        transactions.add (transaction);
        int id = transaction1.getId ();
        transactions.removeTransactionById (id);
        assertEquals (1, transactions.getCount ());
    }
    @Test
    public void testGetByIdWhitValidId(){
        setTransactionsFull (transactions);
        int id = transaction.getId ();
        assertTrue (transactions.contains (id));
        Transaction transactionOut = transactions.getById (id);
        assertTrue (equals (transactionOut, transaction));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetByIdWhitInValidId(){
        transactions.add (transaction);
        int id = transaction1.getId ();
        Transaction transactionOut = transactions.getById (id);
        assertTrue (equals (transactionOut, transaction));
    }
    @Test
    public void getByTransactionStatusTrue(){
        setTransactionsFull (transactions);
        TransactionStatus transactionStatus = TransactionStatus.FAILED;
        List<Transaction> transactionOut = (List<Transaction>) transactions.getByTransactionStatus (transactionStatus);
        int count = 0;
        assertEquals (2,transactionOut.size ());

    }
    @Test(expected = IllegalArgumentException.class)
    public void getByTransactionStatusFalse(){
        transactions.add (transaction);
        setTransactionsFull (transactions);
        TransactionStatus transactionStatus = TransactionStatus.ABORTED;
        Iterable<Transaction> transactionOut =  transactions.getByTransactionStatus (transactionStatus);
    }
    @Test
    public void testGetAllSendersWithTransactionStatus(){
        setTransactionsFull (transactions);
        TransactionStatus transactionStatus = TransactionStatus.SUCCESSFUL;
        List<String> out = (List<String>) transactions.getAllSendersWithTransactionStatus (transactionStatus);
        assertEquals (1,out.size ());

    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetAllSendersWithTransactionStatusWhitOutTransaction(){
        transactions.add (transaction);
        transactions.add (transaction1);
        TransactionStatus transactionStatus = TransactionStatus.SUCCESSFUL;
        List<String> out = (List<String>) transactions.getAllSendersWithTransactionStatus (transactionStatus);
        assertEquals (0,out.size ());

    }
    @Test
    public void testgetAllReceiversWithTransactionStatus(){
        setTransactionsFull (transactions);
        TransactionStatus transactionStatus = TransactionStatus.FAILED;
        List<String> out = (List<String>) transactions.getAllReceiversWithTransactionStatus (transactionStatus);
        assertEquals (2, out.size ());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testgetAllReceiversWithTransactionStatusWhitOutTransaction(){
        transactions.add (transaction);
        transactions.add (transaction1);
        TransactionStatus transactionStatus = TransactionStatus.SUCCESSFUL;
        List<String> out = (List<String>) transactions.getAllReceiversWithTransactionStatus (transactionStatus);
        assertEquals (0, out.size ());
    }
    @Test
    public void testGetAllOrderedByAmountDescendingThenById(){
      setTransactionsFull (transactions);
        List<Transaction> list = (List<Transaction>) transactions.getAllOrderedByAmountDescendingThenById ();
        assertEquals (3, list.size ());
        assertTrue (equals (list.get (0),transaction2));
        assertTrue (equals (list.get (1),transaction));
        assertTrue (equals (list.get (2),transaction1));
    }
    @Test
    public void testgetBySenderOrderedByAmountDescending(){
        setTransactionsFull (transactions);
        String sender = "Gosho";
        List<Transaction> list = (List<Transaction>) transactions.getBySenderOrderedByAmountDescending (sender);
        assertEquals (2, list.size ());
        assertTrue (equals (list.get (0), transaction2));
        assertTrue (equals (list.get (1), transaction1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testgetBySenderOrderedByAmountDescendingWhitoutValidSender(){
        setTransactionsFull (transactions);
        String sender = "Boncho";
        List<Transaction> list = (List<Transaction>) transactions.getBySenderOrderedByAmountDescending (sender);
    }
    @Test
    public void testGetByReceiverOrderedByAmountThenById(){
       setTransactionsFull (transactions);
        String receiver = "Pesho";
        List<Transaction> list = (List<Transaction>) transactions.getByReceiverOrderedByAmountThenById (receiver);
        assertEquals (2, list.size ());
        assertTrue (equals (list.get (0), transaction));
        assertTrue (equals (list.get (1), transaction1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetByReceiverOrderedByAmountThenByIdWhitOutTransaction(){
        setTransactionsFull (transactions);
        String receiver = "Boncho";
        List<Transaction> list = (List<Transaction>) transactions.getByReceiverOrderedByAmountThenById (receiver);
        assertEquals (2, list.size ());
        assertTrue (equals (list.get (0), transaction));
        assertTrue (equals (list.get (1), transaction1));
    }
    @Test
    public void testGetByTransactionStatusAndMaximumAmount(){
      setTransactionsFull (transactions);
        TransactionStatus transactionStatus = TransactionStatus.FAILED;
        double sumMax = 50;
        List<Transaction> list = (List<Transaction>)
                transactions.getByTransactionStatusAndMaximumAmount (transactionStatus, sumMax);
        assertEquals (2, list.size ());
        assertTrue (equals (list.get (0), transaction));
        assertTrue (equals (list.get (1), transaction1));
    }
    @Test
    public void testGetBySenderAndMinimumAmountDescending(){
    setTransactionsFull (transactions);
        String sender = "Gosho";
        double sum = 49;
        List<Transaction> list = (List<Transaction>)
                transactions.getBySenderAndMinimumAmountDescending (sender, sum);
        assertEquals (2, list.size ());
        assertTrue (equals (list.get (0), transaction2));
        assertTrue (equals (list.get (1), transaction1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetBySenderAndMinimumAmountDescendingWhitOutTransaction(){
        setTransactionsFull (transactions);
        String sender = "Boncho";
        double sum = 49;
        List<Transaction> list = (List<Transaction>)
                transactions.getBySenderAndMinimumAmountDescending (sender, sum);
        assertEquals (0, list.size ());
    }
    @Test
    public void testGetByReceiverAndAmountRange(){
        setTransactionsFull (transactions);
        String receiever = "Pesho";
        double lo = 50;
        double hi = 151;
        List<Transaction> list = (List<Transaction>)
                transactions.getByReceiverAndAmountRange (receiever, lo, hi);
        assertEquals (2, list.size ());
        assertTrue (equals (list.get (0), transaction));
        assertTrue (equals (list.get (1), transaction1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetByReceiverAndAmountRangeWhitOutTransaction(){
        setTransactionsFull (transactions);
        String receiever = "Boncho";
        double lo = 50;
        double hi = 151;
        List<Transaction> list = (List<Transaction>)
                transactions.getByReceiverAndAmountRange (receiever, lo, hi);
        assertEquals (0, list.size ());
    }
    @Test
    public void testGetAllInAmountRange(){
       setTransactionsFull (transactions);
        double lo = 50;
        double hi = 150;
        List<Transaction> list =
                (List<Transaction>) transactions.getAllInAmountRange (lo, hi);
        assertEquals (3, list.size ());
    }
    @Test
    public void testReturnAll(){
        setTransactionsFull (transactions);
        Iterator<Transaction> list = transactions.iterator ();
        int count = 0;
        while (list.hasNext ()){
            list.next ();
            count++;
        }
        assertEquals (transactions.getCount (), count);
    }

    public static boolean equals(Transaction transaction, Transaction transaction1){
        return (transaction.getId () == transaction1.getId () && transaction.getStatus ().equals (transaction1.getStatus () )&&
                transaction.getFrom ().equals (transaction1.getFrom () )&& transaction.getTo ().equals (transaction1.getTo ())&&
                       transaction.getAmount () == transaction1.getAmount ());
    }

}