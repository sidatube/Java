package As.a2;

import java.util.Scanner;

public class As2 {
    private int tuso;
    private int mauso;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    private int tuso2;
    private  int mauso2;

    public int getTuso2() {
        return tuso2;
    }

    public void setTuso2(int tuso2) {
        this.tuso2 = tuso2;
    }

    public int getMauso2() {
        return mauso2;
    }

    public void setMauso2(int mauso2) {
        this.mauso2 = mauso2;
    }

    public void inPS(){
        System.out.println("Phan so 1 la: "+getTuso()+"/"+getMauso());
        System.out.println("Phan so 2 la: "+getTuso2()+"/"+getMauso2());
    }
    public  int UCLN(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while (a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    public  void rutGon(int a , int b){
        if(a==0){
            System.out.println("Phan so thu 1 khong the rut gon");
        }else {
            int c = UCLN(a, b);
            a = a / c;
            b = b / c;
            System.out.println( a + "/" + b);
        }
    }
    public  void nghichDao(int a,int b){
        if(a==0){
            System.out.println("Phan so thu 1 ko co phan so nghich dao");
        }else{
            System.out.println("Phan so ngich dao cua phan so la: "+b+"/"+a);
        }

    }
    public void add(){
        int tutong = tuso*mauso2+tuso2*mauso;
        int mautong = mauso*mauso2;
        rutGon(tutong,mautong);
    }
    public void sub(){
        int tuhieu = tuso*mauso2-tuso2*mauso;
        int mauhieu = mauso*mauso2;
        rutGon(tuhieu,mauhieu);
    }
    public void mul(){
        int tutich=tuso*tuso2;
        int mautich=mauso*mauso2;
        rutGon(tutich,mautich);
    }
    public void div(){
        int tuthuong=tuso*mauso2;
        int mauthuong=mauso*tuso2;
        rutGon(tuthuong,mauthuong);
    }
}
