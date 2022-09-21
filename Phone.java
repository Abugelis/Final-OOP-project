// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

public class Phone extends Product {

    enum Make{SAMSUNG, APPLE, NOKIA};

    private Make make;
    private String model;
    private int storage;

    public Phone(ProductDB products,Make make, String model, String name, int storage, String description, double price){
        super(name, description, price);
        products.addToDB(this);
        this.make = make;
        this.model = model;
        this.storage = storage;

    }

    public void setMake(Make make) {
        this.make = make;
    }

    public Make getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setName(String name){
        super.name = name;
    }
    public String getName(){
        return super.name;
    }

    @Override
    public void print() {
        System.out.println(getMake() + " " + getModel() + " " + getName() + " " +  getStorage() + "GB. Specifications: " + getDescription() + ". Price: " +getPrice());
    }
}
