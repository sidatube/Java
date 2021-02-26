package As.a3.b1;

public class main {
    public static void main (String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        p1.setId(1);
        p1.setProName("Toy");;
        p1.setQty(100);
        p1.setPrice(100000);
        p2.setId(2);
        p2.setProName("Toy toy");;
        p2.setQty(10);
        p2.setPrice(200000);
        p3.setId(3);
        p3.setProName("Iron Toy");;
        p3.setQty(0);
        p3.setPrice(1000000);
        p1.check();
        p2.check();
        p3.check();


    }
}
