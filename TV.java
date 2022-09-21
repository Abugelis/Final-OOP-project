// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

public class TV extends Product{

    enum Type{ LCD, LED};

    private String make;
    private String model;
    protected Type type;

    public TV(ProductDB products,String make, String model, String name, Type type, String description, double price) {
        super(name, description, price);
        products.addToDB(this);
        this.make = make;
        this.model = model;
        this.type = type;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model = model;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name = name;
    }

    @Override
    public void print() {
    }
}
