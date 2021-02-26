package As.a3.b2;

import As.a3.b1.Product;

public class main {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setId(1);
        p1.setPrice(15000);
        p1.setProName("Dong ho Rolex");
        p1.setQty(2);
        Product p2 = new Product();
        p2.setId(2);
        p2.setPrice(3000);
        p2.setProName("Vay thoi trang");
        p2.setQty(5);

        Cart c = new Cart();
        c.setId(1);
        c.setCustomer("Nguyen Van A");
        c.setCity("hai duong");
        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p2);
        c.addProduct(p2);
        // 15000 *2 + 3000*3 = 39000 -> 39000 + 390 = 39390


        System.out.println("Danh sach san pham:");
        for (Product p : c.getProductList()){
            System.out.println(p.getId()+"- "+p.getProName()+"-"+p.getPrice());
        }
        System.out.println("Tong tien:"+c.finalGrandTotal());
    }
}
