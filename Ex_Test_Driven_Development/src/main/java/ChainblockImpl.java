import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ChainblockImpl implements Chainblock{
    private Map<Integer, Transaction> transactionMap;

    public ChainblockImpl() {
        this.transactionMap = new TreeMap<> ();
    }

    public int getCount() {
        return transactionMap.size ();
    }
    public void add(Transaction transaction) {
        transactionMap.putIfAbsent (transaction.getId (), transaction);
    }
    public boolean contains(Transaction transaction) {
        return transactionMap.containsKey (transaction.getId ());
    }
    public boolean contains(int id) {
        return transactionMap.containsKey (id);
    }
    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        if(transactionMap.containsKey (id)){
            transactionMap.get (id).setStatus (newStatus);
        }else {
            throw new IllegalArgumentException("Invalid Id");
        }
    }
    public void removeTransactionById(int id) {
        if(transactionMap.containsKey (id)){
            transactionMap.remove (id);
        }else {
            throw new IllegalArgumentException("Invali Id");
        }
    }
    public Transaction getById(int id) {
        if(transactionMap.containsKey (id)){
            return transactionMap.get (id);
        }else {
            throw new IllegalArgumentException("Invalid Id");
        }
    }
    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {
        List<Transaction> transactionList = new ArrayList<> ();
        for(Map.Entry<Integer, Transaction> out: transactionMap.entrySet () ){
            if(out.getValue ().getStatus ().equals (status)){
                transactionList.add (out.getValue ());
            }
        }if(transactionList.size () > 0){
            return transactionList.stream ().sorted (Comparator.comparing (Transaction::getAmount).reversed ())
                    .collect(Collectors.toList());
        }else {
            throw new IllegalArgumentException("No Transaction Whit this Status");        }
    }

    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        List<Transaction> sendeList = new ArrayList<> ();
        List<Transaction> sendeList1 = new ArrayList<> ();
        List<String> sendeList2 = new ArrayList<> ();
        for(Map.Entry<Integer, Transaction> out: transactionMap.entrySet ()){
            if(out.getValue ().getStatus ().equals (status)){
                sendeList.add (out.getValue ());
            }
        }sendeList1 = sendeList.stream ().sorted (Comparator.comparing (Transaction::getAmount)).collect(Collectors.toList());
        for(Transaction out: sendeList1){
            sendeList2.add (out.getFrom ());
        }
        if(sendeList2.size () != 0){
            return sendeList2;
        }else {
            throw new IllegalArgumentException("Not a SUCCESSFUL Transaction");
        }
    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        List<Transaction> sendeList = new ArrayList<> ();
        List<Transaction> sendeList1 = new ArrayList<> ();
        List<String> sendeList2 = new ArrayList<> ();
        for(Map.Entry<Integer, Transaction> out: transactionMap.entrySet ()){
            if(out.getValue ().getStatus ().equals (status)){
                sendeList.add (out.getValue ());
            }
        }sendeList1 = sendeList.stream ().sorted (Comparator.comparing (Transaction::getAmount)).collect(Collectors.toList());
        for(Transaction out: sendeList1){
            sendeList2.add (out.getTo ());
        }
        if(sendeList2.size () != 0){
            return sendeList2;
        }else {
            throw new IllegalArgumentException("Not a SUCCESSFUL Transaction");
        }
    }
    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {
      return   transactionMap.values ().stream ()
                .sorted (Comparator.comparing (Transaction::getAmount).reversed ()).collect(Collectors.toList());
    }
    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        List<Transaction> transactionList = new ArrayList<> ();
        for(Map.Entry<Integer,Transaction> out: transactionMap.entrySet ()){
            if(out.getValue ().getFrom ().equals (sender)){
                transactionList.add (out.getValue ());
            }
        }if(transactionList.size () != 0){
            return transactionList.stream ().sorted (Comparator.comparing (Transaction::getAmount).reversed ())
                    .collect(Collectors.toList());
        }else {
            throw new IllegalArgumentException("Not Transaction whit this Sender");
        }
    }
    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        List<Transaction> list = new ArrayList<> ();
        for(Map.Entry<Integer, Transaction> out: transactionMap.entrySet ()){
            if(out.getValue ().getTo ().equals (receiver)){
                list.add (out.getValue ());
            }
        }if(!list.isEmpty ()){
            return list.stream ().sorted (Comparator.comparing (Transaction::getAmount)).collect(Collectors.toList());
        }else {
            throw new IllegalArgumentException("Not Transaction whit this Receiver");
        }

    }
    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        return transactionMap.values ().stream ()
                .filter (f -> f.getStatus ().equals (status) && f.getAmount () <= amount)
                .sorted (Comparator.comparing (Transaction::getAmount).reversed ())
                .collect(Collectors.toList());
    }
    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        List<Transaction> list = new ArrayList<> ();
        for(Map.Entry<Integer, Transaction> out: transactionMap.entrySet ()){
            if(out.getValue ().getFrom ().equals (sender) && out.getValue ().getAmount () > amount){
                list.add (out.getValue ());
            }
        }if(!list.isEmpty ()){
            return list.stream ().sorted (Comparator.comparing (Transaction::getAmount).reversed ()).collect(Collectors.toList());
        }else {
            throw new IllegalArgumentException ("No Transaction");
        }
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        List<Transaction> list = new ArrayList<> ();
        for(Map.Entry<Integer, Transaction> out: transactionMap.entrySet ()){
            if(out.getValue ().getTo ().equals (receiver) && out.getValue ().getAmount () >= lo &&
                    out.getValue ().getAmount () < hi ){
                list.add (out.getValue ());
            }
        }if(!list.isEmpty ()){
            return list.stream ().sorted (Comparator.comparing (Transaction::getAmount).reversed ()).collect(Collectors.toList());
        }else {
            throw new IllegalArgumentException ("No Transaction");
        }
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return transactionMap.values ().stream ()
                .filter (f -> f.getAmount () >= lo && f.getAmount () <= hi)
                .collect(Collectors.toList());

    }

    public Iterator<Transaction> iterator() {
        return transactionMap.values ().iterator ();
    }
}
