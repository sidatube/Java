package lap.l4.b2;

public class Main {
    public static void main(String[] args){
        Sinhvien s1 = new Sinhvien();
        s1.setMaSo(1);
        s1.setName("BCT");
        s1.setDiaChi("HN");
        s1.setSdt("0972813473");

        Sinhvien s2 = new Sinhvien();
        s2.setMaSo(2);
        s2.setName("HAT");
        s2.setDiaChi("HN");
        s2.setSdt("0978541325");

        Sinhvien s3 = new Sinhvien();
        s3.setMaSo(3);
        s3.setName("CVQ");
        s3.setDiaChi("HN");
        s3.setSdt("0965435523");

        Sinhvien s4 = new Sinhvien();
        s4.setMaSo(4);
        s4.setName("Gay");
        s4.setDiaChi("HN");
        s4.setSdt("0954162473");

        Lophoc lop = new Lophoc();
        lop.setMaLop(1);
        lop.setTenLop("T2008M");
        lop.setPhongHoc("A8");

        lop.addSV(s1);
        lop.addSV(s2);
        lop.addSV(s3);
        lop.addSV(s4);

        lop.kickSV(2);

        lop.printSV();
    }
}
