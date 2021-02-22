package lap.l1;



public class Lap1 {
    int code;
    String name;
    double money;
    int qty;
    String unit;
    void changeqty(int q){
        qty +=q;
    }
    void changemoney(double p){
        money=p;
    }
    boolean checkhang(){
        if (qty>0) return true;
        return false;
    }
    void run(){
        System.out.println(code+","+name+","+money+"đ"+","+"Số lượng:"+qty+unit);
    }
}
