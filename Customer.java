// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

import java.util.ArrayList;

public class Customer<T> {

    private String name;
    private String address;
    ArrayList<T> order = new ArrayList<>();

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address = address;
    }

    public void addToOrder(int index){
        order.add(index, (T) order);
    }
    public void removeFromOrder( int index){
        order.remove(index);
    }
    public void getOrder(int index){
        order.get(index);
    }
}
