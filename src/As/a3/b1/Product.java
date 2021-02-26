package As.a3.b1;

public class Product {
    private int id;
    private String proName;
    private int qty;
    private double price;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if (qty>=0){
            this.qty = qty;
        }else{
            this.qty=0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=0){
            this.price = price;
        }else {
            this.price=0;
        }

    }
    public boolean check(){
        if(getQty()>0){
            System.out.println("San pham "+getProName()+" con: "+getQty());
            return  true;
        } System.out.println("San pham "+getProName()+" het hang !!!");
        return  false;
    }



}
