// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

import java.util.ArrayList;

public class Order {

    private ArrayList<OrderDetails> orderList = new ArrayList<OrderDetails>();

    public void  addToList(OrderDetails details){
        orderList.add(details);
    }
    public void removeFromList(int position){
        orderList.remove(position);
    }
    public OrderDetails searchOrder(int position){
        return orderList.get(position);
    }
}
