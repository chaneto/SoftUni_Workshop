package C11_solidLab.p02_OpenClosedPrinciple.p03_ShoppingCart;

public class OrderItem {
    private String product;
    private int Quantity;

    public OrderItem(String product, int quantity) {
        this.product = product;
        Quantity = quantity;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
