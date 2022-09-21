// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

public class OrderDetails {

    protected Product product;
    protected int quantity;

    public OrderDetails(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity = quantity;
    }
}
