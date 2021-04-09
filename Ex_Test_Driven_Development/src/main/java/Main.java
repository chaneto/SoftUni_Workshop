import com.sun.javafx.collections.MappingChange;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Chainblock chainblock = new ChainblockImpl ();
      Transaction  transaction = new TransactionImpl (345, TransactionStatus.FAILED, "Petko", "Pesho", 100.00);
      Transaction transaction1 = new TransactionImpl (789, TransactionStatus.FAILED, "Gosho", "Ponio", 50.00);
      Transaction   transaction2 = new TransactionImpl (123, TransactionStatus.SUCCESSFUL, "Tencho", "Pencho", 150.00);
      chainblock.add (transaction);
      chainblock.add (transaction1);
      chainblock.add (transaction2);
      List<Transaction> list = (List<Transaction>) chainblock.
              getByTransactionStatusAndMaximumAmount (TransactionStatus.FAILED, 150);
        System.out.println ();

    }
}
