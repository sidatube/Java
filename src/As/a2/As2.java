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
        this.mauso = mauso!=0?mauso:1;
    }

    public  void nhapPS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so");
        setMauso(sc.nextInt());
        System.out.println("Nhap mau so");
        setMauso(sc.nextInt());
    }

    public void inPS(){
        System.out.println("Phan so 1 la: "+getTuso()+"/"+getMauso());
    }
    public  int UCLN(){
        for(int i=Math.min(getTuso(),getMauso());i>0;i--){
            if(getTuso()%i==0&&getTuso()%i==0)return i;

        }
        return 1;
    }
    public void rutGon(){
        // tim UCLN cua tu so va mau so
        int ucln = UCLN();
        setTuso(getTuso()/ucln);
        setMauso(getMauso()/ucln);
    }
    public  void nghichDao(){
        int ms= getMauso();
        if(getTuso()!=0){
            setMauso(getTuso());
            setTuso(ms);
        }else{
            System.out.println("Khong the nghich dao");
        }

    }
    public As2 add(As2 ft){
        int tutong = this.getTuso()*ft.getMauso()+ft.getTuso()*this.getMauso();
        int mautong = this.getMauso()*ft.getMauso();
        As2 tong =new As2();
        tong.setTuso(tutong);
        tong.setMauso(mautong);
        tong.rutGon();
        return tong;
    }
    public As2 sub(As2 ft){
        int tu = this.getTuso()*ft.getMauso()-ft.getTuso()*this.getMauso();
        int mau = this.getMauso()*ft.getMauso();
        As2 hieu =new As2();
        hieu.setTuso(tu);
        hieu.setMauso(mau);
        hieu.rutGon();
        return hieu;
    }
    public As2 mul(As2 ft){
        int tu = this.getTuso()*ft.getTuso();
        int mau = this.getMauso()*ft.getMauso();
        As2 tich = new As2();
        tich.setTuso(tu);
        tich.setMauso(mau);
        tich.rutGon();
        return  tich;
    }
    public As2 div(As2 ft){
        int tu = this.getTuso()*ft.getMauso();
        int mau = this.getMauso()*ft.getTuso();
        As2 thuong = new As2();
        thuong.setTuso(tu);
        thuong.setMauso(mau);
        thuong.rutGon();
        return  thuong;
    }
}
