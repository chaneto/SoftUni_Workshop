package C11_solidLab.p02_OpenClosedPrinciple.p03_ShoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        OrderItem orderItem = new OrderItem ("EACHCheesse", 2);
        OrderItem orderItem1 = new OrderItem ("SPECIALSalam", 3);
        OrderItem orderItem2 = new OrderItem ("Salam", 10);
        Cart cart = new Cart ();
        cart.setCustmerEmail ("Chaneto_80");
        cart.add (orderItem);
        cart.add (orderItem1);
        cart.add (orderItem2);
        OnlineOrder onlineOrder = new OnlineOrder (cart);
        System.out.println (cart.getCustmerEmail ());
        onlineOrder.chekout ();
        System.out.println ("Totalprise - " + cart.getTotalAmount () + "lv.");
    }
}
