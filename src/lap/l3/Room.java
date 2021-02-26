package lap.l3;

import java.util.ArrayList;

public class Room {
    String tenroom;
    String vitri;
    ArrayList<String> user;
    public Room() {
        user = new ArrayList<String>();
    }

    public String getTenroom() {
        return tenroom;
    }

    public void setTenroom(String tenroom) {
        this.tenroom = tenroom;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }



    public void add(String u){
        user.add(u);;
    };
    public void remove(String u){
        user.remove(u);
    }
    public void Print(){
    System.out.println("Ten phong: "+ getTenroom());
    System.out.println("Vi tri: "+ getVitri());
    for(String x:user){
        System.out.println(x);
    }
    }
}
