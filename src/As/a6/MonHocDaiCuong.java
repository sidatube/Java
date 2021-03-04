package As.a6;

import javafx.scene.chart.BubbleChart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc{
    ArrayList<Danhsachlop> danhSachLopHoc;

    public MonHocDaiCuong() {
        danhSachLopHoc = new ArrayList<Danhsachlop>();
    }

    @Override
    public void themLop(String name, int soluonghs) {
        for (Danhsachlop x:danhSachLopHoc
             ) {
            if (x.getTenLop().equals(name)){
                System.out.println("Da co lop "+name);
                return;
            }
        }
        Danhsachlop p = new Danhsachlop(name,soluonghs)  ;
        danhSachLopHoc.add(p);

    }

    @Override
    public void xoaLop(String name) {
        for (Danhsachlop x: danhSachLopHoc){
            if (x.getTenLop().equals(name)){
                danhSachLopHoc.remove(x);
                return;
            }
        }
        System.out.println("khong co lop "+name);

    }

    @Override
    public void sapXep() {
        Collections.sort(danhSachLopHoc, new Comparator<Danhsachlop>() {
            @Override
            public int compare(Danhsachlop o1, Danhsachlop o2) {
                return o1.getSoHocSinh().compareTo(o2.getSoHocSinh());
            }
        });

    }

    @Override
    public void inDanhSach() {
        for (int i=0;i<danhSachLopHoc.size();i++){
            System.out.println("Lop"+danhSachLopHoc.get(i).getTenLop()+":");
            System.out.println("So hoc sinh: "+danhSachLopHoc.get(i).getSoHocSinh());
            System.out.println("Danh sach hoc sinh: ");
            for(String x:danhSachLopHoc.get(i).Hocsinh){
                System.out.println(x);
            }

        }

    }
    public void addhs(String name,String tenhs){
        for (Danhsachlop p:danhSachLopHoc){
            if (p.getTenLop().equals(name)){
                if (p.getSoHocSinh()>p.Hocsinh.size()){
                    p.addHocsinh(tenhs);
                    return;
                }


            }
        }
        System.out.println("Khong thay lop "+name);
    }
}
