// Student: Edvinas Grotuzas, Student No.: R00206284, Group: SDH2-B

public class Test {
    public static void main(String[] args) {

        ProductDB productDatabase = new ProductDB();

        Phone p1 = new Phone(productDatabase, Phone.Make.SAMSUNG, "A71", "Flagship", 64, "An economy type phone for everyday use", 230.99);
        Phone p2 = new Phone(productDatabase, Phone.Make.APPLE, "12", "Flagship", 128, "HDR display, A15 Bionic chip, iOS 15  ", 1230.99);
        Phone p3 = new Phone(productDatabase, Phone.Make.NOKIA, "3310", "Invincible", 0, "Indestructible Phone, Chuck Norris approved", 12.99);
        Phone p4 = new Phone(productDatabase, Phone.Make.NOKIA, "Lumia", "550", 8, "Worst phone on the market to this day", 0.99);

        TV t1 = new TV(productDatabase,"LG", "G1", "Smart LED TV", TV.Type.LED,"LG 4K SELF-LIT LED evo – true brilliance in clarity of content", 1599.99);
        TV t2 = new TV(productDatabase,"Samsung", "QN900A", "Neo",TV.Type.LCD,"Edge-to-edge viewing on the endlessly stunning Infinity Screen",450.99);
        TV t3= new TV(productDatabase,"LG", "WNS88", "MadeupTV", TV.Type.LCD, "Best not existent TV ever made", 10000.99);

        OrderDetails phones = new OrderDetails(p2,5);
        OrderDetails tvs = new OrderDetails(t1, 2);
        OrderDetails anothertv = new OrderDetails(t3, 1);

        Order bigOrder = new Order();
        bigOrder.addToList(phones);
        bigOrder.addToList(tvs);
        bigOrder.addToList(anothertv);

        System.out.println(bigOrder);

        Customer custOrder = new Customer("John","Cork");
        custOrder.addToOrder(0);

        productDatabase.printDB();

    }
}
