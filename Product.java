// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

public class Product {

    private int productID;
    protected String name;
    private String description;
    private double price;
    private static int id = 1;

    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
        productID = id;
        id++;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description = description;
    }

    public int getProductID() {
        return this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price = price;
    }

    public void print(){

    }
}
