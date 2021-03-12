package Kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotellis {
    ArrayList<Hotel> ht ;

    public Hotellis() {
        ht = new ArrayList<Hotel>() ;
        ht.add(new Hotel("AB1","Ha Noi","Bui Chi Thanh"));
        ht.add(new Hotel("DE2","Hai Phong","Nguyen Chi Thanh"));
        ht.add(new Hotel("GH3","Da Nang","Do ChiThanh"));
        ht.add(new Hotel("SD4","Hai Duong","DinhTienThanh"));
        ht.add(new Hotel("IH5","Nha Trang","DuongHoangLai"));
        ht.add(new Hotel("FZ6","Hue","Quoach Thanh Vu"));
        ht.add(new Hotel("ZR7","Ho Chi Minh","Vu Do Tran"));
        ht.add(new Hotel("BG8","Sai Gon","Thien Hoang Phuc"));
        ht.add(new Hotel("GR9","Ha Noi","Vo Ba Vuong"));
        ht.add(new Hotel("AG10","Ha Loong","Ngu Thich Gay"));
    }


    public void Timoc(String m){
        for (Hotel x: ht){

            if(x.getOwener().equals(m)){
                System.out.println("Owner's name: "+x.getOwener());
                System.out.println("Hotel's name: "+x.getName());
                System.out.println("Location: "+x.getLocation());
                return;
            }

        }
        System.out.println("Khong co trong danh sach");
    }
}
