package As.a3.b2;

import As.a3.b1.Product;

import java.util.ArrayList;

public class Cart {
    private int id;
    private String customer;
    private double grandTotal;
    private ArrayList<Product> productList;
    private String city;

    public Cart() {
        productList = new ArrayList<Product>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public boolean addProduct(Product pd){
        if(pd.check()   ){
            getProductList().add(pd);
            pd.setQty(pd.getQty()-1);
            setGrandTotal(getGrandTotal()+pd.getPrice());
            return true;
        }
        return false;
    }

    public void removeProduct(int index){
        Product p = productList.get(index);
        p.setQty(p.getQty()+1);
        getProductList().remove(index);
        setGrandTotal(getGrandTotal()-p.getPrice());
    }

    public boolean checkCity(){
        return getCity() == "HN" || getCity() == "HCM";
    }

    public double finalGrandTotal(){
        if(checkCity()){
            return  getGrandTotal()+ getGrandTotal()*1/100;
        }
        return  getGrandTotal() +  getGrandTotal() * 2/100;
    }

}
