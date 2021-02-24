package As.a2;

import java.util.Scanner;

public class phanso {
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
    public phanso add(phanso ft){
        int tutong = this.getTuso()*ft.getMauso()+ft.getTuso()*this.getMauso();
        int mautong = this.getMauso()*ft.getMauso();
        phanso tong =new phanso();
        tong.setTuso(tutong);
        tong.setMauso(mautong);
        tong.rutGon();
        return tong;
    }
    public phanso sub(phanso ft){
        int tu = this.getTuso()*ft.getMauso()-ft.getTuso()*this.getMauso();
        int mau = this.getMauso()*ft.getMauso();
        phanso hieu =new phanso();
        hieu.setTuso(tu);
        hieu.setMauso(mau);
        hieu.rutGon();
        return hieu;
    }
    public phanso mul(phanso ft){
        int tu = this.getTuso()*ft.getTuso();
        int mau = this.getMauso()*ft.getMauso();
        phanso tich = new phanso();
        tich.setTuso(tu);
        tich.setMauso(mau);
        tich.rutGon();
        return  tich;
    }
    public phanso div(phanso ft){
        int tu = this.getTuso()*ft.getMauso();
        int mau = this.getMauso()*ft.getTuso();
        phanso thuong = new phanso();
        thuong.setTuso(tu);
        thuong.setMauso(mau);
        thuong.rutGon();
        return  thuong;
    }
}
