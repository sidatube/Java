package lap.l8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList ds = new ArrayList();
        Vietnam vn = new Vietnam(1,"BCT","24/12/2019",153,"Sinh hoat");
        Vietnam vn2 = new Vietnam(2,"BC2","24/12/2019",53,"Kinh doanh");
        Vietnam vn3 = new Vietnam(3,"BC3","24/12/2019",42,"Sinh hoat");
        Vietnam vn4 = new Vietnam(4,"BC4","24/12/2019",352,"San xuat");
        Ngoaiquoc nq = new Ngoaiquoc(1,"CCC","24/12/2019",135,"My");
        Ngoaiquoc nq2 = new Ngoaiquoc(2,"CC2","24/12/2019",62,"Hoa ki");
        Ngoaiquoc nq3 = new Ngoaiquoc(3,"CC3","24/12/2019",42,"Tau khua");
        ds.add(vn);
        ds.add(nq2);
        ds.add(vn2);
        ds.add(nq3);
        ds.add(vn4);
        ds.add(nq);
        ds.add(vn3);

        /// xuat danh sach:
        System.out.println("Print");
        for (int i=0;i< ds.size();i++){
            if (ds.get(i) instanceof Vietnam) {
                System.out.println("ID: "+((Vietnam) ds.get(i)).getCode()+"-"+((Vietnam) ds.get(i)).getName()+"-"+((Vietnam) ds.get(i)).getSoluong()+"-"+((Vietnam) ds.get(i)).getDoiTuong());
            }else if (ds.get(i) instanceof  Ngoaiquoc){
                System.out.println("ID: "+((Ngoaiquoc) ds.get(i)).getCode()+"-"+((Ngoaiquoc) ds.get(i)).getName()+"-"+((Ngoaiquoc) ds.get(i)).getSoluong()+"-"+((Ngoaiquoc) ds.get(i)).getQuoctich());
            }
        }
        ///tong + print
        for (int i=0;i<ds.size();i++){
            if(ds.get(i) instanceof Vietnam){
                System.out.println("tong tien: "+((Vietnam) ds.get(i)).thanhtien());
            }else if(ds.get(i) instanceof Ngoaiquoc) {
                System.out.println("tong tien: "+((Ngoaiquoc) ds.get(i)).thanhtien());
            }
        }
        //tb nq
        int vd=0;
        double ss=0;
        for (int i=0;i<ds.size();i++){
            if(ds.get(i) instanceof Ngoaiquoc) {
                ss = ss + ((Ngoaiquoc)ds.get(i)).thanhtien();
                vd++;

            }
        }

        System.out.println("tong "+ss +"- size: "+vd);
        if (ss!=0){
            double tb=ss/vd;
            System.out.println("Trung binh thanh tien: "+tb);

        }


    }
}
