package As.a6;

public class Main {
    public static void main(String[] args){
        MonHocDaiCuong m1 = new MonHocDaiCuong();
        m1.themLop("T2008A",4);
        m1.themLop("T2008M",3);
        m1.themLop("T2009M",5);
        m1.addhs("T2008M","BBT1");
        m1.addhs("T2008M","BCT2");
        m1.addhs("T2008M","BCT3");
        m1.addhs("T2008M","BCT4");
        m1.addhs("T2008A","BCTthua");
        m1.addhs("T2008A","BCT5");
        m1.addhs("T2008A","BCT6");
        m1.addhs("T2008A","BCT7");


        m1.xoaLop("T2009M");
        m1.inDanhSach();
        m1.sapXep();
        m1.inDanhSach();


    }
}
