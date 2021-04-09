package C9_Defining_Classes_Lab.C3_Bank_Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Bank_Account> map = new HashMap<> ();
        while (true){
            String[] input = scanner.nextLine ().split (" ");
            String comand = input[0];
            if(comand.equals ("End")){
                break;
            }
            if(comand.equals ("Create")){
                Bank_Account bank = new Bank_Account ();
                map.put (bank.getId (),bank);
                System.out.printf ("Account ID%d created%n",bank.getId ());
            }
            else if(comand.equals ("Deposit")){
                int IDnummer = Integer.parseInt (input[1]);
                double sumdeposit = Double.parseDouble (input[2]);
                if(!map.containsKey (IDnummer)){
                    System.out.println ("Account does not exist");
                }else {
                    Double sum = map.get (IDnummer).getBalance ();
                    sum += sumdeposit;
                    map.get (IDnummer).setBalance (sum);
                    System.out.printf ("Deposited %.0f to ID%d%n",sumdeposit,IDnummer);
                }

            }else if(comand.equals ("SetInterest")) {
                double rate = Double.parseDouble (input[1]);
                Bank_Account.setInterestrate (rate);

            }else if(comand.equals ("GetInterest")){
                int IDntnummer = Integer.parseInt (input[1]);
                int nummeryears = Integer.parseInt (input[2]);
                if(!map.containsKey (IDntnummer)){
                    System.out.println ("Account does not exist");
                }else {
                    map.get (IDntnummer).getCurrentBlanane (nummeryears);
                    map.put (IDntnummer,map.get (IDntnummer));
                    System.out.printf ("%.2f%n",map.get (IDntnummer).getCurrentBlanane (nummeryears));
                }
            }
        }
    }
}
