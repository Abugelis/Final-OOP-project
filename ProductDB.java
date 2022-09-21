// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

import java.util.Map;
import java.util.HashMap;

public class ProductDB {

    protected Map<Integer, Product> db = new HashMap<Integer, Product>();

    public void addToDB(Product product){
        db.put(product.getProductID(),product);
    }

    public void removeFromDB(int productID){
        db.remove(productID);
    }

    public Product searchMap(int productID){
        return db.get(productID);
    }
    public void printDB(){
        System.out.println(db);
    }
}
