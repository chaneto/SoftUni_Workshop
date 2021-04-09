package C11_solidLab.p02_OpenClosedPrinciple.p03_ShoppingCart;

public abstract class Order {
    protected final Cart cart;

    protected Order(Cart cart)
    {
        this.cart = cart;
    }
    void chekout(){
        for(OrderItem out : cart.getItems ()){
            System.out.println (out.getProduct () + " - " + out.getQuantity () + "kg.");
        }
    }
}
