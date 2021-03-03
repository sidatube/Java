package lap.l5;

import java.util.ArrayList;
import java.util.Scanner;

public class Giaovien extends Person{
    ArrayList<String> DSL =new ArrayList<String>() ;
    double luong;
    int soMon;
    ArrayList<String> CMDD= new ArrayList<String>();

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getSoMon() {
        return soMon;
    }

    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }

    @Override
    public void input() {
        //super.input();
        String m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong: ");
        setLuong(sc.nextDouble());
        System.out.println("Nhap cac lop day:(Nhap 'end' de ket thuc nhap) ");


        System.out.println("Nhap cac mon day:(Nhap 'End' de ket thuc nhap) ");
        do {

            m=sc.nextLine();
            if (m!="End")DSL.add(m);
        }while (m!="End");
        setSoMon(CMDD.size());
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Danh sach lop: ");
        for (String x:DSL
             ) {
            System.out.println(x);
        }
        System.out.println("So mon day: "+this.getSoMon());
        System.out.println("Danh sach mon: ");
        for (String x:CMDD
             ) {
            System.out.println(x);
        }


    }
}
