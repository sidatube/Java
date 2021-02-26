package lap.l4.b2;

import java.util.ArrayList;

public class Lophoc {
    int maLop;
    String tenLop;
    String phongHoc;
    ArrayList<Sinhvien> DSSV;

    public Lophoc() {
        DSSV = new ArrayList<Sinhvien>();
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public ArrayList<Sinhvien> getDSSV(){
        return DSSV;
    }
    public void addSV(Sinhvien sv){
        getDSSV().add(sv);
    }

    public void kickSV(int index){
        getDSSV().remove(index);


    }

    public void printSV(){
        for(Sinhvien i:getDSSV()){
            System.out.println(i.getMaSo()+"-"+i.getName()+"-"+i.getDiaChi()+"-"+i.getSdt());
        }
    }
}
