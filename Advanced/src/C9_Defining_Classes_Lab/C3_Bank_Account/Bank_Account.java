package C9_Defining_Classes_Lab.C3_Bank_Account;


public class Bank_Account {
    private static Double Interestrate = 0.02;
    private static int account_counter = 0;

    private Integer id;
    private Double balance;

    public Bank_Account(){
        account_counter++;
        this.id = account_counter;
        this.balance = 0.0;
    }

    public static Double getInterestrate() {
        return Interestrate;
    }

    public Integer getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public static void setInterestrate(Double interestrate) {
        Interestrate = interestrate;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double balance) {
        this.balance = balance;
    }
    public double getCurrentBlanane(int nummeryears){
        return this.balance * Interestrate * nummeryears;
    }
}
